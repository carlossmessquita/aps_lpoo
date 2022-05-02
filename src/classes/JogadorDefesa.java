package classes;

public class JogadorDefesa extends Jogador {
    private int cobertura;
    private int desarme;
    private int habilidade;
    public JogadorDefesa() {
        setCobertura(0);
        setDesarme(0);
        setHabilidade(0);
    }
    public JogadorDefesa(String nome, int camisa, int idade, int cobertura, int desarme, int habilidade) {
        setNome(nome);
        setCamisa(camisa);
        setIdade(idade);
        setCobertura(cobertura);
        setDesarme(desarme);
        setHabilidade(habilidade);
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }
    public int getCobertura() {
        return this.cobertura;
    }
    public void setDesarme(int desarme) {
        this.desarme = desarme;
    }
    public int getDesarme() {
        return this.desarme;
    }
    @Override
    public void setHabilidade(int habilidade) {
        this.habilidade = ((habilidade * 5) + (this.cobertura * 3) + (this.desarme * 2))/10;
    }
    @Override
    public int getHabilidade() {
        return this.habilidade;
    }
}
