package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImp1.Sbi;
import java.util.*;
public class Test {
public static void main(String[] args) {
Rbi bank = new Sbi();
Scanner sc = new Scanner(System.in);
int ch;
do {
System.out.println("Enter 1 : createAccount \n 2 : displayAllDetails \n 3 : depositMoney \n 4 : withdrawMoney \n 5 : balanceCheck \n 6 : Exit");
ch = sc.nextInt();
switch (ch) {
case 1:bank.createAccount();
break;
case 2:bank.displayAllDetails();
break;
case 3:bank.depositeMoney();
break;
case 4:bank.withdrawal(); 
case 6:
System.out.println("Exiting the application.");
break;
}
}while (ch != 6);
}
}
