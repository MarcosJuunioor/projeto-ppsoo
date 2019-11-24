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
    
    public RecheioDeLimao(Bolo bolo) {
        this.bolo = bolo;
        infoBolo(bolo.getPeso(), bolo.getTipo(), bolo.getIngredientes(), bolo.getValidade(), bolo.isRecheio(), bolo.getReceita());
    }

    @Override
    public void prepararMassa() {
        bolo.prepararMassa();
    }

    @Override
    public void rechear() {
        bolo.rechear();
        //implementação...
    }

}
