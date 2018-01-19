package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Hamsemare on 2018-01-18.
 */

//Super class

public abstract class currentmood {
    private Date date;

    public currentmood(){
    }

    public currentmood(Date ndate){
        this.date=ndate;
    }

    public Date getdate(){
        return this.date;
    }
    public void setDate(Date ndate){
        this.date=ndate;
    }
}
