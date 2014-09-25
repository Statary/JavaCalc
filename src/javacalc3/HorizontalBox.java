package javacalc3;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class HorizontalBox extends JPanel{
  
  public HorizontalBox()
  {
    super();
//    BoxLayout bl = new BoxLayout( this, BoxLayout.X_AXIS);
    GridLayout gl = new GridLayout( 1, 3, 20, 20);
    this.setLayout( gl);
  }
}
