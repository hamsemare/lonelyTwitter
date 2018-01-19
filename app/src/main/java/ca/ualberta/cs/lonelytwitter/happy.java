package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-18.
 */

//Subclass

public class happy extends currentmood {
    public happy(){
        super();
    }
    public happy(Date date){
        super(date);
    }
    public String mooddependantformat(){
        return "Happy";
    }
}
