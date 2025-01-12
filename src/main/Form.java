package main;

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
import main.comp.InputLabel;
import main.comp.CPanel;

public class Form extends CPanel{
  public Form(){
    super(20);
    // this.setBounds(130, 160, 500, 40);
    // this.setMinimumSize(new Dimension(300,900));
    // this.setLayout(new GridLayout(2,1));
    this.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.BOTH;
    this.setBackground(Color.decode("#ffddff"));
    // this.setMargin(new Insets(5, 20, 5, 20));

    JLabel titleForm = new JLabel("Iniciar Sesión",JLabel.CENTER);
    titleForm.setFont(titleForm.getFont().deriveFont(15f));

    // User Name    
    InputLabel userName = new InputLabel();
    userName.setTitle("User Name");
    userName.setText("Ingrese Su usuario");
    // Pass
    InputLabel password = new InputLabel();
    password.setTitle("Contraseña");
    password.setText("Ingrese Su Contraseña");
    InputLabel edad = new InputLabel();

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.insets = new Insets(10, 0, 0, 0);
    this.add(titleForm,gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.insets = new Insets(10, 0, 0, 0);

    this.add(userName,gbc);

    gbc.gridx =0;
    gbc.gridy = 2;
    // gbc.weightx = 1.0;
    // gbc.weighty = 0.5;
    gbc.gridwidth = 1;
    gbc.insets = new Insets(0, 0, 10, 0);
    this.add(password,gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    // gbc.weightx = 1.0;
    // gbc.weighty = 0.5;
    gbc.gridwidth = 2;
    // this.add(edad,gbc);
  }
}
