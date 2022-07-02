import java.util.*;

public class Docente extends Persona {

    Scanner scan = new Scanner(System.in);
    Esame esame = new Esame();
    ArrayList<Corso> corsi = new ArrayList<Corso>();
    private int matricola;

    public Docente(String email, String password, String nome, String cognome){
        super(email, password, nome, cognome);
        this.matricola = super.getMatricola();
    }

    public void creaCorso(){
        Corso corso = new Corso();
        corso.setMatricolaDocente(this.matricola);
        System.out.println("inserisci il nome del corso");
        corso.setNomeCorso(scan.nextLine());
        System.out.println("inserisci la data dell'inizio corso");
        corso.setDataInizioCorso(scan.nextLine());
        System.out.println("inserisci la data della fine del corso");
        corso.setDataFineCorso(scan.nextLine());
        System.out.println("inserisci la descrizione del corso");
        corso.setDescrizioneCorso(scan.nextLine());
        System.out.println("inserire co-docente?");
        String opzionale = scan.nextLine();
        if(opzionale.substring(0).equals("s") || opzionale.substring(0).equals("S")){
            Docente co_docente = new Docente("co_docente@studio.unibo.it", "password", "Alberto", "Finizio");
            corso.setCoDocente(co_docente.getMatricola());  
        }
        System.out.println("inserire un esame?");
        if(opzionale.substring(0).equals("s") || opzionale.substring(0).equals("S")){
            corso.setEsame(esame);
        }
    }

    public void creaEsame(){
        System.out.println("inserisci la data dell'esame");
        this.esame.setDataEsame(scan.nextLine());
        System.out.println("inserisci l'ora' dell'esame");
        this.esame.setOraEsame(scan.nextLine());
        System.out.println("inserisci la durata dell'esame");
        this.esame.setDurataEsame(scan.nextLine());
        System.out.println("inserisci l'aula dell'esame");
        this.esame.setAulaEsame(scan.nextLine()); 
    }
}