package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import java.util.Arrays;

/**
 * Created by Hamsemare on 2018-02-14.
 */



public class TweetListTest extends ActivityInstrumentationTestCase2 {


    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }



    //Test should throw an IllegalArgumentException when one tries to add a duplicate tweet
    public void testAddTweet() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding a new normal tweet");
        tweets.addTweet(tweet);

        try {
            tweets.addTweet(tweet);
        }
        catch (IllegalArgumentException e) {
        }

        assertTrue(tweets.hasTweet(tweet));
    }



    //Test should return true if there is a tweet that equals() another tweet
    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding a tweet");
        Tweet tweet1 = new NormalTweet("Adding a tweet");
        tweets.add(tweet);
        tweets.add(tweet1);
        assertTrue(tweets.hasTweet(tweet1));
    }

    //should return a list of tweets in chronological order
    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");
        Tweet tweet1 = new NormalTweet("tweet");
        tweets.add(tweet);
        tweets.add(tweet1);
        tweets.getTweet();
        assertEquals(Arrays.asList(tweet, tweet, tweet), tweets);
        //assertTrue(tweets.getObject(0).getMessage() < tweets.getObject(1).getMessage();
    }


    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding a tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        tweets.add(tweet);
        tweets.add(tweet);
        int num=tweets.getCount(tweet);
        assertEquals(3, num);
    }


}

