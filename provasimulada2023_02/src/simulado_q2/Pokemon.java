package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    private int vida, vitalidade, ataque, especial;

    public Pokemon(int vida, int ataque, int especial) {
        this.vida = vida;
        this.ataque = ataque;
        this.especial = especial;
        this.vitalidade = vida;
    }

    public int getPontosVitalidade() {
        return this.vida;
    }

    public boolean atacar(Pokemon defensor) {
        Random r = new Random();
        if (r.nextBoolean()) {
            defensor.vitalidade -= this.ataque;
        } else {
            defensor.vitalidade -= this.especial;
        }

        if (defensor.getPontosVitalidade() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void regenera() {
        this.vitalidade = vida;
    }

}
