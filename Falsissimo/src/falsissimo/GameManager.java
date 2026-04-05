/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author pazzagli.angelica
 */
public class GameManager {

    private String fileClassifica;
    protected FabrizioCorona giocatore;
    private String nickname;
    private Random random;
    private int punti;

    public GameManager(String txt) {
        this.fileClassifica = txt;
        random = new Random();
    }

    public void setNickname(String name) {
        this.nickname = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void sceltaPersonaggio(int nScelta) {
        switch (nScelta) {
            case 1:
                this.giocatore = new Paparazzo();
                break;
            case 2:
                this.giocatore = new Carcerato();
                break;
            case 3:
                this.giocatore = new Modello();
                break;
        }
    }
    
    public void setpersonaggio(FabrizioCorona corona) {
        this.giocatore = corona;
    }

    public int getPersonaggio() {
        if ("PAPARAZZO".equals(giocatore.nome)) {
            return 1;
        } else if ("CARCERATO".equals(giocatore.nome)) {
            return 2;
        }
        return 3;
    }
    
    public String usaAbilità() {
        return giocatore.usaAbilità();
    }

    public String esplora() {
        return EventiCasuali.estraiEvento(giocatore);
    }

    public String readClassifica() throws IOException {
        return FileManager.readClassifica(fileClassifica);
    }

    public void writeClassifica(int punti) throws IOException {
        FileManager.writeClassifica(fileClassifica, giocatore, this, punti);
    }

    public void salvaPartita() throws IOException {
        File cartella = FileManager.newCartella(nickname);
        FileManager.serializzaPartita(cartella, giocatore);
    }

    public boolean presenzaSalvataggi() {
        return FileManager.presenzaSalvataggi(nickname);
    }

    public ArrayList<File> getSalvataggi() {
        return FileManager.getSalvataggi(nickname);
    }
    
    public void caricaPartita(File file) throws IOException, ClassNotFoundException {
        this.giocatore = FileManager.deserializzaPartita(file.getPath());
    }
    
    public int getPunti() {
        punti += (giocatore.getSoldi()/1000) + giocatore.getFama() + giocatore.getAstuzia();
        return punti;
    }
}
