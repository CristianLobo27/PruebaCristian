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
public class Cliente2 extends Usuario implements Operaciones, Oferta2{
    
      static double precioSegundos = 0.2;
    int segundos;
    double importe = 0;
    
    
    public Cliente2(String dni, String nombre) {
        super(dni, nombre);
    }



    @Override
    public void conexion(int s) {
       segundos=s;
    }

    @Override
    public double importe() {
        importe=descuento();
        return importe;
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double descuento() {
        double descuento=0.1;
        double precio= (precioSegundos*segundos)*descuento;
        return precio;
    }
    
}
