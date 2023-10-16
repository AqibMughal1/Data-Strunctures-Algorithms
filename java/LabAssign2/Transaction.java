package LabAssign2;
import java.time.LocalDate;

public class Transaction {
    public int count;
    public int price;
    public LocalDate date;
    
    public Transaction(int count, int price, LocalDate date) {
        this.count = count;
        this.price = price;
        this.date = date;
    }
    
}
