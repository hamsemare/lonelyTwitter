package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-17.
 */

/**
 * Represents a Important tweet
 *
 * @author  Hamse mare
 * @date January 31,2018
 * @see Tweet
 */
public class ImportantTweet extends Tweet {
    /**
     * Constructs a ImportantTweet object
     * @param message needs a message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Represents a ImportantTweet object with a message with a date as well
     * @param message needs a message passes to the Tweet Class
     * @param date needs a date as well passed to Tweet Class
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     *
     * @return mssagge hi
     */
    @Override
    public String getMessage() {
        return "hi";
    }

    /**
     *
     * @return true for the message being important
     */
    @Override
    public boolean  isImportant(){
        return true;
    }
}
