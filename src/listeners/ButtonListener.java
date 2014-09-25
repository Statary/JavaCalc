package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class ButtonListener implements ActionListener {

  private final JTextField number1;
  private final JTextField number2;
  private final JTextField res;
  
  public ButtonListener( JTextField number1, JTextField number2, JTextField res) 
  {
    this.number1 = number1;
    this.number2 = number2;
    this.res = res;
  }
  
  @Override
  public void actionPerformed(ActionEvent e)
  {
    double num1 = Integer.parseInt( this.number1.getText());
    double num2 = Integer.parseInt( this.number2.getText());
    double result = 0;
    switch ( e.getActionCommand())
    {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 / num2;
        break;
    }
    this.res.setText( String.valueOf( result));

  }
}
