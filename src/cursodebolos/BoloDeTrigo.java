/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodebolos;

import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class BoloDeTrigo extends Bolo {

    public BoloDeTrigo(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade) {
        infoBolo(peso, tipo, ingredientes, validade);
    }

    @Override
    public void prepararMassa() {
        System.out.println("Modo de Preparo:");
        System.out.println("Junte a manteiga, o açúcar e os ovos em uma tigela.");
        System.out.println("Em seguida misture tudo co ajuda de um batedor de arame (fouet).");
        System.out.println("Adicione o leite e misture mais um pouco.");
        System.out.println("Depois adicione toda a farinha de trigo e continue misturando até formar uma massa bem homogênea.");
        System.out.println("Despeje a mistura numa forma untada e enfarinhada.");
        System.out.println("Leve ao forno preaquecido, 180º, por cerca 40 minutos ou até dourar.");
        System.out.println("Para finalizar eu gosto de salpicar açúcar de confeiteiro por cima. \n");
    }

    @Override
    public void rechear() {
        System.out.println("Recheio:");
    }

}
