/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author socamporomani
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee asalariado;
        asalariado=new empleadoBuilder(73415 , "ALfonso")
                .setBirthDate(2)
                .setLastName("Rodrigo")
                .setBirthYear(1800)
                .createEmpleado();
        System.out.println(asalariado.toString());
        
    }
    
}
