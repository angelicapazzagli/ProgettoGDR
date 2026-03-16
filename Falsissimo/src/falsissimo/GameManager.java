/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.IOException;

/**
 *
 * @author pazzagli.angelica
 */
public class GameManager {
    private String fileCSV;
    private String fileBinary;
    private FabrizioCorona giocatore;
    
    public GameManager(String csv, String binary, int nPersonaggio) {
        this.fileCSV = csv;
        this.fileBinary = binary;
        switch (nPersonaggio) {
            case 1:
                this.giocatore = new Paparazzo("Buona");
                break;
            case 2:
                //this.giocatore = new Carcerato();
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
