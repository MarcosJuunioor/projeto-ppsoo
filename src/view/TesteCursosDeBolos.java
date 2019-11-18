/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.CursoDeBolos;
import model.CursoDeBolosTradicionais;
import model.TipoDeBolo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marcosantonio
 */
public class TesteCursosDeBolos {

    public static void main(String[] args) {
        CursoDeBolos curso = new CursoDeBolosTradicionais();
        boolean done = false;
        int tipo = 0;

        while (!done) {
            System.out.println("1. Bolo de Trigo");
            System.out.println("2. Bolo de Laranja");
            System.out.println("3. Bolo de Mandioca \n");
            System.out.print("Escolha uma das receitas:");

            try {
                tipo = new Scanner(System.in).nextInt();
                System.out.println();
            } catch (InputMismatchException ex) {
                System.out.println("Escolha uma das receitas disponíveis \n");
            }

            switch (tipo) {
                case 1:
                    curso.ensinar(TipoDeBolo.TRIGO, 2);
                    done = true;

                    break;

                case 2:
                    curso.ensinar(TipoDeBolo.LARANJA, 1);
                    done = true;

                    break;

                case 3:
                    curso.ensinar(TipoDeBolo.MANDIOCA, 0.5);
                    done = true;

                    break;
                default:
                    System.out.println("Escolha uma das receitas disponíveis");

                    break;
            }

        }
    }
}
