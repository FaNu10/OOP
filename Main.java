package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea pentru care doriti sa ii adunati cifrele");
        int s=0;
        int x= scanner.nextInt();
        while(x != 0){
            s=s+x%10;
            x=x/10;
        }
        System.out.println(s);
        scanner.close();
    }
}
