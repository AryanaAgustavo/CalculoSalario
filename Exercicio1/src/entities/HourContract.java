package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valouPerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valouPerHour, Integer hours) {
        this.date = date;
        this.valouPerHour = valouPerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValouPerHour() {
        return valouPerHour;
    }

    public void setValouPerHour(Double valouPerHour) {
        this.valouPerHour = valouPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valouPerHour * hours;
    }
}
