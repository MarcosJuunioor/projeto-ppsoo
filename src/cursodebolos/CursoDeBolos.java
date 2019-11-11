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
    
    public void mostrarTutorial(String tipo, double peso){
        Bolo bolo = criarBolo(tipo, peso);
        bolo.prepararBolo();
    }
}
