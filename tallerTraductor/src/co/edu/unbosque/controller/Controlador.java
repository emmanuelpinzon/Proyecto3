package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

    private ViewFacade vf;
    
    private boolean paciente = false;
    private boolean especialista = false;
    private boolean registroP= false;
    private boolean inicioSesionP = false;
    private boolean menuPpal = false;
    private boolean registroE= false;
    
    
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
        
        vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrar().addActionListener(this);
        vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrar().setActionCommand("registrar");
        
        vf.getPrincipal().getPanelRegistroE().getBtnRegistrarE().addActionListener(this);
        vf.getPrincipal().getPanelRegistroE().getBtnRegistrarE().setActionCommand("registrar especialista");
        
        vf.getPrincipal().getPanelMenuPpal().getbtnVolver().addActionListener(this);
        vf.getPrincipal().getPanelMenuPpal().getbtnVolver().setActionCommand("volver al menu principal desde paciente");
        
        vf.getPrincipal().getPanelMenuE().getbtnVolver2().addActionListener(this);
        vf.getPrincipal().getPanelMenuE().getbtnVolver2().setActionCommand("volver al menu principal desde especialista");
       
      
        
        vf.getPrincipal().getPanelRegistroPaciente().getNombre().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setVisible(true);
		
		vf.getPrincipal().getPanelRegistroE().getNombre1().setVisible(true);
		vf.getPrincipal().getPanelRegistroE().getNumeroDocumento1().setVisible(true);
		vf.getPrincipal().getPanelRegistroE().getCorreo1().setVisible(true);
		vf.getPrincipal().getPanelRegistroE().getContraseña1().setVisible(true);
		vf.getPrincipal().getPanelRegistroE().getTipoEspecialidad1().setVisible(true);
        
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
                
            case "registrarse":
            	vf.getPrincipal().setTitle("REGISTRAR PACIENTE");
            	
            	vf.getPrincipal().getPanelRegistroP().getNombre().setVisible(true);
        		vf.getPrincipal().getPanelRegistroP().getNumeroDocumento().setVisible(true);
        		vf.getPrincipal().getPanelRegistroP().getCorreo().setVisible(true);
        		vf.getPrincipal().getPanelRegistroP().getContraseña().setVisible(true);
            	
            	vf.getPrincipal().getPanelRegistroP().getImagenRegistroP().setVisible(true);
                

                vf.getPrincipal().mostrarPanelRegistroPaciente();

               
                registroP = true;
                
                break;
                
            case "registrar especialista":
            	vf.getPrincipal().setTitle("REGISTRAR ESPECIALISTA");
            	
            	vf.getPrincipal().getPanelRegistroE().getNombre1().setVisible(true);
        		vf.getPrincipal().getPanelRegistroE().getNumeroDocumento1().setVisible(true);
        		vf.getPrincipal().getPanelRegistroE().getCorreo1().setVisible(true);
        		vf.getPrincipal().getPanelRegistroE().getContraseña1().setVisible(true);
        		
            	
            	vf.getPrincipal().getPanelRegistroE().getImagenRegistroE().setVisible(true);
                

                vf.getPrincipal().mostrarPanelRegistroEspecialista();

               
                registroE = true;
                
                break;
                
           
            	
                
            case "iniciar sesion":
            	vf.getPrincipal().setTitle("INICIAR SESION PACIENTE");
            	
            	
        		vf.getPrincipal().getPanelInicioSesionP().getNumeroDocumento().setVisible(true);
        		vf.getPrincipal().getPanelInicioSesionP().getContraseña().setVisible(true);
            	
            	vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(true);
                

                vf.getPrincipal().mostrarPanelInicioSesionPaciente();

               
                inicioSesionP = true;
                
                break;
                
            case "volver al menu principal desde paciente":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
    			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);
    			
    			vf.getPrincipal().mostrarMenuPrincipal();
    			 
    			registroP = false;
    			menuPpal = true;
    			
    			break;
    			
            case "volver al menu principal desde especialista":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelRegistroE().getImagenRegistroE().setVisible(false);
    			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);
    			
    			vf.getPrincipal().mostrarMenuPrincipal();
    			 
    			registroE = false;
    			menuPpal = true;
    			
    			break;	
    			
         
            	
            	
    			
            case "Especialista":
                
                vf.getPrincipal().setTitle("MENU ESPECIALISTA");

                vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);
                

                vf.getPrincipal().mostrarPanelMenuEspecialista();

               
                especialista = true;
                
                break;
                
           
    			
    			
    			
    			
    			
            
            	
            	
            	
            	
            
            

        }
    }
}
         