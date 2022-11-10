package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lector {
	@SuppressWarnings("resource")
	public static String leerString() {
		return new Scanner(System.in).nextLine();
	}
	
	public static String leerString(String msg) {
		System.out.println(msg);
		return leerString();
	}
	
	@SuppressWarnings("resource")
	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int leerInt(String msg) {
		System.out.println(msg);
		return leerInt();
	}
	
	@SuppressWarnings("resource")
	public static double leerDouble() {
		return new Scanner(System.in).nextInt();
	}

	public static double leerDouble(String msg) {
		System.out.println(msg);
		return leerInt();
	}
	
}
