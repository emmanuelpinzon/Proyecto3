package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import co.edu.unbosque.view.Vista;

public class Controlador implements ActionListener{
private Vista vista;
	Properties translation = new Properties();
	String rutaArchivo = "config/ejemplo2.properties";

	public Controlador() {
		vista = new Vista();
		archivo();

		run();
	}

	public void archivo() {
		// Constructor para inicializar la carga de propiedades
		try (FileInputStream diccionario = new FileInputStream(rutaArchivo)) {
			translation.load(diccionario);
			String palabraTraducida = translation.getProperty("Hola");
			System.out.println("La traducción de 'house' es: " + palabraTraducida);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        String idiomaSeleccionado = vista.getIdiomaSeleccionado();
        
        // Actualizar la etiqueta en la vista
        vista.actualizarEtiqueta("Has seleccionado: " + idiomaSeleccionado);
	}

}