

public class Aresta {

    // Atributos da classe, realiza a ligação entre 2 vertices;

    private Vertice start;
    private Vertice end;

    // construtor;

    public Aresta (Vertice start, Vertice end) {
        this.start = start;
        this.end = end;
    }

    // get;

    public Vertice getStart () {
        return this.start;
    }

    public Vertice getEnd () {
        return this.end;
    }
}