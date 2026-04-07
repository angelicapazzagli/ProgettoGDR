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
        super("CARCERATO", 200000, 9, 5);
    }
    
    @Override
    public String usaAbilità() {
        this.astuzia++;
        return "Hai evitato tutti i pericoli. (astuzia +1)";
    }
}
