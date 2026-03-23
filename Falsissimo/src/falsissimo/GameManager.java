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
    private String fileCSV;
    private String fileBinary;
    private FabrizioCorona giocatore;
    private String nickname;
    private Random random;
    
    public GameManager() {
        //this.fileCSV = csv;
        //this.fileBinary = binary;
        random = new Random();
    }
    
    public void setNickname(String name) {
        this.nickname = name;
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
    
    public void readCSV() throws IOException {
        FileManager.readCSV(fileCSV);
    }
    
    public void writeCSV() throws IOException {
        FileManager.writeCSV(fileCSV, giocatore);
    }
}
