package src.jogo;



public class Graph {

    // Listas que armazenam os vertices e arestas implementados no grafo;

    private ArrayList<Vertice> vertice = new ArrayList<Vertice>();
    private ArrayList<Aresta> aresta = new ArrayList<Aresta>();

    // metodos

    // insertVertice () metodo para inserir um vertice no grafo;

    public void insertVertice (City city) {
        Vertice node = new Vertice (city);
        this.vertice.add(node);
    }

    // insertAresta () metodo para inserir uma aresta no grafo;

    public void insertAresta (City inicio, City fim) {
        Vertice start = this.get(inicio);
        Vertice end = this.get(fim);

        Aresta arestaEntrada = new Aresta(start, end);
        start.insertSaida(arestaEntrada);
        end.insertEntrada(arestaEntrada);

        this.aresta.add(arestaEntrada);

        Aresta arestaSaida = new Aresta(end, start);
        start.insertEntrada(arestaSaida);
        end.insertSaida(arestaSaida);

        this.aresta.add(arestaSaida);
    }

    // get () retorna o vertice apartir do valor passado por paramentro;

    public Vertice get (City city) {
        Vertice data = null;

        for (int cont = 0; cont < this.vertice.getSize(); cont++) {
            if (this.vertice.get(cont).getCity() == city) {
                data = this.vertice.get(cont);
            }
        }

        return data;
    }
}