/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.RecheioDeChocolate;
import model.Bolo;

/**
 *
 * @author marcosantonio
 */
public abstract class CursoDeBolos {

    //Método de fábrica
    public abstract Bolo criarBolo(String tipo, double peso, boolean recheio);

    public ArrayList<String> ensinar(String tipo, double peso, boolean recheio, int tipoRecheio) {
        System.out.println("Bolo de " + tipo);
        Bolo bolo = criarBolo(tipo, peso, recheio);
        if(recheio){
            if(tipoRecheio==1){
                Bolo bolo2 = new RecheioDeChocolate(bolo); //recheio de chocolate agora engloba o objeto do bolo de limão, adicionando mais recheio
                return bolo2.preparar();
            }else{
                Bolo bolo2 = new RecheioDeLimao(bolo); //recheio de chocolate agora engloba o objeto do bolo de limão, adicionando mais recheio
                return bolo2.preparar();
            }
            
        }else{
            return bolo.preparar();
        }
        
    }
}
