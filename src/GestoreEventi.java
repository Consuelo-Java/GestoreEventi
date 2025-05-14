import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestoreEventi {
    public Evento[] array = new Evento[100];

    public void aggiungiEvento(Evento evento){
        boolean aggiuntoEvento = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                array[i] = evento;
                aggiuntoEvento = true;
                break;
            }
        }
        if(!aggiuntoEvento){
            System.out.println("Non e' stato possibile aggiungere l'evento");
        }
    }

    public List<Evento> cercaPerData(LocalDate data){
        ArrayList<Evento> lista = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(array[i] != null && array[i].data.equals(data)){
                lista.add(array[i]);
            }
        }
        return lista;
    }

    public List<Evento> cercaPerTipo(TipoEvento tipoEvento){
        ArrayList<Evento> lista = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(array[i] != null && array[i].tipo != null && array[i].tipo.equals(tipoEvento)){
                lista.add(array[i]);
            }
        }
        return lista;
    }
}
