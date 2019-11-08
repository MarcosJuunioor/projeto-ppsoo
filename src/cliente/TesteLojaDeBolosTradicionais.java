/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import lojadebolos.LojaDeBolos;
import lojadebolos.LojaDeBolosTradicionais;

/**
 *
 * @author marcosantonio
 */
public class TesteLojaDeBolosTradicionais {
    public static void main(String[] args){
        LojaDeBolos loja = new LojaDeBolosTradicionais();
        loja.pedirBolo("trigo");
        System.out.println();
        loja.pedirBolo("laranja");
        System.out.println();
        loja.pedirBolo("mandioca");
    }
}
