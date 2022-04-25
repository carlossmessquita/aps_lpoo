package classes;
import java.util.Date;

public class Partida {
    private Date data;
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa;
    private int placarVisitante;
    public void setTimeCasa(Time timeCasa) { this.timeCasa = timeCasa; }
    public String getTimeCasa() { return this.timeCasa.getNome(); }
    public void setTimeVisitante(Time timeVisitante) { this.timeVisitante = timeVisitante; }
    public String getTimeVisitante() { return this.timeVisitante.getNome(); }

    public void golCasa(){ this.placarCasa += 1; }
    public int getPlacarCasa() { return this.placarCasa; }

    public void golVisitante() { this.placarVisitante += 1; }
    public int getPlacarVisitante() { return this.placarVisitante; }
    public String getPlacar() {
        String placar = String
        .format(getTimeCasa() + " %d x %d " + getTimeVisitante(),
                getPlacarCasa(), getPlacarVisitante());
        return placar;
    }
}
