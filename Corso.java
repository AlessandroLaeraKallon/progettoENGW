import java.util.*;

    public class Corso {

        Random random = new Random();

        public int id_corso;
        public String nomeCorso;
        public String dataInizioCorso;
        public String dataFineCorso;
        public String descrizioneCorso;
        public int matricola_co_docente;
        public Esame esame;
        public int matricolaDocente;

        public Corso(){
            this.id_corso = random.nextInt(001 + 0010000) + 001;
        }

        public void setNomeCorso(String corso){
            this.nomeCorso = corso;
        }

        public void setDataInizioCorso(String dataInizioCorso){
            this.dataInizioCorso = dataInizioCorso;
        }

        public void setDataFineCorso(String dataFineCorso){
            this.dataFineCorso = dataFineCorso;
        }

        public void setDescrizioneCorso(String descrizioneCorso){
            this.descrizioneCorso = descrizioneCorso;
        }

        public void setCoDocente(int co_docente){
            this.matricola_co_docente = co_docente;
        } 

        public void setEsame(Esame esame){
            this.esame = esame;
        } 

        public void setMatricolaDocente(int matricola){
            this.matricolaDocente = matricola;
        } 

        public int getIdCorso(){
            return this.id_corso;
        }

        public String getNomeCorso(){
            return this.nomeCorso;
        }

        public String getDataInizioCorso(){
            return this.dataInizioCorso;
        }

        public String getDataFineCorso(){
            return this.dataFineCorso;
        }

        public String getDescrizioneCorso(){
            return this.descrizioneCorso;
        }

        public int getCoDocente(){
            return this.matricola_co_docente;
        }

        public Esame getEsame(){
            return this.esame;
        }

        public int getMatricolaDocente(){
            return this.matricolaDocente;
        }
    }
