package src.jogo;
import java.util.Scanner;

public class Mercador {
    public void Perguntas(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas moedas de transporte você tem?");
        int numMoedas = scanner.nextInt();
        
        System.out.println("Distância é menor que 3? (Responda com 'sim' ou 'não')");
        boolean distanciaMenorQue3 = scanner.next().equalsIgnoreCase("sim");
        
        System.out.println("Deseja trocar suas moedas por limiar na jóia? (Responda com 'sim' ou 'não')");
        boolean trocarMoedasPorLimiar = scanner.next().equalsIgnoreCase("sim");
        
        int recompensa = calcularRecompensa(numMoedas, distanciaMenorQue3, trocarMoedasPorLimiar);
        System.out.println("Recompensa: " + recompensa + " moedas");

        scanner.close();
      }

       public static int calcularRecompensa(int numMoedas, boolean distanciaMenorQue3, boolean trocarMoedasPorLimiar) {
        if (numMoedas < 5) {
            if (distanciaMenorQue3) {
                if (trocarMoedasPorLimiar) {
                    // Perde 1 moeda e ganha 1 de limiar na jóia
                    return -1 + 1;
                } else {
                    // Perde 1 moeda
                    return -1;
                }
            } else {
                if (trocarMoedasPorLimiar) {
                    // Perde 1 moeda e ganha 2 de limiar na jóia
                    return -1 + 2;
                } else {
                    // Ganha 2 moedas
                    return 2;
                }
            }
        } else {
            if (distanciaMenorQue3) {
                if (trocarMoedasPorLimiar) {
                    // Perde 3 moedas e ganha 2 de limiar na jóia
                    return -3 + 2;
                } else {
                    // Perde 2 moedas
                    return -2;
                }
            } else {
                if (trocarMoedasPorLimiar) {
                    // Perde 1 moeda e ganha 3 de limiar na jóia
                    return -1 + 3;
                } else {
                    // Perde 3 moedas
                    return -3;
                }
            }
        }
    }
}
