package com.senati.edu.pe;

import java.util.Scanner;

public class TestNumero {

	private static Scanner leer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Numero Onum = new Numero();
			leer = new Scanner(System.in);
			System.out.print("\n Ingrese el número : ");
			double n = leer.nextDouble();
			Onum.Num = n;
			System.out.println(" " + Onum.Primo());
			System.out.println(" " + Onum.Perfecto());
			System.out.println(" Factorial " + Onum.Factorial());
			}catch (Exception ex) {
			}
	}

}
