package classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Partida {
    // Atributos da classe:
    private Date data;
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa;
    private int placarVisitante;

    public Partida(String data, Time timeCasa, Time timeVisitante) {
        setData(data);
        setTimeCasa(timeCasa);
        setTimeVisitante(timeVisitante);
    }
    // Métodos:
    public void setData(String data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try { this.data = formato.parse(data); }
        catch (ParseException e) { throw new RuntimeException(e); }
    }
    public Date getData() {
        return this.data;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeCasa() {
        return this.timeCasa.getNome();
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getTimeVisitante() {
        return this.timeVisitante.getNome();
    }

    public void golCasa() {
        this.placarCasa += 1;
    }

    public int getPlacarCasa() {
        return this.placarCasa;
    }

    public void golVisitante() {
        this.placarVisitante += 1;
    }

    public int getPlacarVisitante() {
        return this.placarVisitante;
    }

    public String getPlacar() {
        String placar = String
        .format(getTimeCasa() + " %d x %d " + getTimeVisitante(),
                getPlacarCasa(), getPlacarVisitante());
        return placar;
    }

    public void informacaoPartida() {
        System.out.println(timeCasa.getNome() +" x "+ timeVisitante.getNome());
        System.out.println("Data da Partida: " + getData() + "\n");
    }
}
