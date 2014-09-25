package javacalc3;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import listeners.ButtonListener;
import listeners.ChangeSkinListener;
import listeners.TextHintListener;

public class JavaCalc3 {

  public static void main(String[] args)
  {
    try {
      UIManager.setLookAndFeel(new AluminiumLookAndFeel());
    } catch (UnsupportedLookAndFeelException ex) {
      Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    JFrame.setDefaultLookAndFeelDecorated(true);
    MyJFrame myframe = new MyJFrame( "Calc", 400, 200);
//    MyJDialog myframe = new MyJDialog("Calc", 400, 200);
    
    Font font = new Font("Courier", 1, 25);
    VerticalBox vBox = new VerticalBox();
    
    MyTextField number1 = new MyTextField();
    MyTextField number2 = new MyTextField();
    HorizontalBox hBox1 = new HorizontalBox();
    hBox1.add(number1);
    hBox1.add(number2);
    
    HorizontalBox hBox2 = new HorizontalBox();
    MyJButton add = new MyJButton( "+");
    MyJButton sub = new MyJButton( "-");
    MyJButton mult = new MyJButton( "*");
    MyJButton div = new MyJButton( "/");
    hBox2.add( add);
    hBox2.add( sub);
    hBox2.add( mult);
    hBox2.add( div);
    
    JLabel label = new JLabel( "Result:");
    label.setFont( font);
    MyTextField res = new MyTextField( 8);
    res.setEditable(false);
    res.setFocusable(false);
    HorizontalBox hBox3 = new HorizontalBox();
    hBox3.add( label);
    hBox3.add( res);
    
    ButtonListener btnListener = new ButtonListener( number1, number2, res);
    add.addActionListener( btnListener);
    sub.addActionListener( btnListener);
    mult.addActionListener( btnListener);
    div.addActionListener( btnListener);
    
//    number1.setText( "6");
//    number2.setText( "2");
    
    number1.addFocusListener( new TextHintListener( number1, "Input number 1"));
    number2.addFocusListener( new TextHintListener( number2, "Input number 2"));
    
    vBox.add(hBox1, BorderLayout.NORTH);
    vBox.add(hBox2, BorderLayout.CENTER);
    vBox.add(hBox3, BorderLayout.SOUTH);
    
    MyJButton settingsBtn = new MyJButton();
    settingsBtn.setIcon( new ImageIcon( "src/images/settings.png"));
    settingsBtn.addActionListener( new ChangeSkinListener( myframe));
    vBox.add( settingsBtn, BorderLayout.EAST);
    
    myframe.add(vBox);
    myframe.setMinimumSize( new Dimension(400, 200));
    myframe.setResizable(false);
    myframe.setVisible(true);
  }
}
