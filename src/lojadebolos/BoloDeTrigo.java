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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baterMassa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
