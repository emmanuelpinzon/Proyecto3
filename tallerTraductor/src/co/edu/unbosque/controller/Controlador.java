package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

    private ViewFacade vf;
    
    private boolean paciente = false;
    private boolean especialista = false;
    
    
    public Controlador() {
        vf = new ViewFacade();
        vf.getPrincipal().mostrarMenuPrincipal();
        vf.getCon().mostrarMensajeEmergente("Bienvenido a Bosque Health");

        asignarLectores();
    }

    public void asignarLectores() {
        vf.getPrincipal().getMenuPpal().getbtnPaciente().addActionListener(this);
        vf.getPrincipal().getMenuPpal().getbtnPaciente().setActionCommand("Paciente");

        vf.getPrincipal().getMenuPpal().getbtnEspecialista().addActionListener(this);
        vf.getPrincipal().getMenuPpal().getbtnEspecialista().setActionCommand("Especialista");
        
        vf.getPrincipal().getPanelMenuPpal().getbtnIniciarSesion().addActionListener(this);
        vf.getPrincipal().getPanelMenuPpal().getbtnIniciarSesion().setActionCommand("iniciar sesion");
        
        vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().addActionListener(this);
        vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().setActionCommand("registrarse");
        
        vf.getPrincipal().getPanelMenuPpal().getbtnVolver().addActionListener(this);
        vf.getPrincipal().getPanelMenuPpal().getbtnVolver().setActionCommand("volver");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Paciente":
               
                vf.getPrincipal().setTitle("MENU PACIENTE");

                vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);
                

                vf.getPrincipal().mostrarPanelMenuPaciente();

               
                paciente = true;
                

                break;

        }
    }
}
         