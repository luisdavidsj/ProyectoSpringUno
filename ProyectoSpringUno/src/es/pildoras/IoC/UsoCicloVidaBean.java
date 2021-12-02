package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		//1. Cargar archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//2. Obtencion del Bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		//Probando ejecutando un metodo de la clase Empleados:
		System.out.println(Juan.getInforme());
		
		//3. Cerrar el contexto
		contexto.close();
	}

}
