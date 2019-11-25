/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.RecheioDecorator;
import model.Ingrediente;
import model.Bolo;
import java.util.ArrayList;

/**
 *
 * @author Wey
 */
public class RecheioDeChocolate extends RecheioDecorator {

    Bolo bolo;

    ArrayList<Ingrediente> ingredientesRecheio = new ArrayList<>();
    ArrayList<String> preparoRecheio = new ArrayList<>();

    public RecheioDeChocolate(Bolo bolo) {
        this.bolo = bolo;
        infoBolo(bolo.getPeso(), bolo.getTipo(), bolo.getIngredientes(), bolo.getValidade(), bolo.isRecheio(), bolo.getReceita());

        ingredientesRecheio.add(new Ingrediente("Amido de milho", 4*peso, "colher(es) (sopa)"));
        ingredientesRecheio.add(new Ingrediente("Chocolate em pó", 6*peso, "colher(es) (sopa)"));
        ingredientesRecheio.add(new Ingrediente("Gema", 1*peso, "unidade(s)"));
        ingredientesRecheio.add(new Ingrediente("Lata de leite condensado", 1*peso, "unidade(s)"));
        ingredientesRecheio.add(new Ingrediente("Lata de creme leite", 1*peso, "unidade(s)"));

        preparoRecheio.add("Em uma panela coloque todos os ingredientes menos o creme de leite. Leve para o fogo médio, mexa até engrossar");
        preparoRecheio.add("Retire do fogo, deixe esfriar");
        preparoRecheio.add("Depois de frio coloque o creme em uma batedeira, junte o creme de leite, bata até ficar homogêneo");
    }

    @Override
    public void prepararMassa() {
        this.bolo.prepararMassa();
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
