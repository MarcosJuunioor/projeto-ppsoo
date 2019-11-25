/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.RecheioDecorator;
import model.Bolo;
import java.util.ArrayList;

/**
 *
 * @author Wey
 */
public class RecheioDeLimao extends RecheioDecorator {

    Bolo bolo;

    ArrayList<Ingrediente> ingredientesRecheio = new ArrayList<>();
    ArrayList<String> preparoRecheio = new ArrayList<>();

    public RecheioDeLimao(Bolo bolo) {
        this.bolo = bolo;
        infoBolo(bolo.getPeso(), bolo.getTipo(), bolo.getIngredientes(), bolo.getValidade(), bolo.isRecheio(), bolo.getReceita());
        ingredientesRecheio.add(new Ingrediente("Suco de limao", 0.5 * this.getPeso(), "xícara(s)"));
        ingredientesRecheio.add(new Ingrediente("Lata de leite condensado", 1 * this.getPeso(), "unidade(s)"));
        ingredientesRecheio.add(new Ingrediente("Lata de creme leite", 0.5 * this.getPeso(), "unidade(s)"));
        ingredientesRecheio.add(new Ingrediente("Clara(s) em neve", 2* this.getPeso(), "unidade(s)"));
        ingredientesRecheio.add(new Ingrediente("Gelatina incolor", 1 * this.getPeso(), "colher(es) (sopa)"));

        preparoRecheio.add("A gelatina deverá ser dissolvida em 3 colheres (de sopa) de água.");
        preparoRecheio.add("Misture o leite condensado com o creme de leite e o suco de limão.");
        preparoRecheio.add("Junte a gelatina imediatamente após dissolvê-la. Delicadamente junte as claras em neve.");
    }

    @Override
    public void prepararMassa() {
        bolo.prepararMassa();
    }

    @Override
    public void rechear() {
        ArrayList<String> receita = this.getReceita();
        receita.add("Recheio:");
        receita.add("Ingredientes:");
        ingredientesRecheio.forEach((ingrediente) -> {
            receita.add(ingrediente.getQuantidade() + " " + ingrediente.getUnidadeDeMedida() + " " + ingrediente.getNome());
        });

        receita.add("Modo de Preparo:");
        preparoRecheio.forEach((preparo) -> {
            receita.add(preparo);
        });

    }

}
