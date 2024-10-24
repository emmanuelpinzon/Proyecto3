package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {

    private MenuPrincipal menuPpal;


    public VentanaPrincipal() {
        setLocation(70, 70);
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setVisible(true);

        setTitle("MENU PRINCIPAL");

        ImageIcon logo = new ImageIcon("src/media/logoHospital.png");
        setIconImage(logo.getImage());

        menuPpal = new MenuPrincipal();

    }





	public void mostrarMenuPrincipal() {
        setContentPane(menuPpal);
		revalidate();
		repaint();
    }


    public MenuPrincipal getMenuPpal() {
        return menuPpal;
    }



}