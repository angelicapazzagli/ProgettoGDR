/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class FileManager {
    public static ArrayList<String> readClassifica(String txt) throws IOException {
        ArrayList<String> giocatori = new ArrayList();
        try(BufferedReader reader = new BufferedReader(new FileReader(txt))) {
            String line;
            while((line = reader.readLine()) != null) {
                String utente;
                String[] personaggio = line.split(" ");
                utente = personaggio[0] + personaggio[1];
                giocatori.add(utente);
            }
        }
        return giocatori;
    }
    
    public static void writeClassifica(String txt, FabrizioCorona fc, GameManager gm) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(txt))) {
            writer.write(gm.getNickname() + fc.nome);
        }
    }
}
