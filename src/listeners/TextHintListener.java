package listeners;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class TextHintListener implements FocusListener{
  private final JTextField field;
  private final String hint;
  private final Font hintFont;
  private final Color hintColor;
  private final Font defaultFont;
  private final Color defaultColor;
  
  public TextHintListener( JTextField field, String hint) {
    this.field = field;
    this.hint = hint;
    this.hintFont = new Font("Courier", 2, 12);
    this.hintColor = Color.gray;
    this.defaultFont = field.getFont();
    this.defaultColor = field.getForeground();
    this.focusLost(null);
  }

  @Override
  public void focusGained(FocusEvent e) 
  {
    if ( field.getText().equals( this.hint))
    {
      field.setText( "");
      field.setFont( this.defaultFont);
      field.setForeground( this.defaultColor);
    }
  }

  @Override
  public void focusLost(FocusEvent e) 
  {
    if ( field.getText().isEmpty())
    {
      field.setText( this.hint);
      field.setFont( this.hintFont);
      field.setForeground( this.hintColor);
    }
  }
}
