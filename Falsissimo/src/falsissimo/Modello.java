/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;


/**
 *
 * @author pazzagli.angelica
 */
public class Modello extends FabrizioCorona{
    
    public Modello() {
        super("MODELLO", 400000, 7, 6, Abilità.IMBUCATI);
    }
    
    @Override
    public String usaAbilità() {
        this.fama++;
        return "Sei riuscito ad imbucarti e ottenere nuovi contratti. Fama +1";
    }
}
