package src.jogo;
import java.util.ArrayList;
import java.util.List;


public class MissaoRecompensa{
    private Boolean quest;
    private String nomeMissao;
    private int nivelMissao;
    private List<String> drops;
    private List<String> recompensas;


    public MissaoRecompensa(String nomeMissao, int nivelMissao){
        this.nomeMissao = nomeMissao;
        this.nivelMissao = nivelMissao;
        drops = new ArrayList<>();
        recompensas = new ArrayList<>();

    }
    public void adicionarDrop(String drop){
        drops.add(drop);
    }
    public void adicionarRecompensa(String recompensa){
        recompensas.add(recompensa);
    }
    //GETTERS AND SETTERS

    public String getNomeMissao() {
        return nomeMissao;
    }
    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }
    public int getNivelMissao() {
        return nivelMissao;
    }
    public void setNivelMissao(int nivelMissao) {
        this.nivelMissao = nivelMissao;
    }
    public List<String> getDrops() {
        return drops;
    }
    public void setDrops(List<String> drops) {
        this.drops = drops;
    }
    public List<String> getRecompensas() {
        return recompensas;
    }
    public void setRecompensas(List<String> recompensas) {
        this.recompensas = recompensas;
    }
            
    public void receberLuvasDoPoder(String cidadeDestino) {
        if (verificarConexao(cidadeAtual, cidadeDestino)) {
            if (cidadeAtual.equals(cidadeDestino)) {
                pesoPedra += 4;
                limiarPoderJóia += 2;
            } else {
                System.out.println("Você ainda não chegou à cidade de destino.");
            }
        } else {
            System.out.println("Não é possível receber as luvas do poder. Cidades não conectadas.");
        }
    }

    public void receberBotasDoPoder(String cidadeDestino) {
        if (verificarConexao(cidadeAtual, cidadeDestino)) {
            if (cidadeAtual.equals(cidadeDestino)) {
                pesoPedra += 6;
                limiarPoderJóia += 1;
            } else {
                System.out.println("Você ainda não chegou à cidade de destino.");
            }
        } else {
            System.out.println("Não é possível receber as botas do poder. Cidades não conectadas.");
        }
    }

    public void receberGlóriaDosRetornados(String cidadeDestino) {
        if (verificarConexao(cidadeAtual, cidadeDestino)) {
            if (cidadeAtual.equals(cidadeDestino)) {
                pesoPedra += 1;
                limiarPoderJóia -= 4;
            } else {
                System.out.println("Você ainda não chegou à cidade de destino.");
            }
        } else {
            System.out.println("Não é possível receber a Glória dos Retornados. Cidades não conectadas.");
        }
    }
}   