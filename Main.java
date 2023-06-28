import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args){    //Inicia a classe Map.java, que abre uma janela com o mapa-múndi
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Map();
            }
        });
        Game game = new Game(); // Inicializa a classe Game

        // Define os valores iniciais dos atributos
        game.setMoedasDTranporte(3);
        game.setMaxwell("Maxwell");

        // Exibe os valores iniciais dos atributos
        System.out.println("Moedas de Transporte: " + game.getMoedasDTranporte());
        System.out.println("Nome do Personagem: " + game.getMaxwell());
        Mercador mercador = new Mercador();
        mercador.fazerPerguntas();
        mercador.exibirInformacoes();
        // Iniciar as cidades do jogo
        City ubud = new City("Ubud");
        City cidade2 = new City("kingdom of legmond");
        City cidade3 = new City("Principality of Nekikh");
        City cidade4 = new City("Principality of Gritesthr");
        City cidade5 = new City("Protectorate of Dogrove");
        City cidade6 = new City("Kingdom of Lastwatch");
        City cidade7 = new City("Grand Duchy of Smalia");
        City cidade8 = new City("Kingdom of Oldcalia");
        City cidade9 = new City("Kingdom of Kalb");
        City cidade10 = new City("Aymar League");
        City cidade11 = new City("Defalsia");
        City cidade12 = new City("Vunese of Empire");
        City cidade13 = new City("Principality of Karhora");
        City cidade14 = new City("Chandir Sultanate");
        City cidade15 = new City("Bun ");
        City cidade16 = new City("Principality of Kasya");
        City cidade17 = new City("Nargumun");

        Graph grafo = new Graph(); //Inicia o grafo

        grafo.insertVertice(ubud);
        grafo.insertVertice(cidade2);
        grafo.insertVertice(cidade3);
        grafo.insertVertice(cidade4);
        grafo.insertVertice(cidade5);
        grafo.insertVertice(cidade6);
        grafo.insertVertice(cidade7);
        grafo.insertVertice(cidade8);
        grafo.insertVertice(cidade9);
        grafo.insertVertice(cidade10);
        grafo.insertVertice(cidade11);
        grafo.insertVertice(cidade12);
        grafo.insertVertice(cidade13);
        grafo.insertVertice(cidade14);
        grafo.insertVertice(cidade15);
        grafo.insertVertice(cidade16);
        grafo.insertVertice(cidade17);

        //abud
        grafo.insertAresta(ubud, cidade2);
        grafo.insertAresta(ubud, cidade3);

        //legmond
        grafo.insertAresta(cidade2, cidade3);
        grafo.insertAresta(cidade2, cidade8);
        grafo.insertAresta(cidade2, cidade5);

        //nekikh
        grafo.insertAresta(cidade3, cidade4);

        //gritestar
        grafo.insertAresta(cidade4, cidade5);
        grafo.insertAresta(cidade4, cidade6);

        //doggrove
        grafo.insertAresta(cidade5, cidade6);
        grafo.insertAresta(cidade5, cidade8);

        grafo.insertAresta(cidade6, cidade7);
        
        grafo.insertAresta(cidade8, cidade6);
        grafo.insertAresta(cidade8, cidade7);
        grafo.insertAresta(cidade8, cidade9);
        grafo.insertAresta(cidade8, cidade10);
        grafo.insertAresta(cidade8, cidade11);

        grafo.insertAresta(cidade9, cidade10);
        grafo.insertAresta(cidade9, cidade12);

        grafo.insertAresta(cidade9, cidade12);

        grafo.insertAresta(cidade11, cidade10);

        grafo.insertAresta(cidade10, cidade12);
        grafo.insertAresta(cidade10, cidade13);
        grafo.insertAresta(cidade10, cidade14);
        grafo.insertAresta(cidade10, cidade15);
        grafo.insertAresta(cidade10, cidade17);

        grafo.insertAresta(cidade13, cidade17);

        grafo.insertAresta(cidade14, cidade15);
        grafo.insertAresta(cidade14, cidade16);

        grafo.insertAresta(cidade15, cidade17);
        



        Vertice currentCity = grafo.get(ubud);

        for (int x = 0; x < currentCity.getSize(); x++) {
            System.out.println(x + "\t" + currentCity.getVertice(x).getEnd().getCity().getName());
        }


        
    }
}
