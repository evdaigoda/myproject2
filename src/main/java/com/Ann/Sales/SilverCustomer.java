package com.Ann.Sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id,int amount){
        super(id,amount);
    }
    public void print(){
        float money = amount-getOffMoney();
        System.out.println(id+"/t"+amount+"/t"+money+"/t"+"("+(int)getOffMoney()+")");
    }
}
