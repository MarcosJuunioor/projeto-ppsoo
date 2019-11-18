/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodebolos;

import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class BoloDeMandioca extends Bolo{
    public BoloDeMandioca(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade){
        infoBolo(peso, tipo, ingredientes, validade);
    }    

    @Override
    public void prepararMassa() {
        System.out.println("Modo de Preparo:");
        System.out.println("Bata a manteiga com o açúcar e os ovos, misture a mandioca ralada, junte a farinha e o fermento.");
        System.out.println("Por último, acrescente o coco e o queijo ralado.");  
        System.out.println("Asse em forma untada em forno preaquecido por 40 minutos. \n");
    }

    @Override
    public void rechear() {
        //...
    }
}
