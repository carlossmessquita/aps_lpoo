package classes;

public class JogadorGoleiro extends Jogador {
    private float altura;
    private int reflexos;
    private int habilidade;

    // Construtores:
    public JogadorGoleiro() {
        setAltura((float) 1.70);
        setReflexos(0);
        setHabilidade(0);
    }

    public JogadorGoleiro(String nome, int camisa, float altura, int reflexos, int habilidade) {
        setNome(nome);
        setCamisa(camisa);
        setAltura(altura);
        setReflexos(reflexos);
        setHabilidade(habilidade);
    }

    // Métodos da classe:
    public void setAltura(float altura) { this.altura = altura; }
    public float getAltura() { return this.altura; }
    public void setReflexos(int reflexos) { this.reflexos = reflexos; }
    public int getReflexos() { return this.reflexos; }

    // Método sobrescrito:
    @Override
    public void setHabilidade(int numHabilidade) {
        this.habilidade =  (((numHabilidade * 5) + ((int)(this.altura*100)) + (this.reflexos * 3))/10);
    }
    @Override
    public int getHabilidade() { return this.habilidade; }
}
