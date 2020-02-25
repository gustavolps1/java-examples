package examples;

public class TesteEnum {
	public static void main(String[] args) {

		for (DiaSemana dia : DiaSemana.values())
			System.out.println(dia.retornaDiaDaSemana() + " - " + dia.getValor());

		for (Genero genero : Genero.values())
			System.out.println(genero + " - " + genero.getValue() + " - " + genero.toString());

	}

}
