/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

/**
 *
 * @author pazzagli.angelica
 */
public class Paparazzo extends FabrizioCorona{
    
    public Paparazzo() {
        super("PAPARAZZO", 300000, 6, 9, Abilità.SCOPRI);
    }
    
    @Override
    public void usaAbilità() {
        System.out.println("Hai scoperto i segreti più temibili dei grandi dello spettacolo. Soldi +10.000");
        this.soldi += 10000;
    }
}
