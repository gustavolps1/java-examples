package examples;

public enum DiaSemana {

	SEGUNDA(1) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Segunda-Feira";
		}
	},
	TERCA(2) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Terça-Feira";
		}
	},
	QUARTA(3) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Quarta-Feira";
		}
	},
	QUINTA(4) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Quinta-Feira";
		}
	},
	SEXTA(5) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Sexta-Feira";
		}
	},
	SABADO(6) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Sábado";
		}
	},
	DOMINGO(7) {
		@Override
		public String retornaDiaDaSemana() {
			// TODO Auto-generated method stub
			return "Domingo";
		}
	};

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	DiaSemana(int valor) {
		this.valor = valor;
	}

	public abstract String retornaDiaDaSemana();
}
