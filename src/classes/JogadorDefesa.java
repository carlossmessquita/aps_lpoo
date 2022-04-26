package classes;

public class JogadorDefesa extends Jogador {
    private int cobertura;
    private int desarme;
    private int habilidade;
    public JogadorDefesa() {
        this.cobertura = 0;
        this.desarme = 0;
        this.habilidade = 0;
    }
    public JogadorDefesa(int cobertura, int desarme, int habilidade) {
        this.cobertura = cobertura;
        this.desarme = desarme;
        this.habilidade = habilidade;
    }

    public void setCobertura(int cobertura) { this.cobertura = cobertura; }
    public int getCobertura() { return this.cobertura; }
    public void setDesarme(int desarme) { this.desarme = desarme; }
    public int getDesarme() { return this.desarme; }
    @Override
    public void setHabilidade(int numHabilidade) {
        this.habilidade = ((numHabilidade * 5) + (this.cobertura * 3) + (this.desarme * 2))/10;
    }
    @Override
    public int getHabilidade() {
        return this.habilidade;
    }
}
