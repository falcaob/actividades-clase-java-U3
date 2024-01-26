package automoviles;

import java.util.Scanner;

public class InterfazUsuario {

	// Método que imprime el menú
	public static void imprimirMenu() {
		System.out.println("MENÚ DE OPCIONES");
		System.out.println("*******************************");
		System.out.println("1. Crear coche");
		System.out.println("2. Arrancar");
		System.out.println("3. Acelerar");
		System.out.println("4. Frenar");
		System.out.println("5. Parar");
		System.out.println("6. Mostrar precio Combustible");
		System.out.println("7. Modificar precio Combustible");
		System.out.println("9. Salir");
	}

	public static void esperaIntro(Scanner sc) {
		sc.nextLine();
		System.out.println("\nPulsa Enter para continuar ...");
		sc.nextLine();
	}

}
