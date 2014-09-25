package javacalc3;

import javax.swing.JDialog;

public class MyJDialog extends JDialog{

  public MyJDialog(String title, int width, int height) {
    this.setTitle(title);
    this.setSize(width, height);
    this.setLocationRelativeTo(null);
//    this.setLayout(layout);
    
  }


}
