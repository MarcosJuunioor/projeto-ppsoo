/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import cursodebolos.CursoDeBolos;
import cursodebolos.CursoDeBolosTradicionais;

/**
 *
 * @author marcosantonio
 */
public class TesteCursosDeBolos {
    public static void main(String[] args){
        CursoDeBolos curso = new CursoDeBolosTradicionais();
        curso.ensinar("trigo", 2);
        System.out.println();
        curso.ensinar("laranja", 1);
        System.out.println();
        curso.ensinar("mandioca", 0.5);
    }
}
