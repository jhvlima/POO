/**
 * Atividade no laboratório:
 * 
 * 1) Crie uma classe que representa um ponto no plano cartesiano. Em seguida, crie uma classe que representa um
 * triângulo, reusando a classe anterior. Finalmente, escreva um programa que receba do usuário as coordenadas dos
 * vértices do triângulo (6 números em ponto flutuante na linha de comando, ou
 * seja através de String args[]) e imprima o perímetro do triângulo.
 * Obs.: Use o método parseDouble da class Double para converter a String
 * (assinatura abaixo):
 * public static double parseDouble(String s)
 * throws NumberFormatException
 * Use também o método sqrt da class Math para calcular a raiz quadrada:
 * public static double sqrt(donppe a)
 * 
 */

public class App {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(1,3,4,5,6,7);
        System.out.println(triangulo.calculaPerimetro());
    }
}