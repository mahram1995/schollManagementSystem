/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author HP
 */
public class payment_item {
    
    String item;
    int amount;

    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public payment_item(String item, int amount) {
        this.item = item;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "payment_item{" + "item=" + item + ", amount=" + amount + '}';
    }
    
}
