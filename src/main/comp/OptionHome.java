package main.comp;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionHome extends JPanel {
  public  OptionHome(String srcImage, String textBtn){
    this.setLayout(new GridLayout(2,1));
    CBtn btnOption = new CBtn("Jugar");

    ImageIcon imageSrc = new ImageIcon(OptionHome.class.getResource("/main/src/"+srcImage));
    Image imageStyle = imageSrc.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
    ImageIcon imagen = new ImageIcon(imageStyle);

    JLabel imageOption = new JLabel(imagen);
    this.add(btnOption);
    this.add(imageOption);
    // BtnContainer.add(btnExit);
  }
  
}
