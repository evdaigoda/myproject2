package com.Ann.Ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You start station?(1:Taipei,2:Taichung,3:Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice){
            case 1 :
                start = Station.TAIPEI_STATION;
                break;;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;;
            case 3:
                start = Station.KAOHSIUNG_STATION;
                break;;
        }
        System.out.println("Your destination station?(1:Taipei,2:Taichung,3:Kaohsiung)");
        choice = Integer.parseInt(scanner.next());
        String end = null;
        switch (choice){
            case 1:
                end = Station.TAIPEI_STATION;
                break;
            case 2:
                end = Station.TAICHUNG_STATION;
                break;
            case 3:
                end = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Which kind f ticket?(1:Normal,2:Student,3:Elder)");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket =new Ticket(start,end);
        switch (choice){
            case 1:
                ticket =new Ticker(start,end);
                break;
            case 2:
                ticket = new StudentTicket(start,end);
                break;
            case 3:
                ticket = new ElderTicket(start,end);
                break;
        }
        ticket.print();
    }
}
