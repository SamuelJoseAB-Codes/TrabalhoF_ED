public class LimiarPedra{
    int pesoPedra;

    public LimiarPedra(int pesoPedra){
        this.pesoPedra = pesoPedra;
    }

    public int getPesoPedra() {
        return pesoPedra;
    }

    public void setPesoPedra(int pesoPedra) {
        this.pesoPedra = pesoPedra;
    }

    public void MudarPeso() {
        int quantidadePoder = getQuantidadePoder(cidadeAtual);
        pesoPedra += quantidadePoder;
    }
}