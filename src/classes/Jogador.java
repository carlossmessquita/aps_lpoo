package classes;

public abstract class Jogador {
    // Atributos de classe:
    private String nome;
    private int idade;
    private int gols;
    private int camisa;
    private int habilidade;
    private String posicao;

    // Construtores:
    public Jogador() {
        setNome("Sem Nome");
        setCamisa(0);
        setIdade(0);
        this.gols = 0;
    }

    public Jogador(String nome, int camisa, int habilidade) {
        setNome(nome);
        setCamisa(camisa);
        setHabilidade(habilidade);
        this.gols = 0;
    }

    // Métodos da classe:
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }
    public int getCamisa() {
        return this.camisa;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPosicao() {
        return posicao;
    }
    public void somaGol() {
        this.gols += 1;
    }
    public int getGols() {
        return this.gols;
    }

    // Métodos abstratos:
    public abstract void setHabilidade(int habilidade);
    public abstract int getHabilidade();
}

