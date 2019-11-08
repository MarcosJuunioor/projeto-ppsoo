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
public class LojaDeBolosTradicionais extends LojaDeBolos{
    public Bolo criarBolo (String tipo) {
        if(tipo.equals("trigo")){
            return new BoloDeTrigo(600, 10, "trigo", "ingredientes de bolo de trigo...", 15);
        }else if(tipo.equals("mandioca")){
            return new BoloDeMandioca(700, 12, "mandioca", "ingredientes de bolo de mandioca...", 10);
        }else if(tipo.equals("laranja")){
            return new BoloDeLaranja(600, 12, "laranja", "ingredientes de bolo de laranja...", 15);
        }else return null;
    }
}