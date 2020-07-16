package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Github2.txt"));
		bw.write("testando testando testando testando testando testando");
		bw.newLine();
		bw.newLine();
		bw.write("teste teste teste teste teste teste");
		
		bw.close();		
	}

}
