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
    
    public GameManager(String csv, String binary) {
        this.fileCSV = csv;
        this.fileBinary = binary;
        random = new Random();
    }
    
    public void setNickname(String name) {
        this.nickname = name;
    }
    
    public void sceltaPersonaggio(int nScelta) {
        switch (nScelta) {
            case 1:
                this.giocatore = new Paparazzo("Buona");
                break;
            case 2:
                this.giocatore = new Carcerato(random.nextInt(45000), true);
                break;
            default:
                this.giocatore = new Modello("Corona's");
                break;
        }
    }
    
    public void readCSV() throws IOException {
        FileManager.readCSV(fileCSV);
    }
    
    public void writeCSV() throws IOException {
        FileManager.writeCSV(fileCSV, giocatore);
    }
}
