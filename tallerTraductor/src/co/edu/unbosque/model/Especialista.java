package co.edu.unbosque.model;

public class Especialista extends Persona {
private String tipoEspecialista;

public Especialista() {
	// TODO Auto-generated constructor stub
}

public Especialista(String tipoEspecialista) {
	super();
	this.tipoEspecialista = tipoEspecialista;
}

public Especialista(String nombre, int cedula, String correo, int contraseña, String tipoEspecialista) {
	super(nombre, cedula, correo, contraseña);
	this.tipoEspecialista = tipoEspecialista;
}

public Especialista(String nombre, int cedula, String correo, int contraseña) {
	super(nombre, cedula, correo, contraseña);
	// TODO Auto-generated constructor stub
}

public String getTipoEspecialista() {
	return tipoEspecialista;
}

public void setTipoEspecialista(String tipoEspecialista) {
	this.tipoEspecialista = tipoEspecialista;
}

@Override
public String toString() {
	return super.toString()+"tipoEspecialista=" + tipoEspecialista + "]";
}

}
