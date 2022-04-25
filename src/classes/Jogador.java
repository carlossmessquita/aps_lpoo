package classes;

public abstract class Jogador {
        private String nome;
        private int camisa;
        private int habilidade;

    // Construtores:
        public Jogador() {
            setNome("Jogador Nº 1");
            setCamisa(1);
        }

        public Jogador(String nome, int numCamisa, int habilidade) {
            setNome(nome);
            setCamisa(numCamisa);
            setHabilidade(habilidade);
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

        // Método sobrescrito:
        public abstract void setHabilidade(int numHabilidade);

        public abstract int getHabilidade();
}

