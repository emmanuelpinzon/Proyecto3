package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {

    private MenuPrincipal menuPpal;
    private PanelMenuPaciente panelMenuP;
    private PanelRegistroPaciente panelRegistroP;
    private PanelInicioSesionPaciente panelInicioSesionP;
    private PanelMenuEspecialista panelMenuE;
    private PanelInicioSesionEspecialista panelInicioSesionE;
    private PanelRegistroEspecialista panelRegistroE;
    private PanelMenuPrincipalPaciente panelMenuPpalP;
    private PanelMenuPrincipalEspecialista panelMenuPpalE;
    private PanelAgendarCitaPaciente panelAgendarCitaP;
    private PanelReprogramarCitaPaciente panelReprogramarCitaP;

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
        panelInicioSesionE = new PanelInicioSesionEspecialista();
        panelRegistroE = new PanelRegistroEspecialista();
        panelMenuPpalP = new PanelMenuPrincipalPaciente();
        panelMenuPpalE = new PanelMenuPrincipalEspecialista();
        panelAgendarCitaP = new PanelAgendarCitaPaciente();
        panelReprogramarCitaP = new PanelReprogramarCitaPaciente();
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
   
    
    
    public void mostrarPanelInicioSesionEspecialista() {
        setContentPane(panelInicioSesionE);
		revalidate();
		repaint();
    }


    public PanelInicioSesionEspecialista getPanelInicioSesionE() {
        return panelInicioSesionE;
    }
    
    public void mostrarPanelRegistroEspecialista() {
        setContentPane(panelRegistroE);
		revalidate();
		repaint();
    }


    public PanelRegistroEspecialista getPanelRegistroEspecialista() {
        return panelRegistroE;
    }
    
    
    public void mostrarPanelMenuPrincipalPaciente() {
        setContentPane(panelMenuPpalP);
		revalidate();
		repaint();
    }


    public PanelMenuPrincipalPaciente getPanelMenuPrincipalPaciente() {
        return panelMenuPpalP;
    }

    public void mostrarPanelMenuPrincipalEspecialista() {
        setContentPane(panelMenuPpalE);
		revalidate();
		repaint();
    }


    public PanelMenuPrincipalEspecialista getPanelMenuPrincipalEspecialista() {
        return panelMenuPpalE;
    }
    
    
    public void mostrarPanelAgendarCitaPaciente() {
        setContentPane(panelAgendarCitaP);
		revalidate();
		repaint();
    }


    public PanelAgendarCitaPaciente getPanelAgendarCitaPaciente() {
        return panelAgendarCitaP;
    }

    public void mostrarPanelReprogramarCitaPaciente() {
        setContentPane(panelReprogramarCitaP);
		revalidate();
		repaint();
    }


    public PanelReprogramarCitaPaciente getPanelReprogramarCitaPaciente() {
        return panelReprogramarCitaP;
    }





	





}