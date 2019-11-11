/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodebolos;

import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class CursoDeBolosTradicionais extends CursoDeBolos{
    public Bolo criarBolo(String tipo, double peso) {
        if(tipo.equals("trigo")){
            //Ingrediente trigo = new Ingrediente("trigo", );
            return new BoloDeTrigo(peso, "trigo", "ingredientes trigo", 15);
        }else if(tipo.equals("mandioca")){
            return new BoloDeMandioca(peso, "mandioca", "ingredientes mandioca", 10);
        }else if(tipo.equals("laranja")){
            return new BoloDeLaranja(peso, "laranja", "ingredientes laranja", 10);
        }else return null;
    }
}