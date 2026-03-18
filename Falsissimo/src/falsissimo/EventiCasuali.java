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
    
    public static void estraiEvento(FabrizioCorona fabrizio) {
        Random random = new Random();
        int ev = random.nextInt(3);
        switch(ev) {
            case 0:
                perquisizione(fabrizio);
            case 1:
                sabotaggio(fabrizio);
            case 2:
                ricatto(fabrizio);
        }
    }
}
