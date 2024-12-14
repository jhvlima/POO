package simulado_q1;

public class Tweet {

    private String text;

    public Tweet(String text)
    {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
