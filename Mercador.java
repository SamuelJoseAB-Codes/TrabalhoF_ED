import java.util.Scanner;

public class Mercador {
    private int numMoedas;
    private String origem;
    private String destino;
    private boolean trocarMoedasPorLimiar;
    private boolean distanciaMenorQue3;

    public Mercador() {
        this.numMoedas = 0;
        this.origem = "";
        this.destino = "";
        this.trocarMoedasPorLimiar = false;
        this.distanciaMenorQue3 = false;
    }

    public void fazerPerguntas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas moedas de transporte você tem?");
        this.numMoedas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("De onde você vem?");
        this.origem = scanner.nextLine();

        System.out.println("Para onde você vai?");
        this.destino = scanner.nextLine();

        System.out.println("Deseja trocar suas moedas por limiar na jóia? (Responda com 'sim' ou 'não')");
        this.trocarMoedasPorLimiar = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.println("Distância é menor que 3? (Responda com 'sim' ou 'não')");
        this.distanciaMenorQue3 = scanner.nextLine().equalsIgnoreCase("sim");

        scanner.close();
    }

    public int calcularRecompensa() {
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

    public void exibirInformacoes() {
        System.out.println("Quantidade de moedas: " + numMoedas);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Trocar moedas por limiar na jóia: " + (trocarMoedasPorLimiar ? "Sim" : "Não"));
        System.out.println("Recompensa: " + calcularRecompensa() + " moedas");
    }
}