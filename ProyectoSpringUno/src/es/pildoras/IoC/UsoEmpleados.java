package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		//Prueba de cambios 2
		/*//Creacion de objetos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(Empleado1.getTareas());*/
		
		
		//1. Cargar archivo XML 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. Pedir el Bean
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		//3. Utilizar el Bean
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		/*SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: " + Maria.getEmail());
		
		System.out.println(Maria.getNombreEmpresa());
		
		System.out.println("Email Pablo: " + Pablo.getEmail());*/
		
		
		//4. Cerrar el XML
		contexto.close();
		
		
	}
}
