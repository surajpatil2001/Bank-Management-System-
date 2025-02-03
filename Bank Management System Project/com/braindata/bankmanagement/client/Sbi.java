package com.braindata.bankmanagement.client; 
import com.braindata.bankmanagement.service.Rbi.*;
import com.braindata.bankmanagement.serviceImp1.Sbi.*;
public class Test
{
public static void main(String args[])
{
Rbi bank = new Sbi();
do{
System.out.println("Enter 1 : createAccount \n 2 : displayAllDetails \n 3 : depositeMoney \n 4 : depositeMoney \n 5 : balanceCheck");
int ch=sc.nextInt();
switch(ch)
{
case 1: bank.createAccount();
break;
case 2:bank.displayAllDetails();
break;
case 3:bank.depositeMoney();
break;
case 4:bank.withdrawal();
break;
case 5:bank.balanceCheck();
break;
}
}while(ch!=6);
}
}