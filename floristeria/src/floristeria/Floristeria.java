/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floristeria;

/**
 *
 * @author Angie
 */
public class Floristeria {

    private String tipodeflor;
    private String colordisponible1;
    private String colordisponible2;
    private String colordisponible3;
    private String colordisponible4;
    private int costounidad;
    private int costoramo;
    private int costoramode24;

    public Floristeria(String tipodeflor, String colordisponible1, String colordisponible2, String colordisponible3, String colordisponible4, int costounidad, int costoramo, int costoramode24) {

        this.tipodeflor = tipodeflor;
        this.colordisponible1 = colordisponible1;
        this.colordisponible2 = colordisponible2;
        this.colordisponible3 = colordisponible3;
        this.colordisponible4 = colordisponible4;
        this.costounidad = costounidad;
        this.costoramo = costoramo;
        this.costoramode24 = costoramode24;
    }

    public String getTipodeflor() {
        return tipodeflor;
    }

    public String getColordisponible1() {
        return colordisponible1;
    }

    public String getColordisponible2() {
        return colordisponible2;
    }

    public String getColordisponible3() {
        return colordisponible3;
    }

    public String getColordisponible4() {
        return colordisponible4;
    }

    public int getCostounidad() {
        return costounidad;
    }

    public int getCostoramo() {
        return costoramo;
    }

    public int getCostoramode24() {
        return costoramode24;
    }

}
