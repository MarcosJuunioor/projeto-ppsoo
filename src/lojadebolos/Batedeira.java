/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadebolos;

/**
 *
 * @author marcosantonio
 */

//Singleton
public class Batedeira {
    private boolean vazia ;
    private volatile static Batedeira uniqueInstance ;
    
    private Batedeira(){}
    
    public static Batedeira getInstance(){
        if (uniqueInstance == null) {
            synchronized (Batedeira.class) {
                if ( uniqueInstance == null ){
                uniqueInstance = new Batedeira();
                uniqueInstance.vazia=true;
                }
            }
        }
        return uniqueInstance ;
    }
    
    public void encherBatedeira(){
        if(this.vazia){
            System.out.println("Enchendo batedeira...");
            this.vazia=false;
        }
    }
    
    public void baterMassa(){
        if(!this.vazia){
            System.out.println("Batendo massa...");
        }
    }
    
    public void esvaziarBatedeira(){
        if(!this.vazia){
            System.out.println("Esvaziando batedeira...");
            this.vazia=true;
        }
    }
        
}
    

