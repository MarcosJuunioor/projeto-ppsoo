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
public abstract class LojaDeBolos{
    //Método de fábrica
    public abstract Bolo criarBolo(String tipo);
    
    public Bolo pedirBolo(String tipo){
        Bolo bolo = criarBolo(tipo);
        bolo.prepararBolo();
        return bolo;
    }
}
