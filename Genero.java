package examples;

public enum Genero {

	MASCULINO('M') {
		@Override
		public String toString() {
			return "Masculino";
		}
	},
	FEMININO('F') {
		@Override
		public String toString() {
			return "Feminino";
		}
	};

	private char value;

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	Genero(char value) {
		this.value = value;
	}

	public abstract String toString();

}
