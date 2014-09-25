package javacalc3;

import java.awt.Font;
import javax.swing.JButton;

public class MyJButton extends JButton {
  
  public MyJButton( String text) {
    super(text);
    Font font = new Font(null, 1, 25);
    setFont(font);
  }
  
  public MyJButton()
  {
    super.setFocusable( false);
  }

}
