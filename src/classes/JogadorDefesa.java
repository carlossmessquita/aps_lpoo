package classes;

public class JogadorDefesa extends Jogador {
    private int cobertura;
    private int desarme;
    private int habilidade;
    public JogadorDefesa() {
        setCobertura(0);
        setDesarme(0);
        setHabilidade(0);
        setPosicao("Defesa");
    }
    public JogadorDefesa(String nome, int camisa, int idade, int cobertura, int desarme, int habilidade) {
        setNome(nome);
        setCamisa(camisa);
        setIdade(idade);
        setCobertura(cobertura);
        setDesarme(desarme);
        setHabilidade(habilidade);
        setPosicao("Defesa");
    }

    public void setCobertura(int cobertura) { this.cobertura = cobertura; }
    public int getCobertura() { return this.cobertura; }
    public void setDesarme(int desarme) { this.desarme = desarme; }
    public int getDesarme() { return this.desarme; }
    @Override
    public void setHabilidade(int numHabilidade) {
        if (numHabilidade >= 0 && numHabilidade <= 100){
            this.habilidade = ((numHabilidade * 5) + (this.cobertura * 3) + (this.desarme * 2))/10;
        } else {
            System.out.println("A habilidade deve ser um inteiro entre 0 e 100!");
            this.habilidade = 0;
        }
    }
    @Override
    public int getHabilidade() {
        return this.habilidade;
    }
}
