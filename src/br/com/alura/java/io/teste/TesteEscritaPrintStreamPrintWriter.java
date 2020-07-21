package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.IOException;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {	
		
		//PrintStream ps = new PrintStream(new File("Github2.txt"));
		PrintWriter ps = new PrintWriter("Github2.txt","UTF-8");
	
		ps.println("testando testando testando testando testando testando");
		ps.println();
		ps.println("teste teste teste teste teste teste");
		ps.close();		
	}

}
