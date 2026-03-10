/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

/**
 *
 * @author pazzagli.angelica
 */
public abstract class FabrizioCorona {
    protected String nome;
    protected int soldi;
    protected int fama;
    protected int astuzia;
    protected Abilità abilità;
    
    public FabrizioCorona(int soldi, int fama, int astuzia, Abilità abilità) {
        this.soldi = soldi;
        this.fama = fama;
        this.astuzia = astuzia;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setAbilità(Abilità abilità) {
        this.abilità = abilità;
    }
    
    public abstract void usaAbilità();
}
