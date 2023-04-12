package com.bl.example;

public class EmpMainClass {
    public static void main(String[] args) {
        System.out.println(" Welcome to the Master Branch.");

        int a = ( int )( Math.random() * 10 ) % 2;

        if( a == 1 )
            System.out.println( "Employee is Present.");
        else
            System.out.println( "Employee is Absent.");
    }
}
