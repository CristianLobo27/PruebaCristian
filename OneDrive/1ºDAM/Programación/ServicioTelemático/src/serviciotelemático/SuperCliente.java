/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciotelemático;

import static serviciotelemático.Cliente1.precioSegundos;
import static serviciotelemático.Cliente2.precioSegundos;

/**
 *
 * @author Usuario
 */
public class SuperCliente extends Usuario implements Operaciones, Oferta1, Oferta2{
    
     static double precioSegundos = 0.2;
    int segundos;
    double importe = 0; 
    
    public SuperCliente(String dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public double contabilizar() {
        double total=0;
        if (segundos > 180) {

            int segundosConCoste = segundos - 180;
           importe= segundosConCoste * precioSegundos;

        }
        return importe;
    }

    @Override
    public double descuento() {
           double descuento=0.1;
       importe= importe*descuento;
        return importe;
    }

    @Override
    public void conexion(int s) {
        segundos=s;
    }

    @Override
    public double importe() {
        contabilizar();
        descuento();
        return importe;
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
