package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {

    private MenuPrincipal menuPpal;
    private PanelMenuPaciente panelMenuP;
    private PanelRegistroPaciente panelRegistroP;
    private PanelInicioSesionPaciente panelInicioSesionP;
    private PanelMenuEspecialista panelMenuE;
    private PanelRegistroEspecialista panelRegistroE;

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
        panelMenuP = new PanelMenuPaciente();
        panelRegistroP = new PanelRegistroPaciente();
        panelInicioSesionP = new PanelInicioSesionPaciente();
        panelMenuE = new PanelMenuEspecialista();
        panelRegistroE = new PanelRegistroEspecialista();

    }





	public void mostrarMenuPrincipal() {
        setContentPane(menuPpal);
		revalidate();
		repaint();
    }


    public MenuPrincipal getMenuPpal() {
        return menuPpal;
    }


	public void mostrarPanelMenuPaciente() {
        setContentPane(panelMenuP);
		revalidate();
		repaint();
    }


    public PanelMenuPaciente getPanelMenuPpal() {
        return panelMenuP;
    }
    
    public void mostrarPanelRegistroPaciente() {
        setContentPane(panelRegistroP);
		revalidate();
		repaint();
    }


    public PanelRegistroPaciente getPanelRegistroPaciente() {
        return panelRegistroP;
    }
    
    
    
    
    
    
    
    public void mostrarPanelInicioSesionPaciente() {
        setContentPane(panelInicioSesionP);
		revalidate();
		repaint();
    }


    public PanelInicioSesionPaciente getPanelInicioSesionP() {
        return panelInicioSesionP;
    }
    
    
    public void mostrarPanelMenuEspecialista() {
        setContentPane(panelMenuE);
		revalidate();
		repaint();
    }
    public PanelMenuEspecialista getPanelMenuE() {
        return panelMenuE;
    }
   
    
    public void mostrarPanelRegistroEspecialista() {
        setContentPane(panelRegistroE);
		revalidate();
		repaint();
    }


    public PanelRegistroEspecialista getPanelRegistroE() {
        return panelRegistroE;
    }





	public PanelRegistroEspecialista getPanelRegistroEspecialista() {
		// TODO Auto-generated method stub
		return null;
	}





	public PanelRegistroPaciente getPanelRegistroP() {
		return panelRegistroP;
	}
    
    





	





}