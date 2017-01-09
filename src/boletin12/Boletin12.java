
package boletin12;

import javax.swing.JOptionPane;

//Añadiendo cambio para fork

public class Boletin12 {
    public static boolean haiEspacio = true;
    
    public static void main(String[] args) {
    
        Garaxe obx = new Garaxe();
        
        int opcion;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n1) Aparcar.\n2) Retirar.\n0)Sair."));
        switch(opcion){
            case 1:
                // Entrada de un coche
                
                break;
            case 2:
                // Retirada del coche 
                break;
            case 0: 
                JOptionPane.showMessageDialog(null,"Saindo.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion non valida.");
        }     
        }while(opcion!=0);
        
    }

   
}
