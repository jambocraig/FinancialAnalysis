package Finance;

import java.time.LocalDate;

public class FinanceSet {
    // attributes
    private LocalDate date;
    private double closing;

    FinanceSet(LocalDate d, double c){
        this.date = d;
        this.closing = c;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public double getClosing(){
        return this.closing;
    }

    public void setDate(LocalDate d){
        this.date = d;
    }

    public void setClosing(double c){
        this.closing = c;
    }

    public String toString(){
        String str = this.date.getDayOfMonth() + "/" +
                this.date.getMonthValue() + "/"
                + this.date.getYear();

        return str + " = " + this.closing;
    }



}
