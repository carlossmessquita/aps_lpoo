import classes.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, World");

        Time c = new Time();
        c.setNome("Casa");

        Time v = new Time();
        v.setNome("Visitante");

        Partida p = new Partida();
        p.setTimeCasa(c);
        p.setTimeVisitante(v);

        System.out.println(p.getPlacar());

    }
}
