package main.layout.template;

import java.awt.GridLayout;

import javax.swing.JPanel;

import main.functions.OptionHome;

public class Home extends JPanel{
  public Home(){
    JPanel optionsContainer = new JPanel();
    optionsContainer.setLayout(new GridLayout(1,3));
      OptionHome optionPlayGames = new OptionHome("playGameIcon.png","Jugar");
      OptionHome optionLearn = new OptionHome("learnIcon.png","Leer");
      OptionHome optionExit = new OptionHome("exitIcon.png","Salir");
      optionsContainer.add(optionPlayGames);
      optionsContainer.add(optionLearn);
      optionsContainer.add(optionExit);
    this.add(optionsContainer);
  // this.add(optionsContainer);
  }
}
