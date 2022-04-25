package classes;
import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private int vitoria = 0;
    private int derrota = 0;
    private int empate = 0;
    // Construtores:
    public Time() {
        setNome("Richmond FC");
    }
    public Time(String nome, int vitoria, int derrota, int empate) {
        setNome(nome);
        setVitoria(vitoria);
        setDerrota(derrota);
        setEmpate(empate);
    }
    // Métodos:
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setJogadores(Jogador jogador) {
        jogadores.add(jogador);
    }
    public String getJogadores() {
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(jogadores.get(i).getNome());
        }
        if (jogadores.size() == 0) { return "Não há Jogadores no time!"; }
        else { return "São os jogadores do time!"; }
    }
    public void setVitoria(int vitoria) {
        this.vitoria += 1;
    }
    public int getVitoria() {
        return this.vitoria;
    }
    public void setDerrota(int derrota) {
        this.derrota += 1;
    }
    public int getDerrota() { return this.derrota; }
    public void setEmpate(int empate) {
        this.empate += 1;
    }
    public int getEmpate() {
        return this.empate;
    }
    public String getResultados() {
        String resultado = String.format("Vitórias: %d\nDerrotas: %d\nEmpates: %d", getVitoria(), getDerrota(), getEmpate());
        System.out.println(resultado);
        return resultado;
    }
}
