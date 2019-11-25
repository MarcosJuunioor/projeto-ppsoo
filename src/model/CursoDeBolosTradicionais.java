/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Ingrediente;
import model.TipoDeBolo;
import model.CursoDeBolos;
import model.BoloDeTrigo;
import model.BoloDeMandioca;
import model.BoloDeLaranja;
import model.Bolo;
import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class CursoDeBolosTradicionais extends CursoDeBolos {

    @Override
    public Bolo criarBolo(String tipo, double pesoBolo, boolean recheio) {

        switch (tipo) {
            case TipoDeBolo.TRIGO: {
                ArrayList<Ingrediente> ingredientesBoloDeTrigo = new ArrayList<>();
                ingredientesBoloDeTrigo.add(new Ingrediente("farinha de trigo", 3 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeTrigo.add(new Ingrediente("açúcar", 2 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeTrigo.add(new Ingrediente("ovo(s)", 3 * pesoBolo, "unidade(s)"));
                ingredientesBoloDeTrigo.add(new Ingrediente("leite", 200 * pesoBolo, "mls"));
                ingredientesBoloDeTrigo.add(new Ingrediente("manteiga", 4 * pesoBolo, "colher(es) (sopa)"));
                ingredientesBoloDeTrigo.add(new Ingrediente("fermento biológico em pó", 1 * pesoBolo, "colher(es) (sopa)"));

                return new BoloDeTrigo(pesoBolo, "trigo", ingredientesBoloDeTrigo, 15, recheio);
            }

            case TipoDeBolo.LARANJA: {
                ArrayList<Ingrediente> ingredientesBoloDeLaranja = new ArrayList<>();
                ingredientesBoloDeLaranja.add(new Ingrediente("ovo(s)", 4 * pesoBolo, "unidade(s)"));
                ingredientesBoloDeLaranja.add(new Ingrediente("açúcar", 2 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeLaranja.add(new Ingrediente("óleo", 1 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeLaranja.add(new Ingrediente("laranja(suco)", 2 * pesoBolo, "unidade(s)"));
                ingredientesBoloDeLaranja.add(new Ingrediente("casca de laranja", 1 * pesoBolo, "unidade(s)"));
                ingredientesBoloDeLaranja.add(new Ingrediente("farinha de trigo", 2 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeLaranja.add(new Ingrediente("fermento", 1 * pesoBolo, "colher(es)"));

                return new BoloDeLaranja(pesoBolo, "laranja", ingredientesBoloDeLaranja, 10, recheio);
            }

            case TipoDeBolo.MANDIOCA: {
                ArrayList<Ingrediente> ingredientesBoloDeMandioca = new ArrayList<>();
                ingredientesBoloDeMandioca.add(new Ingrediente("mandioca ralada grossa", 3 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeMandioca.add(new Ingrediente("açúcar", 1.5 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeMandioca.add(new Ingrediente("manteiga", 3 * pesoBolo, "colher(es)"));
                ingredientesBoloDeMandioca.add(new Ingrediente("farinha de trigo", 1.5 * pesoBolo, "xícara(s)"));
                ingredientesBoloDeMandioca.add(new Ingrediente("ovo(s)", 4 * pesoBolo, "unidade(s)"));
                ingredientesBoloDeMandioca.add(new Ingrediente("coco ralado", 50 * pesoBolo, "gramas"));
                ingredientesBoloDeMandioca.add(new Ingrediente("queijo ralado", 50 * pesoBolo, "gramas"));
                ingredientesBoloDeMandioca.add(new Ingrediente("fermento em pó", 1 * pesoBolo, "colher(es) (sopa)"));

                return new BoloDeMandioca(pesoBolo, "mandioca", ingredientesBoloDeMandioca, 10, recheio);
            }

            default:
                return null;
        }
    }
}
