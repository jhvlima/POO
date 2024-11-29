/**
 *  
 * Crie uma hierarquia de classes de domínio para uma loja que venda livro e jogo de tabuleiro. Sobrescreva o método toString() para que imprima:
* Para livro: nome, preço e autor;
* Para jogo de tabuleiro: nome, preço e idade mínima recomendada (que pode ser representada como um inteiro 
representando a idade mínima do jogador, por exemplo 8 para jogo recomendados para crianças a partir de 8 anos);
Evite ao máximo repetição de código utilizando a palavra super no construtor e no método sobrescrito. Em seguida,
crie uma classe App com o método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por fim,
imprima o conteúdo do vetor.
 */


 public class App {
    public static void main(String[] args) {
        Loja loja = new Loja("Amazon");

        Jogo jogo1 = new Jogo("Monopoly", 200, 8);
        Jogo jogo2 = new Jogo("War", 100, 12);
        Jogo jogo3 = new Jogo("Coup", 90, 12);

        Livro livro1 = new Livro("Dom Quixote", 50, "Miguel de Cervantes");
        Livro livro2 = new Livro("Uma Breve História do Tempo", 50, "Stephen Hawking");

        loja.addProduto(jogo1);
        loja.addProduto(jogo2);
        loja.addProduto(jogo3);
        loja.addProduto(livro1);
        loja.addProduto(livro2);

        loja.exibirProdutos();
    }
}
