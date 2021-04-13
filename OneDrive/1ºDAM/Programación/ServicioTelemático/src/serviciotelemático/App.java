/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciotelemático;

/**
 *
 * @author Usuario
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //    public Cliente1(String dni, String nombre) {

        Cliente1 c1= new Cliente1("7969894857V", "Juan");
        Cliente2 c2 = new Cliente2("654981654M", "Maria");
        SuperCliente s1= new SuperCliente("987198119K", "Alfonso");
        
        c1.conexion(400);
        System.out.println(c1.importe());
        
        c2.conexion(400);
        System.out.println(c2.importe());
        
        s1.conexion(400);
        System.out.println(s1.importe());
        
    }
    
}
