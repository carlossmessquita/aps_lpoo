package classes;

public class JogadorAtacante extends Jogador  {
    private int tecnica;
    private int velocidade;
    private int habilidade;

    // Construtores:
    public JogadorAtacante() {
        setTecnica(0);
        setVelocidade(0);
        setHabilidade(0);
    }

    public JogadorAtacante(String nome, int camisa, int idade,int tecnica, int velocidade, int habilidade) {
        setNome(nome);
        setCamisa(camisa);
        setIdade(idade);
        setTecnica(tecnica);
        setVelocidade(velocidade);
        setHabilidade(habilidade);
    }

    // Métodos da classe:
    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
    public float getTecnica() {
        return this.tecnica;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getVelocidade() {
        return this.velocidade;
    }

    // Método sobrescrito:
    @Override
    public void setHabilidade(int habilidade) {
        this.habilidade =  (((habilidade * 5) +  (this.velocidade * 2) + (this.tecnica * 3))/10);
    }
    @Override
    public int getHabilidade() {
        return this.habilidade;
    }

}
