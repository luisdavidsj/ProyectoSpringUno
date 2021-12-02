package es.pildoras.IoC;

//1. Creacion de clase e interfaz para la dependencia
public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		return "Esta es la presentacion del informe";
	}

}
