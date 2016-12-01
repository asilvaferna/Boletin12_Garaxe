
package boletin12;

import java.util.Scanner;


public class Garaxe {
    private static int numeroCoches; // Numero de coches que están no garaxe nun instante
    private static int capacidadeMaxima=5;
    private String matricula; // Pilla o numero de matricula
    private final float PREZOMENOS3HORAS = 1.5f;
    private final float PREZOMAIS3HORAS = 0.2f;

    public Garaxe() {}

    public Garaxe(String matricula) {
        this.matricula = matricula;
    }   
// Metodos de acceso

    public static int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public int getNumeroCoches() {
        return numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
//Metodos 
    public String introduceMatricula(){
        /*
         * Metodo para escanear la matricula del coche.
         */
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public boolean comprobaEspacio(){
        /*
         * Comproba se hay prazas dispoñibles.
         * Muestra un mensaje de si hay o no hay plazas
         * Return:
         * true - Si hay plazas disponibles
         * false - Si no hay plazas disponibles
         */
        if(capacidadeMaxima>=(numeroCoches+1)){
            System.out.println((capacidadeMaxima-numeroCoches+1)+"PRAZAS DISPOÑIBLES");
            numeroCoches++;
            return true;
        }else{
            System.out.println("COMPLETO");
            return false;
        }
    }
    
    public float  prezoEstacionamento(float horas){
        
        if(horas<3){
            return PREZOMENOS3HORAS; // Para menos de 3 horas se cobrara 1,50
        }else{
            horas=horas-3;
            if((int)horas==0)
               return (PREZOMENOS3HORAS+PREZOMAIS3HORAS);
            else
                return (PREZOMENOS3HORAS+(int)horas*PREZOMAIS3HORAS); // Para mas de 3 horas se cobrara 1,50 + 0,20*hora
        }
    }
    
    public void retirarCoche(){
        if (numeroCoches==0)
            System.out.println("Non pode retirar coches se non hai");
        numeroCoches--;
    }
    public void factura (){
        System.out.println("FACTURA");
        System.out.println("MATRICULA: "+matricula);
        System.out.println("TEMPO:");
        System.out.println("PRECIO:");
        System.out.println("CARTOS RECIBIDOS:");
        System.out.println("CARTOS DEVOLTOS:");
    }
    
}
