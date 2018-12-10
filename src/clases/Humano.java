package clases;

import java.util.Scanner;
import java.io.File;

public class Humano {
	public static void main(String[] args) {
		Scanner tc =new Scanner(System.in);
		System.out.println();
	}
	
	private int id;
	private int zapato;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getZapato() {
		return zapato;
	}
	
	public void setZapato(int zapato) {
		this.zapato = zapato;
	}
	
	private void initTodo() {
		File fichero=new File("hola.txt");
	}
}
