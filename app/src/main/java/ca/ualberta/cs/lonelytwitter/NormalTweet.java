package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-17.
 */

/**
 * Represents a Normal Tweet
 *
 * @author Hamse Mare
 * @date January 31, 2018
 * @see Tweet
 */

public class NormalTweet extends Tweet {
    /**
     * Constructs a Normal Tweet object
     * @param message message is passed to the superclass Tweet
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a Normal Tweet object with a message and date
     *
     * @param message message is passed to the superclass Tweet
     * @param date date is also passed to the superclass Tweet
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Checks if a tweet is important or not
     * @return true that the message is important
     */
    @Override
    public boolean isImportant(){
        return true;
    }

}
