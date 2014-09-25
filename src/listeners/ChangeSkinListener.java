package listeners;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacalc3.MyJFrame;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ChangeSkinListener implements ActionListener {

  private MyJFrame frame;
  
  public ChangeSkinListener( MyJFrame frame) 
  {
    this.frame = frame;
  }
  
  @Override
  public void actionPerformed( ActionEvent e)
  {
    LookAndFeel laf;
    if ( UIManager.getLookAndFeel() instanceof AluminiumLookAndFeel)
      laf = new FastLookAndFeel();
    else if ( UIManager.getLookAndFeel() instanceof FastLookAndFeel)
      laf = new MintLookAndFeel();
    else
      laf = new AluminiumLookAndFeel();
      
    try {
      UIManager.setLookAndFeel( laf);
    } catch (UnsupportedLookAndFeelException ex) {
      Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    SwingUtilities.updateComponentTreeUI( frame);
  }
}
