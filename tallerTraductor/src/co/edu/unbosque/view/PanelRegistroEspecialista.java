package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRegistroEspecialista extends JPanel {

	
	private JTextField nombre1, numeroDocumento1, correo1, contraseña1, tipoEspecialidad1;
    private JButton  btnRegistrarE, btnVolver1;
    private JLabel imagenRegistroE;
    

    public PanelRegistroEspecialista() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
		nombre1= new JTextField();
		nombre1.setBounds(155, 345, 300, 60);
		nombre1.setOpaque(true);
		
		numeroDocumento1 = new JTextField();
		numeroDocumento1.setBounds(160, 507, 300, 55);
		numeroDocumento1.setOpaque(true);

		correo1 = new JTextField();
		correo1.setBounds(780, 345, 300, 62);
		correo1.setOpaque(true);
		
		contraseña1 = new JTextField();
		contraseña1.setBounds(785, 507, 300, 55);
		contraseña1.setOpaque(true);
		
		tipoEspecialidad1 = new JTextField();
		tipoEspecialidad1.setBounds(785, 507, 300, 55);
		contraseña1.setOpaque(true);
		

    

        // Botón "Registrarse"
		
        btnRegistrarE = new JButton("Registrar");
        btnRegistrarE.setBounds(640, 600, 200, 50); // Posición ajustada
        btnRegistrarE.setOpaque(true);
        btnRegistrarE.setActionCommand("REGISTRAR");

        // Botón "Volver"
        btnVolver1 = new JButton("Volver");
        btnVolver1.setBounds(490, 610, 150, 50); // Posición ajustada
        btnVolver1.setOpaque(true);
        btnVolver1.setActionCommand("VOLVER");
        

        imagenRegistroE = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RegistroEspecialista.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenRegistroE.setIcon(new ImageIcon(redimensionado1));
        imagenRegistroE.setBounds(0, 0, 1280, 720);


        
        
        add(nombre1);
       	add(numeroDocumento1);
       	add(correo1);
       	add(contraseña1);
       	add(tipoEspecialidad1);
        add(btnRegistrarE);
        add(btnVolver1);
        
        add(imagenRegistroE);
        
        
        setComponentZOrder(nombre1, 0);
        setComponentZOrder(numeroDocumento1, 1);
        setComponentZOrder(correo1, 2);
        setComponentZOrder(contraseña1, 3);
        setComponentZOrder(tipoEspecialidad1, 4);
        setComponentZOrder(btnRegistrarE, 5);
        setComponentZOrder(btnVolver1, 6);
        setComponentZOrder(imagenRegistroE, 7);
           }


	

	public JTextField getNombre1() {
		return nombre1;
	}


	public void setNombre1(JTextField nombre1) {
		this.nombre1 = nombre1;
	}


	public JTextField getNumeroDocumento1() {
		return numeroDocumento1;
	}


	public void setNumeroDocumento1(JTextField numeroDocumento1) {
		this.numeroDocumento1 = numeroDocumento1;
	}


	public JTextField getCorreo1() {
		return correo1;
	}


	public void setCorreo1(JTextField correo1) {
		this.correo1 = correo1;
	}


	public JTextField getContraseña1() {
		return contraseña1;
	}


	public void setContraseña1(JTextField contraseña1) {
		this.contraseña1 = contraseña1;
	}
	
	public JTextField getTipoEspecialidad1() {
		return tipoEspecialidad1;
	}


	public void setTipoEspecialidad1(JTextField tipoEspecialidad1) {
		this.tipoEspecialidad1 = tipoEspecialidad1;
	}



	public JButton getBtnRegistrarE() {
		return btnRegistrarE;
	}


	public void setBtnRegistrarE(JButton btnRegistrarE) {
		this.btnRegistrarE = btnRegistrarE;
	}


	public JButton getBtnVolver1() {
		return btnVolver1;
	}


	public void setBtnVolver1(JButton btnVolver1) {
		this.btnVolver1 = btnVolver1;
	}

	
	public JLabel getImagenRegistroE() {
		return imagenRegistroE;
	}


	public void setImagenRegistroE(JLabel imagenRegistroE) {
		this.imagenRegistroE = imagenRegistroE;
	}

    }
