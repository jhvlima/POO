package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura{

    private Jogada j1;
    private Jogada j2;

    public JogoPedraPapelTesouraImpl()
    {
        Random random = new Random();
        this.j1 = Jogada.values()[random.nextInt(3)];
        this.j2 = Jogada.values()[random.nextInt(3)];
    }

    /**
	 * Indica se houve vencedor.
	 * 
	 * @return retorna true se há vencedor e false se houve empate
	 */
	public boolean haVencedor()
    {
        return this.j1 != this.j2;
    }

	/**
	 * Retorna a jogada do primeiro jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador1()
    {
        return this.j1;
    }

	/**
	 * Retorna a jogada do segundo jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador2()
    {
        return this.j2;
    }

	/**
	 * 
	 * @return 1 ou 2 dependendo do jogador vitorioso.
	 */
	public int getJogadorVencedor()
    {
        if ((j1 == Jogada.PEDRA && j2 == Jogada.TESOURA) || 
            (j1 == Jogada.TESOURA && j2 == Jogada.PAPEL) ||
            (j1 == Jogada.PAPEL && j2 == Jogada.PEDRA)) {
            return 1;
        }
        return 2;
    }

}
