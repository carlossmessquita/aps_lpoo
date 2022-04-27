import classes.*;

/*
Escalação Time Casa: AFC Richmond
- Goleiro 81: Thierry Zoreaux, 29 anos, 1.82 altura;
- Atacante 14: Dani Rojas, 27 anos;
- Atacante 9: James Tartt, 25 anos;
- Defesa 24: Sam Obisanya, 22 anos;
- Defesa 6: Roy Kent, 37 anos;

Escalação Time Visitante: Escola Raimon
- Goleiro 1: Satoru Endo, 18 anos, 1.77 altura;
- Atacante 10: Shuya Goenji, 19 anos;
- Atacante 11: Ryugo Someoka, 20 anos;
- Defesa 3: Heigoro Kabeyama, 18 anos;
- Defesa 4: Jim Kageno, 21 anos;
*/

public class Main {
    public static void main(String args[]) {
        System.out.println("Autoriza o árbitro!!!\n");

        // Instanciando Time Casa - AFC Richmond:
        Time afcRichmond = new Time("AFC Richmond", 1, 1, 1);

        // Instanciando jogadores - AFC Richmond:
        JogadorGoleiro thierryZoureaux = new JogadorGoleiro("Thierry Zoreaux", 81, 29,1.82F, 55, 65);
        afcRichmond.setJogadores(thierryZoureaux);
        // Ataque:
        JogadorAtacante jamesTartt = new JogadorAtacante("James Tartt", 9, 25,82, 85, 90);
        afcRichmond.setJogadores(jamesTartt);
        JogadorAtacante daniRojas = new JogadorAtacante("Dani Rojas", 14,27, 85, 90, 92);
        afcRichmond.setJogadores(daniRojas);
        // Defesa:
        JogadorDefesa samObisanya = new JogadorDefesa("Sam Obisanya", 24, 22, 77, 72, 79);
        afcRichmond.setJogadores(samObisanya);
        JogadorDefesa royKent = new JogadorDefesa("Roy Kent", 6, 37, 95, 86, 89);
        afcRichmond.setJogadores(royKent);

        // Instanciando Time Visitante - Escola Raimon:
        Time escolaRaimon = new Time("Escola Raimon", 2, 0, 1);

        // Instanciando Jogadores - Escola Raimon:
        JogadorGoleiro satoruEndo = new JogadorGoleiro("Satoru Endo", 1, 18, 1.77F, 89, 78);
        escolaRaimon.setJogadores(satoruEndo);
        // Ataque:
        JogadorAtacante shuyaGoenji = new JogadorAtacante("Shuya Goenji", 10, 19, 78, 86, 70);
        escolaRaimon.setJogadores(shuyaGoenji);
        JogadorAtacante ryugoSomeoka = new JogadorAtacante("Ryugo Someoka", 11, 20, 68, 75, 70);
        escolaRaimon.setJogadores(ryugoSomeoka);
        // Defesa:
        JogadorDefesa heigoroKabeyama = new JogadorDefesa("Heigoro Kabeyama", 3, 18, 68, 64, 66);
        escolaRaimon.setJogadores(heigoroKabeyama);
        JogadorDefesa jimKageno = new JogadorDefesa("Jim Kageno", 4, 20, 65, 72, 71);
        escolaRaimon.setJogadores(jimKageno);

        // Instanciando Partida:
        Partida finalDaCopa = new Partida("02/30/1901", afcRichmond, escolaRaimon);

        afcRichmond.escalacao();
        escolaRaimon.escalacao();

        for (int i = 0; i <= 2;  i++) {

            finalDaCopa.golCasa();
        }
        daniRojas.somaGol();
        daniRojas.somaGol();
        jamesTartt.somaGol();

        finalDaCopa.golVisitante();
        shuyaGoenji.somaGol();

        //Dados da Partida:
        finalDaCopa.info();
    }
}
