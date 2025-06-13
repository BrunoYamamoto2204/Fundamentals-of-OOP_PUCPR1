package Semana4.ExFixacao_4;

import java.util.ArrayList;

class Tweet {

    public String texto;
    public String usuario;
    public int retweet;

    public Tweet (String texto, String usuario){
        this.texto = texto;
        this.usuario = usuario;
        this.retweet = 0;
    }

    public void retweet(int n) {
        this.retweet += n;
    }

}

class Usuario{
    public String usuario;
    private ArrayList<Tweet> tweets;

    public Usuario(String usuario) {
        this.usuario = usuario;
        this.tweets = new ArrayList<Tweet>();
    }

    public void postar (Tweet tweet) {
        tweets.add(tweet);
    }

    public void repostar (Tweet tweet, int num) {
        tweet.retweet(num);
    }

    public void resultado () {
        System.out.println("Usuário: "+usuario);

        int numTweets = 1;
        for (Tweet t: tweets){
            System.out.println("Tweet "+numTweets+": "+t.texto);
            System.out.println("Retweets: "+t.retweet);
            System.out.println();
            numTweets += 1;
        }
    }


    public static void main(String[] args) {

        System.out.print("-".repeat(40));

        Usuario user = new Usuario("@jonson");

        Tweet t1 = new Tweet("Texto tweet1", "@jonson");
        Tweet t2 = new Tweet("Texto tweet2", "@jonson");
        Tweet t3 = new Tweet("Texto tweet3", "@jonson");

        user.postar(t1);
        user.postar(t2);
        user.postar(t3);

        user.repostar(t1,10);
        user.repostar(t2,20);
        user.repostar(t3,30);

        user.resultado();

        System.out.print("-".repeat(40));
    }
}