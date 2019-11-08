/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadebolos;

/**
 *
 * @author marcosantonio
 */
public class BoloDeTrigo extends Bolo{ 


    public BoloDeTrigo(double peso, double preco, String tipo, String ingredientes, int validade){
        super(peso, preco, tipo, ingredientes, validade);
    }    

    @Override
    public void assar() {
        System.out.println("Assando bolo de "+this.getTipo()+" a 200ºc... Virando o lado a cada 10 min...");
    }

}
