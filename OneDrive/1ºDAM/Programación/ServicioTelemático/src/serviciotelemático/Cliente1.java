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
public class Cliente1 extends Usuario implements Operaciones, Oferta1 {

    static double precioSegundos = 0.2;
    int segundos;
    double importe = 0;

    public Cliente1(String dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public void conexion(int s) {
        segundos = s;
    }

    @Override
    public double importe() {

       importe=contabilizar();
        return importe;

    }

    @Override
    public void reset() {
        importe = 0;
    }

    @Override
    public double contabilizar() {

        double total=0;
        if (segundos > 180) {

            int segundosConCoste = segundos - 180;
            total= segundosConCoste * precioSegundos;

        }
        return total;
    }

}
