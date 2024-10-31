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
    private boolean menuP = false;
    private boolean inicioSesionE = false;
    private boolean registroE= false;
    private boolean menuE = false;
    private boolean menuPpalP = false;
    private boolean menuPpalE = false;
    private boolean agendarCitaP = false;
    private boolean reprogramarCitaP = false;
    
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
        
        vf.getPrincipal().getPanelMenuE().getbtnIniciarSesionEs().addActionListener(this);
        vf.getPrincipal().getPanelMenuE().getbtnIniciarSesionEs().setActionCommand("iniciar sesion especialista");
        
        vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().addActionListener(this);
        vf.getPrincipal().getPanelMenuPpal().getbtnRegistrarse().setActionCommand("registrarse");
        
        
        
        vf.getPrincipal().getPanelMenuE().getbtnRegistrarseE().addActionListener(this);
        vf.getPrincipal().getPanelMenuE().getbtnRegistrarseE().setActionCommand("registrar especialista");
       
        
        vf.getPrincipal().getPanelMenuPpal().getbtnVolver().addActionListener(this);
        vf.getPrincipal().getPanelMenuPpal().getbtnVolver().setActionCommand("volver al menu principal desde paciente");
        
        vf.getPrincipal().getPanelMenuE().getbtnVolver2().addActionListener(this);
        vf.getPrincipal().getPanelMenuE().getbtnVolver2().setActionCommand("volver al menu principal desde especialista");
       
        vf.getPrincipal().getPanelInicioSesionP().getBtnVolverP().addActionListener(this);
        vf.getPrincipal().getPanelInicioSesionP().getBtnVolverP().setActionCommand("volver al menu paciente desde inicio sesion");
      
        vf.getPrincipal().getPanelRegistroPaciente().getBtnVolverP1().addActionListener(this);
        vf.getPrincipal().getPanelRegistroPaciente().getBtnVolverP1().setActionCommand("volver al menu paciente desde registro");
        
        vf.getPrincipal().getPanelInicioSesionE().getBtnVolverE().addActionListener(this);
        vf.getPrincipal().getPanelInicioSesionE().getBtnVolverE().setActionCommand("volver al menu especialista desde inicio sesion");
      
        vf.getPrincipal().getPanelRegistroEspecialista().getBtnVolverEs().addActionListener(this);
        vf.getPrincipal().getPanelRegistroEspecialista().getBtnVolverEs().setActionCommand("volver al menu especialista desde registro");
        

        vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().addActionListener(this);
        vf.getPrincipal().getPanelRegistroPaciente().getBtnRegistrarP().setActionCommand("menu principal de paciente");
        
        vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().addActionListener(this);
        vf.getPrincipal().getPanelInicioSesionP().getBtnIniciarSesion().setActionCommand("menu principal de paciente");
        
        vf.getPrincipal().getPanelRegistroEspecialista().getBtnRegistrarE().addActionListener(this);
        vf.getPrincipal().getPanelRegistroEspecialista().getBtnRegistrarE().setActionCommand("menu principal de especialista");
        
        vf.getPrincipal().getPanelInicioSesionE().getBtnIniciarSesionE().addActionListener(this);
        vf.getPrincipal().getPanelInicioSesionE().getBtnIniciarSesionE().setActionCommand("menu principal de especialista");
        
        vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnVolverPP().addActionListener(this);
        vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnVolverPP().setActionCommand("volver al inicio sesion desde menu principal paciente");
        
        vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnVolverEE().addActionListener(this);
        vf.getPrincipal().getPanelMenuPrincipalEspecialista().getBtnVolverEE().setActionCommand("volver al inicio sesion desde menu principal especialista");
        
        vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnAgendarCita().addActionListener(this);
        vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnAgendarCita().setActionCommand("agendar cita paciente");
        
        vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnVolverCc().addActionListener(this);
        vf.getPrincipal().getPanelAgendarCitaPaciente().getBtnVolverCc().setActionCommand("volver de agendar cita paciente a menu principal paciente");
        
        vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnReprogramarCita().addActionListener(this);
        vf.getPrincipal().getPanelMenuPrincipalPaciente().getBtnReprogramarCita().setActionCommand("reprogramar cita paciente");
        
        vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnVolverRr().addActionListener(this);
        vf.getPrincipal().getPanelReprogramarCitaPaciente().getBtnVolverRr().setActionCommand("volver de reprogramar cita paciente a menu principal paciente");
        
        vf.getPrincipal().getPanelRegistroPaciente().getNombre().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setVisible(true);
		vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setVisible(true);
		
		vf.getPrincipal().getPanelRegistroEspecialista().getNombre().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getNumeroDocumento().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getCorreo().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getContraseña().setVisible(true);
		vf.getPrincipal().getPanelRegistroEspecialista().getTipoEspecialidad().setVisible(true);
        
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
                
            case "Especialista":
                
                vf.getPrincipal().setTitle("MENU ESPECIALISTA");

                vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);
                

                vf.getPrincipal().mostrarPanelMenuEspecialista();

               
                especialista = true;
                
                break;
                
                
            case "registrarse":
            	vf.getPrincipal().setTitle("REGISTRAR PACIENTE");
            	
            	vf.getPrincipal().getPanelRegistroPaciente().getNombre().setVisible(true);
        		vf.getPrincipal().getPanelRegistroPaciente().getNumeroDocumento().setVisible(true);
        		vf.getPrincipal().getPanelRegistroPaciente().getCorreo().setVisible(true);
        		vf.getPrincipal().getPanelRegistroPaciente().getContraseña().setVisible(true);
        		vf.getPrincipal().getPanelRegistroPaciente().getJcbGenero().setVisible(true);
            	
            	vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(true);
                

                vf.getPrincipal().mostrarPanelRegistroPaciente();

               
                registroP = true;
                
                break;
              
            case "registrar especialista":
            	vf.getPrincipal().setTitle("REGISTRAR ESPECIALISTA");
            	
            	vf.getPrincipal().getPanelRegistroEspecialista().getNombre().setVisible(true);
        		vf.getPrincipal().getPanelRegistroEspecialista().getNumeroDocumento().setVisible(true);
        		vf.getPrincipal().getPanelRegistroEspecialista().getCorreo().setVisible(true);
        		vf.getPrincipal().getPanelRegistroEspecialista().getContraseña().setVisible(true);
        		vf.getPrincipal().getPanelRegistroEspecialista().getTipoEspecialidad().setVisible(true);
        		
            	vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(true);
                

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
                
            case "iniciar sesion especialista":
            	vf.getPrincipal().setTitle("INICIAR SESION ESPECIALISTA");
            	
            	
        		vf.getPrincipal().getPanelInicioSesionE().getNumeroDocumento().setVisible(true);
        		vf.getPrincipal().getPanelInicioSesionE().getContraseña().setVisible(true);
            	
            	vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(true);
                

                vf.getPrincipal().mostrarPanelInicioSesionEspecialista();

               
                inicioSesionE = true;
                
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
    			
    			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(false);
    			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);
    			
    			vf.getPrincipal().mostrarMenuPrincipal();
    			 
    			registroE = false;
    			menuPpal = true;
    			
    			break;	
            case "volver al menu paciente desde inicio sesion":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(false);
    			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);
    			
    			vf.getPrincipal().mostrarPanelMenuPaciente();
    			 
    			inicioSesionP = false;
    			menuP = true;
    			
    			break;	
    			
            case "volver al menu paciente desde registro":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
    			vf.getPrincipal().getPanelMenuPpal().getImagenMenuP().setVisible(true);
    			
    			vf.getPrincipal().mostrarPanelMenuPaciente();
    			 
    			registroP = false;
    			menuP = true;
    			
    			break;
    			
            case "volver al menu especialista desde inicio sesion":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(false);
    			vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);
    			
    			vf.getPrincipal().mostrarPanelMenuEspecialista();
    			 
    			inicioSesionE = false;
    			menuE = true;
    			
    			break;	
    			
            case "volver al menu especialista desde registro":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(false);
    			vf.getPrincipal().getPanelMenuE().getImagenMenuE().setVisible(true);
    			
    			vf.getPrincipal().mostrarPanelMenuEspecialista();
    			 
    			registroE = false;
    			menuE = true;
    			
    			break;
    			
            case "menu principal de paciente":
            	
            	vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(false);
    			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);
    			
    			vf.getPrincipal().getPanelRegistroPaciente().getImagenRegistroP().setVisible(false);
    			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);
    			
    			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();
    			 
    			inicioSesionP = false;
    			registroP = false;
    			menuPpalP = true;
    			
    			
    			break;
    			
            case "menu principal de especialista":
            	
            	vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(false);
    			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);
    			
    			vf.getPrincipal().getPanelRegistroEspecialista().getImagenRegistroE().setVisible(false);
    			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(true);
    			
    			vf.getPrincipal().mostrarPanelMenuPrincipalEspecialista();
    			 
    			inicioSesionE = false;
    			registroE = false;
    			menuPpalE = true;
    			
    			
    			break;
    			
    			case "volver al inicio sesion desde menu principal paciente":
    			
    			vf.getPrincipal().setTitle("MENU PRINCIPAL");
    			
    			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
    			vf.getPrincipal().getPanelInicioSesionP().getImagenInicioSesionP().setVisible(true);
    			
    			
    			vf.getPrincipal().mostrarPanelInicioSesionPaciente();
    			 
    			menuPpalP = false;
    			menuP = true;
    			
    			break;
    			
    			case "volver al inicio sesion desde menu principal especialista":
        			
        			vf.getPrincipal().setTitle("MENU PRINCIPAL");
        			
        			vf.getPrincipal().getPanelMenuPrincipalEspecialista().getImagenMenuPpalE().setVisible(false);
        			vf.getPrincipal().getPanelInicioSesionE().getImagenInicioSesionE().setVisible(true);
        			
        			vf.getPrincipal().mostrarPanelInicioSesionEspecialista();
        			 
        			menuPpalE = false;
        			menuE = true;
        			
        			break;
        			
    			
    			
    			case "agendar cita paciente":
    				
    				vf.getPrincipal().setTitle("MENU PRINCIPAL");
    				
    				vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
        			vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(true);
        			
        			vf.getPrincipal().mostrarPanelAgendarCitaPaciente();
        			 
        			menuPpalP = false;
        			agendarCitaP = true;
        			
        			break;
        			
    			case "volver de agendar cita paciente a menu principal paciente":
    				
    				vf.getPrincipal().setTitle("MENU PRINCIPAL");
        			
        			vf.getPrincipal().getPanelAgendarCitaPaciente().getImagenAgendarCitaP().setVisible(false);
        			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);
        			
        			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();
        			 
        			agendarCitaP = false;
        			menuPpalP = true;
        			
        			break;
        			
    			case "reprogramar cita paciente":
    				
    				vf.getPrincipal().setTitle("MENU PRINCIPAL");
    				
    				vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(false);
        			vf.getPrincipal().getPanelReprogramarCitaPaciente().getImagenReprogramarCitaP().setVisible(true);
        			
        			vf.getPrincipal().mostrarPanelReprogramarCitaPaciente();
        			 
        			menuPpalP = false;
        			reprogramarCitaP = true;
        			
        			break;
    	        
    			case "volver de reprogramar cita paciente a menu principal paciente":
    				
    				vf.getPrincipal().setTitle("MENU PRINCIPAL");
        			
        			vf.getPrincipal().getPanelReprogramarCitaPaciente().getImagenReprogramarCitaP().setVisible(false);
        			vf.getPrincipal().getPanelMenuPrincipalPaciente().getImagenMenuPpalP().setVisible(true);
        			
        			vf.getPrincipal().mostrarPanelMenuPrincipalPaciente();
        			 
        			reprogramarCitaP = false;
        			menuPpalP = true;
        			
        			break;
           
    			
    		
    			
    			
            
            
            	
    			
           
           
    			
    			
    			
    			
    			
            
            	
            	
            	
            	
            
            

        }
    }
}
         