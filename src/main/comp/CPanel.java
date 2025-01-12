package main.comp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class CPanel extends JPanel {
  private final int radius;

  public CPanel(int radius) {
    this.radius = radius;
    setOpaque(false); // Para que el fondo se dibuje correctamente
}

  @Override
  protected void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      
      // Dibujar fondo redondeado
      g2.setColor(getBackground());
      g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

      // Dibujar borde redondeado
      // g2.setColor(Color.decode("#ff00ff")); // Color del borde
      // g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

      super.paintComponent(g);
  }
}
