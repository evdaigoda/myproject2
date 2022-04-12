package com.Ann.Ticket;

public class ElderTicket extends Ticket {
    float off = 0.5f;
    public ElderTicket(Station start, Station end){
        super(start, end);
        price=price-(int)(price*off);
    }
}
