package com.Ann.Ticket;

public class Ticket {
    public static final int TAIPEI_STATION =100;
    public static final int TAICHUNG_STATION =200;
    public static final int KAOHSIUNG_STATION =400;

    Station start;
    Station end;
    int price;
    public Ticket(Station start,Station end){
        this.start=start;
        this.end =end;
        if(Math.abs(start.id-end.id)==100){
            price=600;
        }else if(Math.abs(start.id-end.id)==200){
            price=900;
        }else if (Math.abs(start.id-end.id)==300){
            price =1500;
        }
    }
    public  void  print(){
        System.out.println(start.name+"to"+end.name+"\t"+price);
    }
}

