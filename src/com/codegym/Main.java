package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Ứng dụng tính tiền lãi cho vay");
        Scanner scanner = new Scanner(System.in);
        double money, interestRate;
        byte month;
        System.out.println("Nhập số tiền bạn vay: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng bạn vay: ");
        month =  scanner.nextByte();
        System.out.println("Lãi suất: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i<month; i ++){
            totalInterest += money * ((interestRate/100)/12)*month;
        }
        System.out.println("Tổng tiền lãi phải trả là: " + interestRate);
    }
}
