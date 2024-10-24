import java.util.*;

/**
 * Time
 */
class Time {

    // normalmente usar atributos privados
    private String nome;
    private int nMundiais;

    public Time(String nome)    // builder que usa o new 
    {
        this.nome = nome;
    }
    public Time(String nome, int nMundiais)    // pode ter mais de um metodo para a mesma coisa 
    {
        this.nome = nome;
        this.nMundiais = nMundiais;
    }
    public void defineNome(String nome)    //setter
    {
        this.nome = nome;
    }
    /* Esta implementação é igual a usando .this
        public void defineNome(String n)
        {
            nome = n;
        }
    */
    public String retornaNome()    // getter
    {
        return nome;
    }
    public void incNumeroMundiais()
    {
        this.nMundiais++;
    }
    public int retoraNumeroMundiais()
    {
        return this.nMundiais;
    }

}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Time flamengo = new Time("Flamengo");
        flamengo.defineNome("Clube de Regatas Flamengo");
        System.out.println(flamengo.retornaNome());

        // usando o pacote java.util para usar listas
        //java.util.LinkedList<Partida> partidas = new java.util.LinkedList<Partida>();
        // ou importa o pacote no inicio do arquivo
        LinkedList<Partida> partidas = new LinkedList<Partida>();
        
        Time vasco = new Time("Vasco");
        Partida p = new Partida(flamengo, vasco);

    }
}
