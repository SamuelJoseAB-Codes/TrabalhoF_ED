package src.jogo;

public class City {
    String name;
    LimiarPedra pesoPedra;

    public City (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public LimiarPedra getPesoPedra() {
        return pesoPedra;
    }

    public void setPesoPedra(LimiarPedra pesoPedra) {
        this.pesoPedra = pesoPedra;
    }

    
}
