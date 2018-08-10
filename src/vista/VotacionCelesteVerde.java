package vista;

import java.util.Random;

import modelo.Senador;

public class VotacionCelesteVerde {

	public static void main(String[] args) {
		Random generadorAleatorios = new Random();
		
		int cantidadSenadores = generadorAleatorios.nextInt(60);
		
		Senador[] senadores = new Senador[cantidadSenadores];
		
		
		for(int i = 0; i < cantidadSenadores; i++) {
			Senador senador = new Senador((char)generadorAleatorios.nextInt(127));
			senador.setLegajo(i*17);
			senador.setNombre("Senador " + i + "-" + generadorAleatorios.nextInt() );
			senador.setPartido(generadorAleatorios.nextBoolean()?"Republicanos":"Democratas");
			senadores[i] = senador;
			
		}
		
		for (Senador senador : senadores) {
			System.out.println(senador.identificarse());
		}
		
		System.out.println("---- \n" + senadores[generadorAleatorios.nextInt(senadores.length)].identificarse());
		
	}

}
