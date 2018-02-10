/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

/**
 *
 * @author Igor
 */
public class Taskonce extends Task {
    
    public Taskonce(String tekst) {
        super(tekst);
    }
    public Taskonce(String tekst,String czas1) {
        super(tekst,czas1);
    }
public Taskonce(String tekst,String czas1,String local) {
        super(tekst,czas1,local);
    }
    public String getFrequency() {
        return time;
    }

    public void setFrequency(String frequency) {
        this.time = frequency;
    }
    
    
}
