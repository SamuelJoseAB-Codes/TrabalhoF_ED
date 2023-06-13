import java.util.ArrayList;
import java.util.List;


public class MissaoRecompensa{
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
            

}   