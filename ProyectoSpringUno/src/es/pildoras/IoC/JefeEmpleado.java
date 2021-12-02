package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
		
		
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
	
}
