import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Evento {
    public String nome;
    public LocalDate data;
    public TipoEvento tipo;
    public String codice;

    private static String EVT = "EVT";

    public Evento(String nome, LocalDate data, TipoEvento tipo){
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Il nome deve essere valorizzato");
        }
        if(data.isBefore(LocalDate.now())){
            throw new DateTimeException("La data non puo' esser nel passato");
        }

        this.nome = nome;
        this.data = data;
        this.tipo = tipo;
        int random = 100 + new Random().nextInt(900);
        this.codice = EVT + "-" + DateTimeFormatter.ofPattern("yyyyMMdd").format(data) + "-" + random;
    }
}
