package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Hamsemare on 2018-01-17.
 */

/**
 * Interface telling any class that implements it to include the following methods
 * get a message and to set a message
 *
 * @author Hamse mare
 */
public interface Tweetable {
    /**
     * Gets a message
     * @return a message
     */
    public String getMessage();

    /**
     *
     * @param string needs a message when called
     * @throws TweetTooLongException if the message is longer than 140 characters
     */
    public void setMessage(String string) throws TweetTooLongException;

}
