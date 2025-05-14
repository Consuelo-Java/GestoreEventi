import java.time.LocalDate;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            Evento noNome = new Evento("", LocalDate.now().plusWeeks(2), TipoEvento.SPORT);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Evento dataPassata = new Evento("Alberto", LocalDate.now().minusDays(2), TipoEvento.SPORT);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Evento e1 = new Evento("Alberto", LocalDate.now().plusWeeks(2), TipoEvento.SPORT);
        Evento e2 = new Evento("Gloria", LocalDate.now().plusDays(5), TipoEvento.SPORT);
        Evento e3 = new Evento("Dario", LocalDate.now().plusWeeks(2), TipoEvento.WORKSHOP);
        Evento e4 = new Evento("Giulio", LocalDate.now().plusWeeks(2), TipoEvento.CONCERTO);
        Evento e5 = new Evento("Sara", LocalDate.now().plusWeeks(3), TipoEvento.CONFERENZA);
        Evento e6 = new Evento("Zoe", LocalDate.now().plusMonths(1), TipoEvento.CONCERTO);
        Evento e7 = new Evento("Sandra", LocalDate.now().plusDays(14), TipoEvento.SPORT);
        Evento e8 = new Evento("Davide", LocalDate.now().plusWeeks(1), TipoEvento.CONCERTO);
        Evento e9 = new Evento("Stefano", LocalDate.now().plusMonths(2), TipoEvento.CONCERTO);
        Evento e10 = new Evento("Giuseppe Verdi", LocalDate.now().plusYears(1), TipoEvento.WORKSHOP);
        Evento e11 = new Evento("Mario Rossi", LocalDate.now().plusWeeks(6), TipoEvento.SPORT);
        Evento e12 = new Evento("Luigi Bianchi", LocalDate.now().plusDays(6), TipoEvento.SPORT);
        Evento e13 = new Evento("Maria de Ponti", LocalDate.now().plusWeeks(5), TipoEvento.SPORT);

        GestoreEventi gestoreEventi = new GestoreEventi();
        gestoreEventi.aggiungiEvento(e1);
        gestoreEventi.aggiungiEvento(e2);
        gestoreEventi.aggiungiEvento(e3);
        gestoreEventi.aggiungiEvento(e4);
        gestoreEventi.aggiungiEvento(e5);
        gestoreEventi.aggiungiEvento(e6);
        gestoreEventi.aggiungiEvento(e7);
        gestoreEventi.aggiungiEvento(e8);
        gestoreEventi.aggiungiEvento(e9);
        gestoreEventi.aggiungiEvento(e10);
        gestoreEventi.aggiungiEvento(e11);
        gestoreEventi.aggiungiEvento(e12);
        gestoreEventi.aggiungiEvento(e13);
        for (int i = 0; i < gestoreEventi.array.length; i++){
            Evento evento = gestoreEventi.array[i];
            if(evento != null){
                System.out.println("Nome "+evento.nome+" data "+evento.data+" tipologia evento "+evento.tipo+" codice evento "+evento.codice);
            }
        }

        //Check su cercaPerData
        LocalDate rifData = LocalDate.now().plusWeeks(2);
        List<Evento> eventiConStessaData = gestoreEventi.cercaPerData(rifData);
        System.out.println("Ci sono " + eventiConStessaData.size() + " eventi per la data "+ rifData);

        //Check su cercaPerTipo
        TipoEvento tipoEvento = TipoEvento.SPORT;
        List<Evento> eventiConStessoTipo = gestoreEventi.cercaPerTipo(tipoEvento);
        System.out.println("Ci sono " + eventiConStessoTipo.size() + " eventi per il tipo evento "+ tipoEvento);


        //Check su formattaNome
        Evento e = new Evento("Maria   de Ponti fjgjrept eadpaepqeurtpw òdisòfòwe kkkk opoyb b     kk", LocalDate.now().plusWeeks(1), TipoEvento.CONCERTO);
        e.formattaNome();
        System.out.println("Nome formattato " + e.nome);
    }
}
