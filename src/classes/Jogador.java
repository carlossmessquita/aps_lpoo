package classes;

public abstract class Jogador {
    // Atributos de classe:
    private String nome;
    private int idade;
    private int gols;
    private int camisa;
    private int habilidade;

    // Construtores:
    public Jogador() {
        setNome("Jogador Nº 1");
        setCamisa(1);
        setIdade(18);
        this.gols = 0;
    }

    public Jogador(String nome, int numCamisa, int habilidade) {
        setNome(nome);
        setCamisa(numCamisa);
        setHabilidade(habilidade);
        this.gols = 0;
    }

    // Métodos da classe:
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() {
        return this.nome;
    }
    public void setCamisa(int numCamisa) {
        this.camisa = numCamisa;
    }
    public int getCamisa() {
        return this.camisa;
    }
    public void setIdade(int idade) { this.idade = idade; }
    public int getIdade() { return this.idade;}
    public void somaGol(int gol) { this.gols += 1; }
    public int getGols() { return this.gols; }

    // Métodos abstratos:
    public abstract void setHabilidade(int numHabilidade);
    public abstract int getHabilidade();
}

