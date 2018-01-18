package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-17.
 */


public abstract class Tweet {
    private String message;
    private Date date;
    Tweet(){

    }

    Tweet(String message){
        this.message=message;
    }


    Tweet(String message, Date date){
        this.message=message;
        this.date=date;
    }


    public String getMessage(){
        return message;
    }

    public Date getDate(){
        return date;
    }

    public void setMessage(String newMessage){
        if (newMessage.length()>160){
           throw new TweetTooLongException();
        }
        this.message=newMessage;

    }

    public void setDate(Date newDate){
        this.date=newDate;
    }


    public boolean abstract isImportant();

}
