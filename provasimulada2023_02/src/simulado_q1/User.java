package simulado_q1;

public class User {
    private String twitterId;
    private java.util.Set<Tweet> tweets = new java.util.HashSet<Tweet>(); 

    public User(String twitterId) {
        this.twitterId = twitterId;
    }

    public void addTweet(Tweet tweet) {
        this.tweets.add(tweet);
    }    

    public java.util.Set<Tweet> getTweets() {
        return tweets;
    }
}
