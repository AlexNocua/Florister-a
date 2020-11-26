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
public class main {

    public static void main(String[] args) {
        producto1 ob1 = new producto1("Rosas", "Rojo", "Rosado", "Blanco", "Amarillo", 1500, 1500 * 10, 1500 * 20 - 1500 * 2);
        producto2 ob2 = new producto2("Lirios", "Blanco", "Rosado", "Morado", "Blanco con rosa", 3000, 3000 * 10, 3000 * 20 - 3000 * 4);
        ob1.mostrardatos();
        ob2.mostrardatos();
    }
}
