import java.util.*;

public class Persona {

    Random random = new Random();

    private String email;
    private String password;
    private String nome;
    private String cognome;
    private int matricola = random.nextInt(001 + 0010000) + 001; 

    public Persona(String email, String password, String nome, String cognome){
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public int getMatricola(){
        return this.matricola;
    }

    public void setPassword(String pwd){
        this.password = pwd;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

}