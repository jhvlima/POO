/**
 * Funcionamento do Programa
 * 
 * Leitura de Arquivo
 * Iserção da classe Pessoa
 * Ordenação e Impressão das pessoas pela nota
 */

import java.io.*;  
import java.util.Scanner;  
import java.util.List;  

public class App {
    public static void main(String[] args) {
        Scanner scanLinhas = new Scanner(new File("F:\\input.csv"), "UTF-8");
        String linha = "";

        List lista<Pessaoa> = new ArrayList()<Pessoa>; 

        while(scanLinhas.hasNextLine())
        {
            linha = scanLinhas.nextLine();
            Scanner scan = new Scanner(linha);
            scan.useDelimiter(";");
            lista.add(new Pessoa(scan.nextInt(), scan.next(), scan.nextInt()));
            scan.close();
        }
        scanLinhas.close(); 
    

    
    }
}