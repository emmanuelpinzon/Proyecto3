package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class PanelRegistroPaciente extends JPanel {

	
	private JTextField nombre, numeroDocumento, correo, contraseña;
    private JButton  btnRegistrar, btnVolver;
    private JLabel imagenRegistroP;
    

    public PanelRegistroPaciente() {
    	
    	Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
    	
        setLayout(null);
        setVisible(true);
        setSize(1280, 720);
    
        
       
		nombre= new JTextField();
		nombre.setBounds(155, 345, 300, 60);
		nombre.setOpaque(true);
		
		numeroDocumento = new JTextField();
		numeroDocumento.setBounds(160, 507, 300, 55);
		numeroDocumento.setOpaque(true);

		correo = new JTextField();
		correo.setBounds(780, 345, 300, 62);
		correo.setOpaque(true);
		
		contraseña = new JTextField();
		contraseña.setBounds(785, 507, 300, 55);
		contraseña.setOpaque(true);
		

    

        // Botón "Registrarse"
		
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(640, 600, 200, 50); // Posición ajustada
        btnRegistrar.setOpaque(true);
        btnRegistrar.setActionCommand("REGISTRAR");

        // Botón "Volver"
        btnVolver = new JButton("Volver");
        btnVolver.setBounds(490, 610, 150, 50); // Posición ajustada
        btnVolver.setOpaque(true);
        btnVolver.setActionCommand("VOLVER");
        

        imagenRegistroP = new JLabel();
        ImageIcon imagen1 = new ImageIcon("src/media/RegistroPaciente.png");
        Image redimensionado1 = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
        imagenRegistroP.setIcon(new ImageIcon(redimensionado1));
        imagenRegistroP.setBounds(0, 0, 1280, 720);


        
        
        add(nombre);
       	add(numeroDocumento);
       	add(correo);
       	add(contraseña);
        add(btnRegistrar);
        add(btnVolver);
        
        add(imagenRegistroP);
        
        
        setComponentZOrder(nombre, 0);
        setComponentZOrder(numeroDocumento, 1);
        setComponentZOrder(correo, 2);
        setComponentZOrder(contraseña, 3);
        setComponentZOrder(btnRegistrar, 4);
        setComponentZOrder(btnVolver, 5);
        setComponentZOrder(imagenRegistroP, 6);
           }


	

	public JTextField getNombre() {
		return nombre;
	}


	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}


	public JTextField getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(JTextField numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public JTextField getCorreo() {
		return correo;
	}


	public void setCorreo(JTextField correo) {
		this.correo = correo;
	}


	public JTextField getContraseña() {
		return contraseña;
	}


	public void setContraseña(JTextField contraseña) {
		this.contraseña = contraseña;
	}


	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}


	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}


	public JButton getBtnVolver() {
		return btnVolver;
	}


	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	
	public JLabel getImagenRegistroP() {
		return imagenRegistroP;
	}


	public void setImagenRegistroP(JLabel imagenRegistroP) {
		this.imagenRegistroP = imagenRegistroP;
	}

    }