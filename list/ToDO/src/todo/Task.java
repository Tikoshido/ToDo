/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.time.LocalDate;

/**
 *
 * @author Igor
 */
public abstract class Task {

    protected String taskText;
    protected String time;

    protected LocalDate deadline;
    int repetitive = 1;
    protected int timeInt;
    protected int deadlineTime;
    

    public void time() {
        timeInt = Integer.parseInt(time);
        timeInt = deadline.getDayOfYear() - LocalDate.now().getDayOfYear();
        time = Integer.toString(timeInt);

    }

    public Task(String tekst) {
        taskText = tekst;
    }

    public Task(String tekst, String czas) {
        taskText = tekst;
        this.time = czas;
    }

    public Task(String tekst, String czas, String local) {
        taskText = tekst;
        deadlineTime = Integer.parseInt(local);
        timeInt = deadlineTime - LocalDate.now().getDayOfYear();
        System.out.println("CzasInt" + timeInt);
        this.time = Integer.toString(timeInt);
    }

    public void addTime() {
        timeInt = Integer.parseInt(time);
        int today = LocalDate.now().getDayOfYear();
        deadline = LocalDate.ofYearDay(2018, today + timeInt);
        this.deadlineTime = today + timeInt;

    }

   

    @Override
    public String toString() {
        return taskText + time;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public String getCzas() {
        return time;
    }

    public void setCzas(String czas) {
        this.time = czas;
    }

}
