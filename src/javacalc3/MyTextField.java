package javacalc3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class MyTextField extends JTextField{

  public MyTextField() {
    super.setColumns( 8);
    Font font = new Font("Courier", 1, 25);
    super.setFont(font);
    this.addKeyListener( (new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
           (c == KeyEvent.VK_BACK_SPACE) ||
           (c == KeyEvent.VK_DELETE))) {
          getToolkit().beep();
          e.consume();
        }
      }
  }));
  }
  
  public MyTextField( int columns) {
    super.setColumns( columns);
    Font font = new Font("Courier", 3, 25);
    super.setFont(font);
    super.setForeground(Color.red);
  }
}