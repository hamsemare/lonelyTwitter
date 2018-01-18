package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-17.
 */

public class ImportantTweet extends Tweet {
    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public boolean  isImportant(){
        return true;
    }
}
