/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlCursoDeBolos;
import java.util.ArrayList;
import model.CursoDeBolos;
import model.CursoDeBolosTradicionais;
import model.TipoDeBolo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marcosantonio
 */
public class ViewInicial {

    public static void main(String[] args) {
        
        boolean done = false;
        int tipoBolo = 0;
        int tipoRecheio = 0;
        double peso = 0;
        boolean recheio = false;

        while (!done) {
            System.out.println("Receitas: ");
            System.out.println("1. Bolo de Trigo");
            System.out.println("2. Bolo de Laranja");
            System.out.println("3. Bolo de Mandioca \n");
            System.out.print("Escolha uma das receitas:");

            try {
                tipoBolo = new Scanner(System.in).nextInt();
                System.out.println();
            } catch (InputMismatchException ex) {
                System.out.println("Escolha uma das receitas disponíveis \n");
            }
             switch (tipoBolo) {
                case 1:
                    done = true;
                    break;

                case 2:
                    done = true;
                    break;

                case 3:
                    done = true;
                    break;
                    
                default:
                    System.out.println("Escolha uma das receitas disponíveis");
                    break;
            }

        }
        
        done = false; 
        while (!done) {
            System.out.println("Peso: ");

            try {
                peso = new Scanner(System.in).nextDouble();
                System.out.println();
                done = true;
            } catch (InputMismatchException ex) {
                System.out.println("Peso inválido! \n");
            }
        }
        
        done = false; 
        while (!done) {
            System.out.println("Recheio: ");
            System.out.println("1. Chocolate.");
            System.out.println("2. Limão.");
            System.out.println("3. Sem recheio.");

            try {
                tipoRecheio = new Scanner(System.in).nextInt();
                System.out.println();
            } catch (InputMismatchException ex) {
                System.out.println("Recheio inválido! \n");
            }
            
            switch (tipoRecheio) {
                case 1:
                    recheio = true;
                    done = true;
                    break;

                case 2:
                    recheio = true;
                    done = true;
                    break;

                case 3:
                    recheio = false;
                    done = true;
                    break;                    
                
                default:
                    System.out.println("Escolha uma das opções.");
                    break;
            }
        }
        
        ControlCursoDeBolos curso = new ControlCursoDeBolos(tipoBolo, recheio, peso, tipoRecheio);
        ArrayList<String> receita = curso.getReceita();
        
        for(String item: receita){
            System.out.println(item);
        }
        
    }
}
