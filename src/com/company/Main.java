package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti CUVANTUL pentru care doriti sa ii afisati literele din mijloc");
        String x = scanner.nextLine();
        String out ="";
        int i=0;
        i=x.length()/2;
        if(x.length() % 2 == 1 ) {
            System.out.println(i);
            System.out.println(out=x.charAt(i)+out);
        }
        else{
            System.out.println(x.charAt(i-1)+out+x.charAt(i));
        }
    }
}
