/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.util.Random;

/**
 *
 * @author pazzagli.angelica
 */
public class EventiCasuali {
    public static void perquisizione(FabrizioCorona fabrizio) {
        Random random = new Random();
        fabrizio.soldi -= random.nextInt(fabrizio.soldi);
    }
    
    public static void sabotaggio(FabrizioCorona fabrizio) {
        if(fabrizio.astuzia < 7) {
            fabrizio.soldi -= 5000;
        }
        else {
            fabrizio.astuzia++;
        }
        fabrizio.checkValore(fabrizio.astuzia);
    }
    
    public static void ricatto(FabrizioCorona fabrizio) {
        Random random = new Random();
        int perc = random.nextInt(10);
        if(fabrizio.astuzia > 8) {
            if(perc > 8) {
                fabrizio.soldi += fabrizio.soldi / 2;
            }
            else {
                fabrizio.soldi += fabrizio.soldi / 6;
            }
        }
    }
    
    public static void intervistaBelve(FabrizioCorona fabrizio) {
        System.out.println("Francesca Fagnani ti fa una domanda scomoda! Potresti perdere molta fama.");
        if(fabrizio.astuzia > 8) {
            System.out.println("Sei riuscito a scamparla.");
            fabrizio.astuzia++;
        }
        else {
            System.out.println("Ti sei bloccato. Hai perso fama.");
            fabrizio.fama -= 2;
        }
    }
    
    public static void incontroBelen(FabrizioCorona fabrizio) {
        System.out.println("Hai incontrato Belen Rodriguez! Avrai abbastanza fama per poter instaurare un rapporto?");
        if(fabrizio.fama >=9) {
            System.out.println("Belen ti ha notato. Riesci anche a fatturare soldi per essere stato paparazzato con lei. + 15.000");
            fabrizio.soldi += 15000;
        }
        else {
            System.out.println("Non hai guadagnato niente. Occasione persa.");
        }
    }
    
    public static String estraiEvento(FabrizioCorona fabrizio) {
        Random random = new Random();
        int ev = random.nextInt(5);
        switch(ev) {
            case 0:
                perquisizione(fabrizio);
                return "Sei stato perquisito.";
            case 1:
                sabotaggio(fabrizio);
                return "Sei stato sabotato.";
            case 2:
                ricatto(fabrizio);
                return "Sei stato ricattato.";
            case 3:
                intervistaBelve(fabrizio);
                return "Francesca Fagnani ti sta intervistando.";
            case 4:
                incontroBelen(fabrizio);
                return "Incontri Belen Rodriguez.";
        }
        return "Nessun evento";
    }
}
