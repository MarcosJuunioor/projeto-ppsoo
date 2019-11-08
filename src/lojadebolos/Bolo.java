/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadebolos;

/**
 *
 * @author marcosantonio
 */
public abstract class Bolo {
    private double peso;
    private double preco;
    private String tipo;
    private String ingredientes;
    private int validade;
    
    public Bolo(double peso, double preco, String tipo, String ingredientes, int validade){
        this.peso=peso;
        this.preco=preco;
        this.tipo=tipo;
        this.ingredientes=ingredientes;
        this.validade=validade;
    }
    
    //Método template
    public final void prepararBolo(){
        misturarIngredientes();
        
        Batedeira bat = Batedeira.getInstance();
        bat.encherBatedeira();
        bat.baterMassa();
        bat.esvaziarBatedeira();
        
        assar();
        empacotar();
    };
    
    public void empacotar(){
        System.out.println("Empacotando bolo de "+this.tipo+"... pronto.");
    }
    public void misturarIngredientes(){
        System.out.println("Misturando "+this.ingredientes);
    };
    public abstract void assar();
    
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
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
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
    public String getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(String ingredientes) {
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
