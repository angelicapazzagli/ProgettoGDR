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
    private int debiti;
    private boolean carcere;
    
    public Carcerato(int debiti, boolean carcere) {
        super("CARCERATO-CORONA", 100000, 9, 5, Abilità.EVITA);
        this.debiti = debiti;
        this.carcere = carcere;
    }
    
    @Override
    public void usaAbilità() {
        
    }
}
