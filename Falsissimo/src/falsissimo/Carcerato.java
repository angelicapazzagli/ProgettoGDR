/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

/**
 *
 * @author pazzagli.angelica
 */
public class Carcerato extends FabrizioCorona{
    
    public Carcerato() {
        super("CARCERATO", 100000, 9, 5, Abilità.EVITA);
    }
    
    @Override
    public String usaAbilità() {
        this.astuzia++;
        return "Hai evitato il pericolo. Astuzia +1";
    }
}
