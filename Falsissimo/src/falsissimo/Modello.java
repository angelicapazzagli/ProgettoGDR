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
public class Modello extends FabrizioCorona{
    private int serviziFotografici;
    private String agenzia;
    private int contratti;
    private Random random;
    
    public Modello(String agenzia) {
        super("MODELLO-CORONA", 250000, 7, 6, Abilità.IMBUCATI);
        this.serviziFotografici = random.nextInt(20);
        this.agenzia = agenzia;
        this.contratti = random.nextInt(5);
    }
    
    @Override
    public void usaAbilità() {
        
    }
}
