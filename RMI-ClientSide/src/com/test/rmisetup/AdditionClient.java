package com.test.rmisetup;

import java.rmi.*;
import java.util.Scanner;
//import java.io.Console;
import java.io.IOException;

public class AdditionClient {
	static int angka1, angka2;

	public static void main(String[] args) throws IOException {
//		Console con = System.console();
//		Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd bin && java com.test.rmisetup.AdditionClient\"");

		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (done == false) {
			System.out.println("\n=====================");
			System.out.println("Kalkulator Sederhana");
			System.out.println("=====================");

			System.out.println("1. Penambahan");
			System.out.println("2. Pengurangan");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.print("Pilihan Anda : ");
//			int pil = Integer.parseInt(con.readLine());
			int pil = input.nextInt();
			
			Interface send;

			inputAngka();

			try {
				send = (Interface) Naming.lookup("rmi://localhost/ABC");
				switch (pil) {
				case 1:
					int resultPT = send.pertambahan(angka1, angka2);
					System.out.println("Hasil dari penambahan adalah : " + resultPT);
					break;
				case 2:
					int resultPN = send.pengurangan(angka1, angka2);
					System.out.println("Hasil dari pengurangan adalah : " + resultPN);
					break;
				case 3:
					int resultPK = send.perkalian(angka1, angka2);
					System.out.println("Hasil dari perkalian adalah : " + resultPK);
					break;
				case 4:
					double resultPB = send.pembagian(angka1, angka2);
					System.out.println("Hasil dari pembagian adalah : " + resultPB);
					break;
				}
				;

			} catch (Exception e) {
				System.out.println("Hello Client exception: " + e);
			}
		}
	}

	public static void inputAngka() {
//		Console sAngka = System.console();
//		System.out.println("\nMasukan Angka Pertama");
//		angka1 = Integer.parseInt(sAngka.readLine());
//		System.out.println("Masukan Angka Kedua");
//		angka2 = Integer.parseInt(sAngka.readLine());
		
		Scanner sAngka = new Scanner(System.in);
		System.out.println("\nMasukan Angka Pertama");
		angka1 = sAngka.nextInt();
		System.out.println("Masukan Angka Kedua");
		angka2 = sAngka.nextInt();

	}
}