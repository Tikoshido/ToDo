/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Igor
 */
public class TaskTableModel extends AbstractTableModel implements TableModel {

     private String[] columnNames =
    {
        "Zadanie repetytywne",
        "Czas"
    };
    private List<Task> tasks;
    
    public TaskTableModel()
    {
        tasks = new ArrayList<Task>();
    }

    public int getRowofValue(String cos)
    {
        return tasks.indexOf(cos);
    }
    @Override
    public int getRowCount() {
        return tasks.size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length; //To change body of generated methods, choose Tools | Templates.
    }
public Task getTask(int row)
{
    return tasks.get( row );
}
    @Override
    public String getValueAt(int row, int column) {
         Task task = getTask(row);
 
    switch (column)
    {
        case 0: return task.getTaskText();
        case 1: return task.getCzas();
        default: return null;
    }
    }
    public void addTask(Task task)
{
    insertTask(getRowCount(), task);
}
 
public void insertTask(int row, Task task)
{
    tasks.add(row, task);
    fireTableRowsInserted(row, row);
}

public void removeTask(int row)
{
    
        tasks.remove(row);
        fireTableRowsDeleted(row, row);
        
    
}
 






}
    
            
        
    