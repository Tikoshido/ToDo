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
public class TaskAllDayEveryday extends Task {
    
    public TaskAllDayEveryday(String tekst) {
        super(tekst);
    }
    public TaskAllDayEveryday(String tekst,String czas1) {
        super(tekst,czas1);
    }
  public TaskAllDayEveryday(String tekst,String czas1,String local) {
        super(tekst,czas1,local);
    }
public TaskAllDayEveryday(String tekst,String czas1,String local,String start) {
        super(tekst,czas1,local);
        repetitive = Integer.parseInt(start);
        time = czas1;
    }
    public String getTimeToDo() {
        return this.time;
    }

    public void setTimeToDo(String timeToDo) {
        this.time = timeToDo;
    }
    
}
