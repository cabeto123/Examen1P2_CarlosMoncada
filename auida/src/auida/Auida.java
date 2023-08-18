/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auida;

/**
 *
 * @author calol
 */
public class Auida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int random=0;
        while (random<70||random>100) {            
        random=(int) ((Math.random() * (12 - 1) + 1));
        random*=12;
        }
             
     
        System.out.println("random "+random);
    }
    
}
