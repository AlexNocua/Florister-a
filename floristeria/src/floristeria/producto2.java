/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floristeria;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie
 */
public class producto2 extends Floristeria {

    public producto2(String tipodeflor, String colordisponible1, String colordisponible2, String colordisponible3, String colordisponible4, int costounidad, int costoramo, int costoramode24) {
        super(tipodeflor, colordisponible1, colordisponible2, colordisponible3, colordisponible4, costounidad, costoramo, costoramode24);
    }

    public void mostrardatos() {
        JOptionPane.showMessageDialog(null, "⦁Tipo de flor:\n" + getTipodeflor() + "."
                + "\n⦁Colores dispobibles:\n" + getColordisponible1() + ", " + getColordisponible2() + ", " + getColordisponible3() + " y " + getColordisponible4() + "."
                + "\n⦁Costo de una unidad:\n" + getCostounidad() + " pesos."
                + "\n⦁Costo de un ramo de 12 " + getTipodeflor() + ":\n" + getCostoramo() + " pesos."
                + "\n⦁costo de un ramo de 24 " + getTipodeflor() + ":\n" + getCostoramode24() + " pesos.");
    }

}
