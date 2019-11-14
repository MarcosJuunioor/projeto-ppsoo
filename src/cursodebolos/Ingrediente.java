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
public class Ingrediente {
    private String nome;
    private double quantidade;
    private String unidadeDeMedida;
    
    public Ingrediente(String nome, double quantidade, String unidadeDeMedida){
        this.nome=nome;
        this.quantidade=quantidade;
        this.unidadeDeMedida=unidadeDeMedida;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the unidadeDeMedida
     */
    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    /**
     * @param unidadeDeMedida the unidadeDeMedida to set
     */
    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }
    
    
    
    
}
