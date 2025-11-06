package demo;

import java.util.Scanner;

public class YourName {
    
    public static void main(String[] args){

        System.out.println("what is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("welcome to java programming" + name);
        input.close();;
    }
}
