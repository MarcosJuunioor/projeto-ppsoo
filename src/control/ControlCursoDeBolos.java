/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.ArrayList;
import model.CursoDeBolos;
import model.CursoDeBolosTradicionais;
import model.TipoDeBolo;

/**
 *
 * @author ALUNO
 */
public class ControlCursoDeBolos {
    private int tipoBolo;
    private boolean recheio;
    private double peso;
    private int tipoRecheio;
    
    public ControlCursoDeBolos(int tipoBolo, boolean recheio, double peso, int tipoRecheio){
        this.tipoBolo=tipoBolo;
        this.recheio=recheio;
        this.peso=peso;
        this.tipoRecheio=tipoRecheio;
    }
    
    public ArrayList<String> getReceita(){
        CursoDeBolos curso = new CursoDeBolosTradicionais();
        
        switch (this.tipoBolo) {
                case 1:
                    return curso.ensinar(TipoDeBolo.TRIGO, peso, recheio, tipoRecheio);

                case 2:
                    return curso.ensinar(TipoDeBolo.LARANJA, peso, recheio, tipoRecheio);

                case 3:
                    return curso.ensinar(TipoDeBolo.MANDIOCA, peso, recheio, tipoRecheio);
                            
                
            }
        return curso.ensinar(TipoDeBolo.TRIGO, peso, recheio, tipoRecheio);
        
    }
    
}
