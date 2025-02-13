package simulado_q1;

import java.util.Date;

public class UserBase {

    private java.util.Set<User> users = new java.util.HashSet<User>(); 
    
    public float porcentagemVerificados() {
        float total = 0, verificados = 0; 
        for (User user : this.users) {
            if (user instanceof VerifiedUser) {
                verificados++;
            }
            total++;
        }
        if (total == 0) {
            return 0;
        }
        return 100*verificados/total; 
    }

    public float tamanhoMedioTweets() {
        float tamanhoText = 0,  quantidadeUsers= 0;
        for (User user : this.users) {
            quantidadeUsers++;
            for (Tweet tweet : user.getTweets()) {
                tamanhoText += tweet.toString().length();
            }
        }
        if (tamanhoText == 0) {
            return 0;
        }
        return tamanhoText/quantidadeUsers; 
    }

    public User createUser(String twitterId)
    {
        User newUser = new User(twitterId);
        this.users.add(newUser);
        return newUser;
    }

    public void createVerifiedUser(String string, Date date) {
        User newUser = new VerifiedUser(string, date);
        this.users.add(newUser);
    }

}
