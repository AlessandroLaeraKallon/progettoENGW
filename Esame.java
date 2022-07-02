import java.util.*;

public class Esame {

    public int id_esame;
    public String dataEsame;
    public String oraEsame;
    public String durataEsame;
    public String aula;
    public int matricolaStudente;
    public int voto;

    Random random = new Random();

    public Esame(){
        this.id_esame = random.nextInt(001 + 0010000) + 001;
    }

    public void setDataEsame(String dataEsame){
        this.dataEsame = dataEsame;
    }

    public void setOraEsame(String oraEsame){
        this.oraEsame = oraEsame;
    }

    public void setDurataEsame(String durataEsame){
        this.durataEsame = durataEsame;
    }

    public void setAulaEsame(String aulaEsame){
        this.aula = aulaEsame;
    }

    public void setVotoEsame(int votoEsame){
        this.voto = votoEsame;
    }
}