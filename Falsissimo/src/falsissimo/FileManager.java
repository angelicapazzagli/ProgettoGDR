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
    public static ArrayList<FabrizioCorona> readCSV(String csv) throws IOException {
        ArrayList<FabrizioCorona> personaggi = new ArrayList();
        try(BufferedReader reader = new BufferedReader(new FileReader(csv))) {
            String line;
            while((line = reader.readLine()) != null) {
                FabrizioCorona fc;
                String[] personaggio = line.split(",");
                int soldi = Integer.parseInt(personaggio[1]);
                int fama = Integer.parseInt(personaggio[2]);
                int astuzia = Integer.parseInt(personaggio[3]);
                //fc = new FabrizioCorona(personaggio[0], soldi, fama, astuzia, abilità);
                //personaggi.add(fc);
            }
        }
        return personaggi;
    }
    
    public static void writeCSV(String csv, FabrizioCorona fc) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(csv))) {
            //String dati;
        }
    }
}
