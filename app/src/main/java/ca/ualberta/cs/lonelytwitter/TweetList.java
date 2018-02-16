package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.*;;
import java.util.Collections;

/**
 * Created by Hamsemare on 2018-02-14.
 */

public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }


    //Should throw an IllegalArgumentException when one tries to add a duplicate tweet
    public void addTweet(Tweet tweet) {
        for (int i=0; i <tweets.size();i++ ){
            if (tweets.get(i).getMessage()==tweet.getMessage()){
                throw new IllegalArgumentException();
            }
        }
        tweets.add(tweet);
    }


    //Should return a list of tweets in chronological order
    public List<Comparable> getTweet() {
        //Collections.sort(this.tweets, Comparator.comparing((Tweet) ->);
        for (int i =0 ; i< tweets.size(); i++){
            Collections.sort(tweets(i));
            return tweets(i);
        }
        return null;
    }

    private List<Comparable> tweets( int i){
        return tweets(i);
    }




    //should return true if there is a tweet that equals() another tweet
    public boolean hasTweet(Tweet tweet){
        for(int i=0 ; i< tweets.size(); i++){
            if(tweets.get(i).getMessage()==tweet.getMessage()){
                return true;
            }
        }
        return false;
    }

    public Tweet getObject(int num){
        return tweets.get(num);
    }



    //Should accurately count up the tweets
    public int getCount(Tweet tweet){
        int num= Collections.frequency(tweets, tweet);
        return num;
    }
}

