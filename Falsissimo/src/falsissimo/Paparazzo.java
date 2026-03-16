/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

/**
 *
 * @author pazzagli.angelica
 */
public class Paparazzo  extends FabrizioCorona{
    private boolean esclusiva;
    private int scoop;
    private String strategia;
    
    public Paparazzo(String strategia) {
        super("PAPARAZZO-CORONA", 500000, 6, 9, Abilità.SCOPRI);
        this.esclusiva = true;
        this.scoop = 0;
        this.strategia = strategia;
    }
    
    @Override
    public void usaAbilità() {
        
    }
}
