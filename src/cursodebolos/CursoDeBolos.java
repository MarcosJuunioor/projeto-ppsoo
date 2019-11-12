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
public abstract class CursoDeBolos{
    //Método de fábrica
    public abstract Bolo criarBolo(String tipo, double peso);
    
    public void ensinar(String tipo, double peso){
        System.out.println("Bolo de "+tipo);
        Bolo bolo = criarBolo(tipo, peso);
        bolo.preparar();
    }
}
