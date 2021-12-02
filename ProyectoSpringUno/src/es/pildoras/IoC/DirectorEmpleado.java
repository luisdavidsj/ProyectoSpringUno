package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	//2. Crear el constructor para poder crear la inyeccion de dependencias
	//Creacion de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}

}
