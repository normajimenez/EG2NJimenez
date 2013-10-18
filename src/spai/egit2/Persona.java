package spai.egit2;

public class Persona {
    private String nombre;
    private String apellido;
    private String apellidoMaterno;

    private String format(String cadena) {
        cadena = cadena.trim();
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
    }

    public Persona(String nombre, String apellido, String apellidoM) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setApellidoMaterno(apellidoM);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = this.format(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = this.format(apellido);
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido + " " + this.apellidoMaterno;
    }

    public String inicial() {
        return this.nombre.substring(0, 1) + ".";
    }
    
    public String getApellidoMaterno(){
    	return apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoM){
    	this.apellidoMaterno = this.format(apellidoM);
    }
    
}
