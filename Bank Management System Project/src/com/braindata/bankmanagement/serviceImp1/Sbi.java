package com.braindata.bankmanagement.serviceImp1;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.*;
import java.util.*;

public class Sbi implements Rbi
{
Scanner sc=new Scanner(System.in);
Account a=new Account();
private int balance;
public void createAccount()
{
System.out.println("Enter Your Name");
String name=sc.next()+sc.nextLine();
if (!name.matches("[a-zA-Z ]+")) 
{
System.out.println("Invalid Name");
}
else
{
a.setName(name);
}


System.out.println("Enter Your MobNo");
long mobno=sc.nextLong();
if(!(String.valueOf(mobno).length() == 10)) 
{
System.out.println("Invalid Mobile Number");
}
else
{
a.setMobNo(mobno);
}

System.out.println("Enter Your AdharNo");
long adharNo=sc.nextLong();
if(!(String.valueOf(adharNo).length()==12))
{
System.out.println("Invalid Adhar Number");
}
else
{
a.setAdharNo(adharNo);
}

System.out.println("Enter Your Gender");
String gender=sc.next();
if(!gender.equalsIgnoreCase("Male")&& !gender.equalsIgnoreCase("Female")) 
{
System.out.println("Invalid A gender");
}
else
{
a.setGender(gender);
}

System.out.println("Enter Your AccNo");
long accno=sc.nextLong();
if (balance < 1000) 
{
System.out.println("Invalid Account Balance");
}
else
{
a.setAccNo(accno);
}

System.out.println("Enter Your Age");
int age=sc.nextInt();
if (age<18 || age>50) 
{
System.out.println("Invalid Is Age");
}
else
{
a.setAge(age);
}

System.out.println("Enter Your Balance");
double balance=sc.nextDouble();
if (balance < 1000) 
{
System.out.println("Invalid Balance");
}
else
{
a.setBalance(balance);
}
}

public void displayAllDetails()
{
System.out.println("Name : "+a.getName());
System.out.println("MobNo : "+a.getMobNo());
System.out.println("AdharNo : "+a.getAdharNo());
System.out.println("Gender : "+a.getGender());
System.out.println("AccNo : "+a.getAccNo());
System.out.println("Age : "+a.getAge());
System.out.println("Balance : "+a.getBalance());
}
public void depositeMoney()
{
System.out.println("Enter Amount");
double deposit = sc.nextDouble();
if (deposit < 500 || deposit > 100000) 
{
System.out.println("Invalid deposit amount");
}
else
{
double Amount=a.getBalance();
double newBalance = Amount+deposit;
a.setBalance(newBalance);
System.out.println("Your new balance is "+a.getBalance());
}
}

public void withdrawal()
{
System.out.println("Enter Amount");
double withdrawal=sc.nextDouble();
if(withdrawal<500 ||withdrawal>20000) 
{
System.out.println("Invalid withdrawal amount");
}
else
{
double balance=a.getBalance();
if(balance-withdrawal<1000)
{
System.out.println("Insufficient Amount");
}
else
{
a.setBalance(balance-withdrawal);
System.out.println("Your New Balance Is "+a.getBalance());
}
}
}

public void balanceCheck()
{
System.out.println(a.getBalance());
}
}
