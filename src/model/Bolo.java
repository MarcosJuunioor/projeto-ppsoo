/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Ingrediente;
import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public abstract class Bolo {

    private double peso;
    private String tipo;
    private ArrayList<Ingrediente> ingredientes;
    private int validade;
    private boolean recheio = true;

    public void infoBolo(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade) {
        this.peso = peso;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
        this.validade = validade;
    }

    //Método template
    public final void preparar() {
        reunirIngredientes();
        prepararMassa();
        if (this.recheio) {
            rechear();
       }
    }

    public void reunirIngredientes() {
        System.out.println("Ingredientes: ");
        for (Ingrediente ingrediente : this.ingredientes) {
            System.out.println(ingrediente.getQuantidade() + " " + ingrediente.getUnidadeDeMedida() + " " + ingrediente.getNome());
        }
    }

    ;
    
    public abstract void prepararMassa();

    public abstract void rechear();

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ingredientes
     */
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the validade
     */
    public int getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(int validade) {
        this.validade = validade;
    }

}
