package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//codepoint de C
		String s = "13º Órgão Oficial";
		System.out.println(s.codePointAt(0));
		//Charset
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		// bytes, tipo de unicode, teste de conversão com windows-1252 
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes,"windows-1252");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes,"windows-1252");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes,"windows-1252");
		System.out.println(sNovo);
		
	}

}
