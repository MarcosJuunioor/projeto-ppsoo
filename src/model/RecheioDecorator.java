/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Bolo;

/**
 *
 * @author Wey
 */
public abstract class RecheioDecorator extends Bolo {

    @Override
    public abstract void prepararMassa();

    @Override
    public abstract void rechear();

}
