/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author alexc
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bolsa <Chocolate> bolsa = new Bolsa<Chocolate>(5);
        
        Chocolate c = new Chocolate("milka");
        Chocolate c1 = new Chocolate("milka");
        Chocolate c2 = new Chocolate("ferrero");
        
        Golosina g1 = new Golosina("gominola");
        Golosina g2 = new Golosina("chicle");
        
        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);
        
        
        for(Chocolate chocolate: bolsa){
            System.out.println(chocolate.getMarca());
        }
        
    }
    
}
