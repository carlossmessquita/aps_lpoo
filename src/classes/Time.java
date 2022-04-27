package classes;
import java.util.ArrayList;

public class Time {
    // Atributos da classe:
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private int vitoria = 0;
    private int derrota = 0;
    private int empate = 0;

    // Construtores:
    public Time() {
        setNome("Time Null");
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
        if (jogadores.size() == 0) {
            return "Não há Jogadores no time!";
        }
        else {
            return "\n";
        }
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

    public int getDerrota() {
        return this.derrota;
    }

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

    public String escalacao() {
        System.out.println(this.getNome());
        for (int i = 0; i < jogadores.size(); i++) {
            int hab = jogadores.get(i).getHabilidade();
            int num = jogadores.get(i).getCamisa();
            int idd = jogadores.get(i).getIdade();
            int gols = jogadores.get(i).getGols();
            String pos = jogadores.get(i).getPosicao();
            System.out.println("----------------------------------------");
            System.out.println(jogadores.get(i).getNome() + "--" + pos);
            System.out.println("Nº Camisa: "+ num + " Idade: "+ idd +" Hab: " + hab + " Gols: " + gols);
        }
        if (jogadores.size() == 0) { return "Não há Jogadores no time!"; }
        else { return " "; }
    }
}
