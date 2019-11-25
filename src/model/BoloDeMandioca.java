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
public class BoloDeMandioca extends Bolo{
    public BoloDeMandioca(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade, boolean recheio){
        infoBolo(peso, tipo, ingredientes, validade, recheio, this.getReceita());
    }    

    @Override
    public void prepararMassa() {
        ArrayList<String> receita = this.getReceita();
        receita.add("Modo de Preparo:");
        receita.add("Bata a manteiga com o açúcar e os ovos, misture a mandioca ralada, junte a farinha e o fermento.");
        receita.add("Por último, acrescente o coco e o queijo ralado.");  
        receita.add("Asse em forma untada em forno preaquecido por 40 minutos. \n");
    }

    @Override
    public void rechear() {}
}
