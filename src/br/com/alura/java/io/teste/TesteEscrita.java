package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		OutputStream fos = new FileOutputStream("Github2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw); 
		
		bw.write("Generating public/private rsa key pair.");
		bw.newLine();
		bw.newLine();
		bw.write("BSADJASDKASKDKASDKAS");
		
		bw.close();		
	}

}
