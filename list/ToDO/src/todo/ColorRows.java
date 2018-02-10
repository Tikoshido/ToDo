/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Igor
 */
public class ColorRows extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        TaskTableModel model = (TaskTableModel) table.getModel();
        Component color = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if ("Dni".equals(model.getTask(row).time)) {
            color.setBackground(Color.RED);
        }
        if (!"Dni".equals(model.getTask(row).time)) {
            color.setBackground(Color.WHITE);
        }
        color.setForeground(Color.BLACK);
        if (isSelected && !"Dni".equals(model.getTask(row).time)) {
            color.setBackground(table.getSelectionBackground());
        } else {
            if ("Dni".equals(model.getTask(row).time)) {
                color.setBackground(Color.RED);
            } else {
                color.setBackground(Color.WHITE);
            }
        }
        return color;

    }

}
