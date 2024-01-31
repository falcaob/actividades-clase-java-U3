package automoviles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Automovil miAutomovil = null; //creamos el automovil
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			InterfazUsuario.imprimirMenu();
			System.out.println("\nIndica una opción (1-10):");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1: //Crear coche
				
				//asigno la creacion
				miAutomovil = Automovil.crearAutomovil();
				InterfazUsuario.esperaIntro(sc);
				break;
			case 2: ////Mostrar datos
				//Necesito un objeto coche desde donde llamar al método de instancia en la clase Automovil
				
				/*
				//comprobamos si se ha creado el automovil
				//esto puede hacerse en un método para no repetirlo en cada caso
				if(miAutomovil == null) {
					System.out.println("Debes crear primero un Automovil");
				} else {
					miAutomovil.mostrarDatos();
				}
				*/
				
				if(Automovil.existeAutomovil(miAutomovil)) 
					miAutomovil.mostrarDatos();
				InterfazUsuario.esperaIntro(sc);
				break;
				
			case 3: //Arranca coche
				if(Automovil.existeAutomovil(miAutomovil)) 
					miAutomovil.arrancar();
				InterfazUsuario.esperaIntro(sc);
				break;
			case 4: //Acelerar
				if(Automovil.existeAutomovil(miAutomovil)) {
					double aceleracion;
					
					System.out.println("¿Cuánto quieres acelerar?");
					
					if((aceleracion = sc.nextDouble()) >= 50) {
						System.out.println("Dejate de ir!");
					}else {
						miAutomovil.acelerar(aceleracion);
					}
				} 
				InterfazUsuario.esperaIntro(sc);
				break;
			case 5: //Frenar
				if(Automovil.existeAutomovil(miAutomovil)) {
					double frenado;
					
					System.out.println("¿Cuánto quieres frenar?");
					frenado = sc.nextDouble();
					miAutomovil.frenar(frenado);
				}
				
				InterfazUsuario.esperaIntro(sc);
				break;
			case 6: //Parar
				InterfazUsuario.esperaIntro(sc);
				break;
			case 7: //Mostrar precio Combustible
				InterfazUsuario.esperaIntro(sc);
				break;
			case 8: //Modificar precio Combustibl
				InterfazUsuario.esperaIntro(sc);
				break;
			case 9: //Calcular consumo del coche
				InterfazUsuario.esperaIntro(sc);
				break;
			case 10: //Salir
				System.out.println("Nos vamos");
				InterfazUsuario.esperaIntro(sc);
				break;				
			default:
				System.out.println("Opción no válida");
				InterfazUsuario.esperaIntro(sc);
				break;
			}

		} while (opcion != 10);
		
		

		/*
		 * Scanner sc = new Scanner(System.in); Automovil miCoche;
		 * 
		 * System.out.println("Dame los datos del coche");
		 * System.out.println("Matricula: "); String matricula = sc.next();
		 * System.out.println("Marca: "); String marca = sc.next();
		 * System.out.println("Color: "); String color = sc.next();
		 * System.out.println("Antiguedad: "); int nAnyos = sc.nextInt();
		 * System.out.println("Velocidad actual: "); double velocidad = sc.nextDouble();
		 * System.out.println("Tipo combustible: "); String tipoCombustible = sc.next();
		 * 
		 * miCoche = new Automovil(matricula, marca, color, nAnyos, velocidad,
		 * tipoCombustible);
		 * 
		 * System.out.println("\nSe ha creado un nuevo automóvil");
		 * miCoche.mostrarDatos();
		 */

		/*
		 * Crear un menú que de al usuario las siguientes opciones:
		 * 
		 * 1. Crear un coche 2. Arrancar el coche 3. Acelerar el coche 4. Frenar el
		 * coche 5. Parar el coche 6. Mostrar el precio del combustible que usa el coche
		 * 7. Mofificar el precio del combustible que usa el coche 8. Calcular el
		 * consumo en € del coche 9. Salir
		 * 
		 */

		/*
		 * // Creo un coche Automovil miCoche; miCoche = new Automovil("2356LKO",
		 * "Nissan", "Blanco", 5, 0.0); miCoche.mostrarDatos();
		 * 
		 * Automovil a1 = new Automovil("4444LLL", "Nissan", "Azul", 3, 0.0); //de esta
		 * forma puedo cambiar sus atributos a1.setTipoCombustible("Gasolina");
		 * 
		 * Automovil a2 = new Automovil("7777LLL", "Renault", "Blanco", 2, 0.0);
		 * a2.setTipoCombustible("Diesel");
		 * 
		 * Automovil a3 = new Automovil("3333ZZZ"); Automovil a4 = new
		 * Automovil("5555HHH", "Citroen"); a4.setColor("Rojo");
		 * System.out.println("PRIMER COCHE"); a1.mostrarDatos();
		 * System.out.println("Tipo combustible: " + a1.getTipoCombustible());
		 * 
		 * System.out.println("\nSEGUNDO COCHE"); a2.mostrarDatos();
		 * System.out.println("Tipo combustible: " + a2.getTipoCombustible());
		 * 
		 * System.out.println("\nTERCER COCHE"); a3.mostrarDatos();
		 * System.out.println("Tipo combustible: " + a3.getTipoCombustible());
		 * 
		 * System.out.println("\nCUARTO COCHE"); a4.mostrarDatos();
		 * System.out.println("Tipo combustible: " + a4.getTipoCombustible());
		 * 
		 * 
		 * // Arranco el coche miCoche.arrancar(); miCoche.mostrarDatos();
		 * 
		 * // Acelero el coche miCoche.acelerar(40); miCoche.mostrarDatos();
		 * 
		 * // Freno el coche miCoche.frenar(10); miCoche.frenar(20);
		 * miCoche.mostrarDatos();
		 * 
		 * // Pintamos el coche miCoche.pintarCoche("Blanco"); miCoche.mostrarDatos();
		 * miCoche.pintarCoche("Verde y Blanco"); miCoche.mostrarDatos();
		 * 
		 * // Vamos a ver la velocidad a la que va el coche // También puede ser: //
		 * System.out.println("\nEl coche va a: "+miCoche.getVelocidad()+" kms/h");
		 * double velocidadActual = miCoche.getVelocidad();
		 * System.out.println("\nEl coche va a: " + velocidadActual + " kms/h");
		 */

	}

}
