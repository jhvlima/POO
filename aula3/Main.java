public class Main {
    public static void main(String[] args)
    {
        Pessoa oladina = new Pessoa("Olandina");
        Pessoa gatao = new Pessoa("Olavo");

        Pessoa paulinho = new Pessoa("José");
        Pessoa dete = new Pessoa("Odete");

        Pessoa gatinho = new Pessoa("Ataide", gatao, oladina);
        Pessoa ze = new Pessoa("Zenaide", paulinho, dete);

        Pessoa mane = new Pessoa("Pedro", gatinho, ze);
        Pessoa eu = new Pessoa("João", gatinho, ze);
        
        System.out.print("          ");
        System.out.println(eu.getNome());
        System.out.println("        /        \\");
        System.out.print(eu.getPai().getNome());
        System.out.print("             ");
        System.out.println(eu.getMae().getNome());
        System.out.print(" /    \\");
        System.out.println("             /    \\");
        System.out.print(eu.getAvoParteno().getNome());
        System.out.print("  ");
        System.out.print(eu.getAvohParteno().getNome());
        System.out.print("  ");
        System.out.print(eu.getAvoMaterno().getNome());
        System.out.print("  ");
        System.out.println(eu.getAvohMaterno().getNome());
  
        System.out.println("# Avós #");
        for(Pessoa p : eu.getAvos())
        {
            System.out.println(p.getNome());
        }
        
        System.out.println("# Parentes #");
        for(Pessoa p : eu.getParentes())
        {
            System.out.println(p.getNome());
        }
    }
}
