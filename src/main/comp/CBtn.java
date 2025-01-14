package main.comp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class CBtn extends JButton{
  public CBtn(String text){
    this.setText(text);
    // this.setBackground(Color.decode("#ffffff"));

    this.setBackground(new Color(0,0,0,0));
    this.setOpaque(false);
    this.setPreferredSize(new Dimension(200, 60));

    // Border redline = BorderFactory.createLineBorder(Color.red);
    // Borde externo (personalizado)
      Border bordeExterno = BorderFactory.createLineBorder(java.awt.Color.BLUE, 3);

      // Borde interno (espaciado/padding)
      Border bordeInterno = BorderFactory.createEmptyBorder(10, 10, 10, 10); // Top, Left, Bottom, Right

      // Combinar bordes
      Border bordeFinal = BorderFactory.createCompoundBorder(null, bordeInterno);
      this.setBorder( bordeFinal);

    this.setFont(this.getFont().deriveFont(15f));
    // this.setMargin(new Insets(10,5,10,5));
  }
}
