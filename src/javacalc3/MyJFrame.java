package javacalc3;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{

  public MyJFrame(String title, int width, int height) {
    super(title);
    this.setSize(width, height);
    this.setIconImage(new ImageIcon("icon.png").getImage());
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    FlowLayout fl = new FlowLayout();
    this.setLayout(fl);
    
  }
  
  public MyJFrame(String title, int width, int height, LayoutManager layout) {
    super(title);
    this.setSize(width, height);
    this.setIconImage(new ImageIcon("icon.png").getImage());
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(layout);
    
  }

}
