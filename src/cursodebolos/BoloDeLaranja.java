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
public class BoloDeLaranja extends Bolo{
    public BoloDeLaranja(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade){
        super(peso, tipo, ingredientes, validade);
    }    

    @Override
    public void prepararMassa() {
        System.out.println("Modo de Preparo:");
        System.out.println("Bata no liquidificador os ovos, o açúcar, o óleo, o suco e a casca da laranja.");
        System.out.println("Passe para uma tigela e acrescente a farinha de trigo e o fermento. Bata a massa até ficar uniforme.");
        System.out.println("Leve para assar em uma forma com furo central, untada e enfarinhada, por mais ou menos 30 minutos.");
    }

    @Override
    public void rechear() {
        //...
    }
    
}
