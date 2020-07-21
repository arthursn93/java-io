package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.io.IOException;
import java.io.InputStream;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("Github.txt"); // Cria fluxo de entrada em binários
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8"); // Traduz os valores binários para caracteres
		BufferedReader br = new BufferedReader(isr); // Faz a leitura do InputStreamReader
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();		
	}

}
