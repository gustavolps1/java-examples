package com.loiane.aula45;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] obj = { 'A', 1, 1.0, "ABCD" };

		Object objeto1 = "AA";
		Object objeto2 = 2.0;
		Object objeto3 = 'A';
		Object objeto4 = 2;

		// Casting double para inteiro
		double casas = 293.23;
		int inteiro = (int) casas;

		// Casting Object para char
		char carac = (char) objeto3;

	}

}
