package main.comp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputLabel extends JPanel {
  JLabel inputTitle = new JLabel("Title");
  JTextField input = new JTextField("");

  public InputLabel(){
    // this.setLayout(new GridLayout(2,1));
    this.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.BOTH;
    this.setBackground(new Color(0,0,0,0));
    // input.setBackground(new Color(255, 0, 0, 0)); // Negro con 50% de transparencia
    this.setOpaque(false); // Permitir transparencia

    this.setBounds(130, 160, 500, 40);
    this.setPreferredSize(new Dimension(200, 60));

    gbc.gridx =0;
    gbc.gridy = 0;
    gbc.weightx = 0.9;
    gbc.weighty = 1;
    gbc.insets = new Insets(0, 10, 0, 10);
    // gbc.gridwidth = 1;
    this.add(inputTitle,gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.weightx = 0.5;
    gbc.weighty = 1;
    this.add(input,gbc);
  }
  public void setTitle(String text){
    inputTitle.setText(text);
  }
  public void setText(String text){
    input.setText(text);
  }
  public String getText(){
    return input.getText();
  }
}
