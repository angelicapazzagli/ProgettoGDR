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
    }
}
