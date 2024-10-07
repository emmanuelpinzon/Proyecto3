package co.edu.unbosque.view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class Vista extends JFrame {
    private JComboBox<String> comboBox;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public Vista() {
        // Configurar el JFrame
        this.setTitle("Selección de Idioma y Texto");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // Crear un JComboBox con los idiomas
        String[] idiomas = { "Español", "Inglés", "Latín", "Francés", "Italiano", "Portugués" };
        comboBox = new JComboBox<>(idiomas);
        comboBox.setBounds(50, 50, 150, 30);

        // Etiqueta para mostrar la selección
        label = new JLabel("Selecciona un idioma");
        label.setBounds(50, 100, 300, 30);

        // Crear un JTextField para ingresar texto
        textField = new JTextField();
        textField.setBounds(50, 150, 150, 30); // Posicionamos el campo de texto
        
        button = new JButton("traducir");
        button.setBounds(50, 300, 400, 30);
        

        // Añadir componentes al JFrame
        this.add(comboBox);
        this.add(label);
        this.add(textField); // Agregar JTextField al JFrame
        this.add(button);

        // Hacer visible el JFrame
        this.setVisible(true);
    }



    // Método para actualizar la etiqueta
    public void actualizarEtiqueta(String texto) {
        label.setText(texto);
    }

    // Método para obtener el idioma seleccionado
    public String getIdiomaSeleccionado() {
        return (String) comboBox.getSelectedItem();
    }

    // Método para obtener el texto ingresado en el JTextField
    public String getTextoIngresado() {
        return textField.getText();
    }



	public JButton getButton() {
		return button;
	}



	public void setButton(JButton button) {
		this.button = button;
	}
    
}
 