
package boletin12;

import java.util.Scanner;


public class Garaxe {
    private static int numeroCoches; // Numero de coches que están no garaxe nun instante
    private static final int CAPACIDADEMAXIMA=5;
    private final float PREZOMENOS3HORAS = 1.5f;
    private final float PREZOMAIS3HORAS = 0.2f;
// Constructores
    public Garaxe() {}
   
    
// Metodos de acceso

    public static int getCapacidadeMaxima() {
        return CAPACIDADEMAXIMA;
    }
    public int getNumeroCoches() {
        return numeroCoches;
    }
    
    
//Metodos
    
    public boolean comprobaEspacio(){
        /*
         * Comproba se hay prazas dispoñibles.
         * Muestra un mensaje de si hay o no hay plazas
         * Return:
         * true - Si hay plazas disponibles
         * false - Si no hay plazas disponibles
         */
        if(CAPACIDADEMAXIMA>=(numeroCoches+1)){
            //System.out.println((CAPACIDADEMAXIMA-numeroCoches+1)+"PRAZAS DISPOÑIBLES");
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
    public void factura (  Coche coch, int tempo, int aPagar, int pago, int volta){
        System.out.println("FACTURA");
        System.out.println("MATRICULA: "+coch.getMatricula());
        System.out.println("TEMPO:"+tempo);
        System.out.println("PRECIO:"+aPagar);
        System.out.println("CARTOS RECIBIDOS:"+pago);
        System.out.println("CARTOS DEVOLTOS:"+volta);
    }
    
}
