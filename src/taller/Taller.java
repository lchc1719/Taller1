/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller;


/**
 *
 * @author Luisk
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concursos obj = new Concursos();
        
       //m String[] mila = null;
        //obj.llamada();
        obj.anadirequipo();
        obj.anadirequipo();
        //obj.anadirequipo();
        obj.verequipo();
        boolean eliminarequipo = obj.eliminarequipo();
        obj.verequipo();

    
    }
    
}
