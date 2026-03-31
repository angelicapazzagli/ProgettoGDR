/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class FileManager {
    public static String readClassifica(String txt) throws IOException {
        String giocatori = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(txt))) {
            String line;
            while((line = reader.readLine()) != null) {
                giocatori += line + "\n";
            }
        }
        return giocatori;
    }
    
    public static void writeClassifica(String txt, FabrizioCorona fc, GameManager gm) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(txt))) {
            writer.write(gm.getNickname() + " " + fc.nome);
        }
    }
    
    public static void newCartella(String nickname) {
        String percorso = "Salvataggi/" + nickname;
        File cartella = new File(percorso);
        if(!cartella.exists()) {
            if(cartella.mkdirs()) {
                System.out.println("Cartella creata con successo!");
            } 
            else {
                System.out.println("Impossibile creare la cartella.");
            }
        } 
        else {
            System.out.println("La cartella esiste già.");
        }
    }
}
