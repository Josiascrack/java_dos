package pe.edu.upeu.pymvc.model;

public class Alumno {
private int idalum;
private String	nombre;
private String telefono;
private String direccion;
public Alumno() {
	
}
public Alumno(int idalum, String nombre, String telefono, String direccion) {
	super();
	this.idalum = idalum;
	this.nombre = nombre;
	this.telefono = telefono;
	this.direccion = direccion;
}
public int getIdalum() {
	return idalum;
}
public void setIdalum(int idalum) {
	this.idalum = idalum;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
@Override
public String toString() {
	return "Alumno [idalum=" + idalum + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
			+ "]";
}


}
