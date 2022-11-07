package unico;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int diaSemana;
		String mensaje;
		
		System.out.print("Introduzca un número del día de la semana [1 - 7]: ");
		diaSemana = Integer.parseInt(teclado.nextLine());
		
		switch(diaSemana) {
			case 1: mensaje = "LUNES"; break;
			case 2: mensaje = "MARTES"; break;
			case 3: mensaje = "MIÉRCOLES"; break;
			case 4: mensaje = "JUEVES"; break;
			case 5: mensaje = "VIERNES"; break;
			case 6: mensaje = "SABADO"; break;
			case 7: mensaje = "DOMINGO"; break;
			default: mensaje = "no válido"; break;
		}
		
		System.out.println("El día " + diaSemana + " es " + mensaje);
	}

}