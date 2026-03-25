/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.IOException;
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
    
    public int getPersonaggio() {
        if("PAPARAZZO-CORONA".equals(giocatore.nome)) {
            return 1;
        }
        else if("CARCERATO-CORONA".equals(giocatore.nome)) {
            return 2;
        }
        return 3;
    }
    
    public void esplora() {
        EventiCasuali.estraiEvento(giocatore);
    }
    
    public void readClassifica() throws IOException {
        FileManager.readClassifica(fileClassifica);
    }
    
    public void writeClassifica() throws IOException {
        FileManager.writeClassifica(fileClassifica, giocatore, this);
    }
}
