/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Ingrediente;
import model.Bolo;
import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class BoloDeLaranja extends Bolo {

    public BoloDeLaranja(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade, boolean recheio) {
        infoBolo(peso, tipo, ingredientes, validade, recheio, this.getReceita());
    }

    @Override
    public void prepararMassa() {
        ArrayList<String> receita = this.getReceita();
        receita.add("Modo de Preparo:");
        receita.add("Bata no liquidificador os ovos, o açúcar, o óleo, o suco e a casca da laranja.");
        receita.add("Passe para uma tigela e acrescente a farinha de trigo e o fermento. Bata a massa até ficar uniforme.");
        receita.add("Leve para assar em uma forma com furo central, untada e enfarinhada, por mais ou menos 30 minutos. \n");
    }

    @Override
    public void rechear() {}

}
