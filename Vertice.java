package src.jogo;

;


public class Vertice {

    // atributos e listas da classe;

    private City city;
    private ArrayList<Aresta> entrada = new ArrayList<Aresta>();
    private ArrayList<Aresta> saida = new ArrayList<Aresta>();

    // constructor;

    public Vertice (City city) {
        this.city = city;
    }

    // get;

    public City getCity () {
        return this.city;
    }

    // methods;

    // insertEntrada () recebe uma aresta e adiciona a lista de entrada;

    public void insertEntrada (Aresta aresta) {
        this.entrada.add(aresta);
    }

    // insertEntrada () recebe uma aresta e adiciona a lista de saida;

    public void insertSaida (Aresta aresta) {
        this.saida.add(aresta);
    }

    public int getSize() {
        return saida.getSize();
    }

    public Aresta getVertice(int position) {
        return saida.get(position);
    }
}