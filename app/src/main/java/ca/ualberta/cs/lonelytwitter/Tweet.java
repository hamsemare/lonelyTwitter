/*
 * Copyright (c) 2018 Team x. CMPUT301. University of Alberta. All Rights Reserved.
 *You may use, distribute, or modify this code under terms and conditions of the Cide of Student
 *Behavior at University of Albertta<
 *Yoy can find a copy of the license in thus project> Otherwise please contact contact@abc.ca.

 */
//JavaDoc @param @return @delete  - Expected behavior of the method
// @author @version /** */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-17.
 */

/**
 * Represents a tweet
 *
 * @author hamse mare
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet  implements  Tweetable{
    private String message;
    private Date date;

    /**
     * Constructs a Tweet object
     */
    Tweet(){
    }

    /**
     * COnstructs a Tweet Object
     * @param message tweet message
     */
    Tweet(String message){
        this.message=message;
    }

    /**
     * Construscts a Tweet object
     *
     *
     *
     * @param message tweet messaage
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message=message;
        this.date=date;
    }


    /**
     * Gets the message of a tweet
     * @return the message of a tweet
     */
    public String getMessage(){
        return message;
    }

    /**
     * Gets the date of a tweet
     * @return the date of a tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets tweet message.
     *
     *
     * @param newMessage tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String newMessage) throws TweetTooLongException{
        if (newMessage.length()>160){
        }
        else{
            throw new TweetTooLongException();
        }
        this.message=newMessage;

    }

    /**
     * Converts the Tweet object to the message it contains when converted to toString
     * @return message of the tweet
     */
    public String toString(){
        return message;
    }


    /**
     * Set the date of a tweet
     * @param newDate tweet date
     */
    public void setDate(Date newDate){
        this.date=newDate;
    }

    /**
     * Checks if the tweet is important or not
     * @return true or false if the tweet is important or not
     */
    public abstract boolean  isImportant();

}
