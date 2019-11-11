/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodebolos;

/**
 *
 * @author marcosantonio
 */
public class BoloDeMandioca extends Bolo{
    public BoloDeMandioca(double peso, String tipo, String ingredientes, int validade){
        super(peso, tipo, ingredientes, validade);
    }    

    @Override
    public void assar() {
        System.out.println("Assando bolo de "+this.getTipo()+" a 220ºc... Virando o lado a cada 5 min...");
    }
}
