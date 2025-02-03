/**
 * Funcionamento do Programa
 * 
 * Leitura de Arquivo
 * Iserção da classe Pessoa
 * Ordenação e Impressão das pessoas pela nota
 */

import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanLinhas = new Scanner(new File("input.csv"), "UTF-8");
        String linha = "";

        List<Pessoa> lista = new ArrayList<Pessoa>(); 

        while(scanLinhas.hasNextLine())
        {
            linha = scanLinhas.nextLine();
            Scanner scan = new Scanner(linha);
            scan.useDelimiter(";");
            lista.add(new Pessoa(scan.nextInt(), scan.next(), scan.nextInt()));
            scan.close();
        }
        scanLinhas.close(); 
    
        lista.sort(new NotaComparator());
        System.out.println("Lista de Pessoas Por Nota");
        for(Pessoa p : lista)
        {
            System.out.println(p);
        }
    }
}

class NotaComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o2.getNota() - o1.getNota();
    }
}