/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

/**
 *
 * @author Edgar
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
  
/**
 * @version 1.0 11/09/98
 */
public class JTableButtonMouseListener extends MouseAdapter {
  private final JTable table;
		
  public JTableButtonMouseListener(JTable table) {
    this.table = table;
  }

  @Override public void mouseClicked(MouseEvent e) {
    int column = table.getColumnModel().getColumnIndexAtX(e.getX());
    int row    = e.getY()/table.getRowHeight(); 

    if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
      Object value = table.getValueAt(row, column);
      if (value instanceof JButton) {
        ((JButton)value).doClick();
      }
    }
  }
}
