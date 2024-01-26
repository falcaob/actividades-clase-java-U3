package automoviles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Automovil miCoche;
		
		System.out.println("Dame los datos del coche");
		System.out.println("Matricula: ");
		String matricula = sc.next();
		System.out.println("Marca: ");
		String marca = sc.next();
		System.out.println("Color: ");
		String color = sc.next();
		System.out.println("Antiguedad: ");
		int nAnyos = sc.nextInt();
		System.out.println("Velocidad actual: ");
		double velocidad = sc.nextDouble();
		System.out.println("Tipo combustible: ");
		String tipoCombustible = sc.next();
		
		miCoche = new Automovil(matricula, marca, color, nAnyos, velocidad, tipoCombustible);
		
		System.out.println("\nSe ha creado un nuevo automóvil");
		miCoche.mostrarDatos();
		
		/*
		 * Crear un menú que de al usuario las siguientes opciones:
		 * 
		 * 1. Crear un coche
		 * 2. Arrancar el coche
		 * 3. Acelerar el coche
		 * 4. Frenar el coche
		 * 5. Parar el coche
		 * 6. Mostrar el precio del combustible que usa el coche
		 * 7. Mofificar el precio del combustible que usa el coche
		 * 8. Calcular el consumo en € del coche
		 * 9. Salir
		 * 
		 */
		
		
		
		/*
		// Creo un coche
		Automovil miCoche;
		miCoche = new Automovil("2356LKO", "Nissan", "Blanco", 5, 0.0);
		miCoche.mostrarDatos();
		
		Automovil a1 = new Automovil("4444LLL", "Nissan", "Azul", 3, 0.0);
		//de esta forma puedo cambiar sus atributos
		a1.setTipoCombustible("Gasolina");
		
		Automovil a2 = new Automovil("7777LLL", "Renault", "Blanco", 2, 0.0);
		a2.setTipoCombustible("Diesel");
		
		Automovil a3 = new Automovil("3333ZZZ");
		Automovil a4 = new Automovil("5555HHH", "Citroen");
		a4.setColor("Rojo");
		System.out.println("PRIMER COCHE");
		a1.mostrarDatos();
		System.out.println("Tipo combustible: " + a1.getTipoCombustible());
		
		System.out.println("\nSEGUNDO COCHE");
		a2.mostrarDatos();
		System.out.println("Tipo combustible: " + a2.getTipoCombustible());
		
		System.out.println("\nTERCER COCHE");
		a3.mostrarDatos();
		System.out.println("Tipo combustible: " + a3.getTipoCombustible());
		
		System.out.println("\nCUARTO COCHE");
		a4.mostrarDatos();
		System.out.println("Tipo combustible: " + a4.getTipoCombustible());
		
		
		// Arranco el coche
		miCoche.arrancar();
		miCoche.mostrarDatos();

		// Acelero el coche
		miCoche.acelerar(40);
		miCoche.mostrarDatos();

		// Freno el coche
		miCoche.frenar(10);
		miCoche.frenar(20);
		miCoche.mostrarDatos();

		// Pintamos el coche
		miCoche.pintarCoche("Blanco");
		miCoche.mostrarDatos();
		miCoche.pintarCoche("Verde y Blanco");
		miCoche.mostrarDatos();

		// Vamos a ver la velocidad a la que va el coche
		// También puede ser:
		// System.out.println("\nEl coche va a: "+miCoche.getVelocidad()+" kms/h");
		double velocidadActual = miCoche.getVelocidad();
		System.out.println("\nEl coche va a: " + velocidadActual + " kms/h");
		*/

	}

}