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

    ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    ArrayList<String> preparo = new ArrayList<>();

    public RecheioDeChocolate(Bolo bolo) {
        this.bolo = bolo;
        infoBolo(bolo.getPeso(), bolo.getTipo(), bolo.getIngredientes(), bolo.getValidade());

        ingredientes.add(new Ingrediente("Amido de milho", 4, "colher(es) (sopa)"));
        ingredientes.add(new Ingrediente("Chocolate em pó", 6, "colher(es) (sopa)"));
        ingredientes.add(new Ingrediente("Gema", 1, "unidade(s)"));
        ingredientes.add(new Ingrediente("Lata de leite condensado", 1, "unidade(s)"));
        ingredientes.add(new Ingrediente("Lata de creme leite", 1, "unidade(s)"));

        preparo.add("Em uma panela coloque todos os ingredientes menos o creme de leite. Leve para o fogo médio, mexa até engrossar");
        preparo.add("Retire do fogo, deixe esfriar");
        preparo.add("Depois de frio coloque o creme em uma batedeira, junte o creme de leite, bata até ficar homogêneo");
    }

    @Override
    public void prepararMassa() {
        bolo.prepararMassa();
    }

    @Override
    public void rechear() {
        bolo.rechear();
        System.out.println("Ingredientes:");
        ingredientes.forEach((ingrediente) -> {
            System.out.println(ingrediente.getQuantidade() + " " + ingrediente.getUnidadeDeMedida() + " " + ingrediente.getNome());
        });

        System.out.println();
        System.out.println("Modo de Preparo:");
        preparo.forEach((preparo) -> {
            System.out.println(preparo);
        });

    }

}
