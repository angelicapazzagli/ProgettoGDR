/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author pazzagli.angelica
 */
public class FileManager {

    public static String readClassifica(String txt) throws IOException {
        ArrayList<String> lines = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(txt))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        lines.sort((l1, l2) -> Integer.compare(
            Integer.parseInt(l2.replaceAll("\\D+", "")),
            Integer.parseInt(l1.replaceAll("\\D+", ""))
        ));
        return String.join("\n", lines);
    }

    public static void writeClassifica(String txt, FabrizioCorona fc, GameManager gm, int punti) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txt, true))) {
            writer.write(gm.getNickname() + " -" + fc.nome + " " + punti + "pt");
            writer.newLine();
        }
    }

    public static File newCartella(String nickname) {
        String percorso = "Salvataggi/" + nickname;
        File cartella = new File(percorso);
        if (!cartella.exists()) {
            cartella.mkdirs();
        }
        return cartella;
    }

    public static void serializzaPartita(File cartella, GameManager gm) throws FileNotFoundException, IOException {
        File[] files = cartella.listFiles(File::isFile);
        if (files != null && files.length >= 3) {
            File oldest = files[0];
            for (File f : files) {
                if (f.lastModified() < oldest.lastModified()) {
                    oldest = f;
                }
            }
            oldest.delete();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = sdf.format(new Date());
        String fileName = "save_" + gm.getGiocatore().getNome() + "_" + timestamp + ".ser";
        File file = new File(cartella, fileName);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(gm);
        }
    }

    public static GameManager deserializzaPartita(String file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (GameManager) ois.readObject();
        }
    }
    
    public static boolean presenzaSalvataggi(String nickname) {
        File cartella = new File("Salvataggi/" + nickname);
        return cartella.exists() && cartella.isDirectory();
    }
    
    public static ArrayList<File> getSalvataggi(String nickname) {
        File cartella = new File("Salvataggi/" + nickname);
        ArrayList<File> files = new ArrayList();
        if (cartella.exists() && cartella.isDirectory()) {
            for (File f : cartella.listFiles()) {
                if (f.isFile()) {
                    files.add(f);
                }
            }
            files.sort(Comparator.comparingLong(File::lastModified));
        }
        return files;
    }
}
