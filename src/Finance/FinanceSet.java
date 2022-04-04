package Finance;

import java.util.Date;

public class FinanceSet {
    // attributes
    private Date date;
    private double closing;

    FinanceSet(Date d, double c){
        this.date = d;
        this.closing = c;
    }

    public Date getDate(){
        return this.date;
    }

    public double getClosing(){
        return this.closing;
    }

    public void setDate(Date d){
        this.date = d;
    }

    public void setClosing(double c){
        this.closing = c;
    }


}
