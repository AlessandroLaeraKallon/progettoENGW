
public class Studente extends Persona {

    private int voto;
    private String [] lista_corsi;
    private String [] lista_esami;
    private int matricola;


    public Studente(String email, String password, String nome, String cognome){
        super(email, password, nome, cognome);
        this.matricola = super.getMatricola();
    }

    public void setListaCorsi() {
        this.lista_corsi = Corso.getListaCorsiByMatricola(this.matricola);
    }

    public void setListaEsami() {
        this.lista_esami = Esame.getListaEsamiByMatricola(this.matricola);
    }

    public String [] getListaCorsi(){
        return this.lista_corsi;
    } 

    public String [] getListaEsami(){
        return this.lista_esami;
    }

    public void setVoto(){
        this.voto = Esame.getVotoByEsame(this.matricola);
    } 

    public int getVoto(){
        return this.voto;
    } 
}