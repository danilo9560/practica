import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuario {

    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Registro de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        // Crear etiquetas y campos de texto
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();

        JLabel lblApellido = new JLabel("Apellido:");
        JTextField txtApellido = new JTextField();

        JLabel lblEmail = new JLabel("Correo Electrónico:");
        JTextField txtEmail = new JTextField();

        JLabel lblTelefono = new JLabel("Teléfono:");
        JTextField txtTelefono = new JTextField();

        JLabel lblContrasena = new JLabel("Contraseña:");
        JPasswordField txtContrasena = new JPasswordField();

        // Botón de registro
        JButton btnRegistrar = new JButton("Registrar");

        // Añadir componentes al panel
        panel.add(lblNombre);
        panel.add(txtNombre);

        panel.add(lblApellido);
        panel.add(txtApellido);

        panel.add(lblEmail);
        panel.add(txtEmail);

        panel.add(lblTelefono);
        panel.add(txtTelefono);

        panel.add(lblContrasena);
        panel.add(txtContrasena);

        // Añadir el botón al panel principal
        panel.add(new JLabel()); // Espacio vacío
        panel.add(btnRegistrar);

        // Añadir el panel al marco principal
        frame.add(panel, BorderLayout.CENTER);

        // Agregar acción al botón
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String email = txtEmail.getText();
                String telefono = txtTelefono.getText();
                String contrasena = new String(txtContrasena.getPassword());

                if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || telefono.isEmpty() || contrasena.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Registro exitoso!\nUsuario: " + nombre + " " + apellido, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Hacer visible el marco
        frame.setLocationRelativeTo(null); // Centrar en pantalla
        frame.setVisible(true);
    }
}

}
