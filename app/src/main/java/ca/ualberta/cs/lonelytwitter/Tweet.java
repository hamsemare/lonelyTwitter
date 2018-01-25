package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-17.
 */


public abstract class Tweet  implements  Tweetable{
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

    public void setMessage(String newMessage) throws TweetTooLongException{
        if (newMessage.length()>160){
        }
        else{
            throw new TweetTooLongException();
        }
        this.message=newMessage;

    }

    public String toString(){
        return message;
    }



    public void setDate(Date newDate){
        this.date=newDate;
    }


    public abstract boolean  isImportant();

}
