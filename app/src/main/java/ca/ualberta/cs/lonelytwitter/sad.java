package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-18.
 */

//SubClass

public class sad extends currentmood{
    public sad(){
        super();
    }
    public sad(Date date){
        super(date);
    }
    public String mooddependantformat(){
        return "Sad";
    }
}
