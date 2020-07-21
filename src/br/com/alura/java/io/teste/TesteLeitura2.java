package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		// escaneia informa��es de contas.csv
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			// System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			// usa regras americanas de fonte
			linhaScanner.useLocale(Locale.US);
			// Separa o conte�do
			linhaScanner.useDelimiter(",");
			// definimos o scan de cada coluna depois da v�rgula
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			// Formata uma string utilizando express�es regulares
			String valorFormatado = String.format(
					new Locale("pt", "BR"), // regras brasileiras de localiza��o
					"%s - %04d-%08d, %20s: %08.2f", // express�o regular
					tipoConta, agencia, numero, titular, saldo); // vari�veis
			System.out.println(valorFormatado);
			linhaScanner.close();

//			String[] valores = linha.split(",");
//			System.out.println(valores[1]);
		}
		scanner.close();
	}

}
