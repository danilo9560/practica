import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Form;

public class RegistroUsuario {

    public static void main(String[] args) {
        // Crear el marco principal 
        JFrame frame = new JFrame("Registro de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        //frame.setLayout(new BorderLayout());
        // frame.setBackground(Color.decode("#FFFFFF"));
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH; // Expandir en ambas direcciones
        gbc.weightx = 1.0; // Expandir horizontalmente
        gbc.weighty = 1.0; // Expandir verticalmente


        // Crear el panel principal
        JPanel mainContainer = new JPanel();

        mainContainer.setLayout(new GridBagLayout());
        mainContainer.setBounds(50,50,800,300);
        mainContainer.setPreferredSize(new Dimension(400,300));
        mainContainer.setBackground(Color.decode("#ffbbff"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 1;
        frame.add(mainContainer,gbc);


        // Crear el formulario
        Form loginForm = new Form();
        loginForm.setBounds(50,50,800,300);
        GridBagConstraints gbcF = new GridBagConstraints();
        // gbcF.fill = GridBagConstraints.BOTH;
        gbcF.gridx = 0;
        gbcF.gridy = 0;
        // gbcF.weightx = 0.5;
        // gbcF.weighty = 0.8;
        mainContainer.add(loginForm,gbcF);




        // Crear etiquetas y campos de texto
        JLabel lblEstudiante = new JLabel("Estudiante:");
        // JTextField txtEstudiante = new JTextField();

        // JLabel lblApellido = new JLabel("Apellido:");
        // JTextField txtApellido = new JTextField();

        
        // JLabel lblEmail = new JLabel("Correo Electrónico:");
        // JTextField txtEmail = new JTextField();

        // JLabel lblTelefono = new JLabel("Teléfono:");
        // JTextField txtTelefono = new JTextField();

        // JLabel lblContrasena = new JLabel("Contraseña:");
        // JPasswordField txtContrasena = new JPasswordField();

        // Botón de registro
        JButton btnRegistrar = new JButton("Registrar");

        // Añadir componentes al panel
        // panel.add(lblEstudiante);
        // panel.add(txtEstudiante);

        // panel.add(lblApellido);
        // panel.add(txtApellido);

        // panel.add(lblEmail);
        // panel.add(txtEmail);

        // panel.add(lblTelefono);
        // panel.add(txtTelefono);

        // panel.add(lblContrasena);
        // panel.add(txtContrasena);

        // // Añadir el botón al panel principal
        // panel.add(new JLabel()); // Espacio vacío
        // panel.add(btnRegistrar);


        // Añadir el panel al marco principal

        //! Agregar acción al botón
        // btnRegistrar.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         // String estudiante = txtEstudiante.getText();
        //         // String apellido = txtApellido.getText();
        //         // String email = txtEmail.getText();
        //         // String telefono = txtTelefono.getText();
        //         // String contrasena = new String(txtContrasena.getPassword());

        //         if (estudiante.isEmpty() || apellido.isEmpty() || email.isEmpty() || telefono.isEmpty() || contrasena.isEmpty()) {
        //             JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        //         } else {
        //             JOptionPane.showMessageDialog(frame, "Registro exitoso!\nUsuario: " + estudiante + " " + apellido, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        //         }
        //     }
        // });

        // Hacer visible el marco
        //frame.setLocationRelativeTo(null); // Centrar en pantalla
        frame.setVisible(true);
    }
}
