package examples;

public class TesteDocumento {

	public static void main(String[] args) {

		for (TipoDocumento doc : TipoDocumento.values())
			System.out.println(doc + " - " + doc.geraNumeroTeste());

	}
}
