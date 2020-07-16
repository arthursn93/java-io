package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		//Fluxo de Entrada com Arquivo
		InputStream fis = s.getInputStream();
		//InputStream fis = System.in;
		//InputStream fis = new FileInputStream("Github.txt");
		InputStreamReader isr = new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr); 
		
		//Fluxo de Saída com Arquivo
		OutputStream fos = s.getOutputStream(); 
		//OutputStream fos = System.out; 
		//OutputStream fos = new FileOutputStream("Github2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw); 
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		br.close();	
		bw.close();
	}

}
