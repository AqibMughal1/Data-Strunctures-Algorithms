package LabAssign2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int gains = 0;
        LinkedQueue bought = new LinkedQueue();
        LinkedQueue sold = new LinkedQueue();

        Transaction t1 = new Transaction(10, 25, LocalDate.of(2022, 5, 20));
        Transaction t2 = new Transaction(20, 20, LocalDate.of(2021, 3, 23));
        Transaction t3 = new Transaction(60, 30, LocalDate.of(2020, 6, 29));
        Transaction t4 = new Transaction(20, 50, LocalDate.of(2023, 8, 5));
        
        bought.enqueue(t1);
        bought.enqueue(t2);
        sold.enqueue(t3);
        sold.enqueue(t4);
        
        while (!bought.isEmpty() && !sold.isEmpty()) {
            Transaction buy = bought.front.data;
            Transaction sell = sold.front.data;
            
            if (buy.price >= sell.price) {
                System.out.println("Error: Buy price is higher than or equal to sell price.");
                return;
            }
            
            if (buy.count <= sell.count) {
                gains += buy.count * (sell.price - buy.price);
                sold.front.data.count -= buy.count;
                if (sold.front.data.count == 0) {
                    sold.dequeue();
                }
                bought.dequeue();
            } else {
                gains += sell.count * (sell.price - buy.price);
                bought.front.data.count -= sell.count;
                if (bought.front.data.count == 0) {
                    bought.dequeue();
                }
                sold.dequeue();
            }
        }
        
        System.out.println("Total gains: " + gains);
    }
}
