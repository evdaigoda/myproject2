package com.Ann.Sales;

public class Customer {
    String id;
    int amount;
    float off = 0.1f;
    public Customer(String id,int amount){
        this.id=id;
        this.amount=amount;
    }
    public float getOffMoney(){
        return(amount/1000)*off*1000;
    }
    public void print(){
        float money = amount-getOffMoney();
        if(amount<1000){
            System.out.println(id+"\t"+amount+"\t"+money);
        }else{
            System.out.println(id+"\t"+amount+"\t"+money);
        }
    }
}
