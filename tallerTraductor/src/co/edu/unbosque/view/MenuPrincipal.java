package co.edu.unbosque.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton btnPaciente, btnEspecialista;

	public MenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);

		imagenPpal = new JLabel();
		ImageIcon imagen1 = new ImageIcon("src/media/MenuPrincipall.png");

		Image redimensionado = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		btnPaciente = new JButton("paciente");
		btnPaciente.setBounds(350, 328, 300, 110);
		btnPaciente.setOpaque(false);
		btnPaciente.setActionCommand("PACIENTE");

		btnEspecialista = new JButton("especialista ");
		btnEspecialista.setBounds(700, 338, 300, 100);
		btnEspecialista.setOpaque(false);
		btnEspecialista.setActionCommand("ESPECIALISTA");
		
		add(imagenPpal);
		add(btnPaciente);
		add(btnEspecialista);


	}

	public JLabel getImagenPpal() {
		return imagenPpal;
	}

	public void setImagenPpal(JLabel imagenPpal) {
		this.imagenPpal = imagenPpal;
	}

	public JButton getbtnPaciente() {
		return btnPaciente;
	}

	public void setbtnPaciente(JButton btnPaciente) {
		this.btnPaciente = btnPaciente;
	}

	public JButton getbtnEspecialista() {
		return btnEspecialista;
	}

	public void setbtnEspecialista(JButton btnEspecialista) {
		this.btnEspecialista = btnEspecialista;
	}

}