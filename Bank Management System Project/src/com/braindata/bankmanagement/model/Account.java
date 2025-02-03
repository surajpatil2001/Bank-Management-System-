package com.braindata.bankmanagement.model; 
public class Account
{
private long accNo;
private String name;
private Long mobNo;
private Long adharNo;
private String gender;
private int age;
private double balance;

public void setAccNo(long accNo)
{
this.accNo=accNo;
}
public void setName(String name)
{
this.name=name;
}
public void setMobNo(Long mobNo)
{
this.mobNo=mobNo;
}
public void setAdharNo(Long adharNo)
{
this.adharNo=adharNo;
}
public void setGender(String gender)
{
this.gender=gender;
}
public void setAge(int age)
{
this.age=age;
}
public void setBalance(double balance)
{
this.balance=balance;
}
public long getAccNo()
{
return accNo;
}
public String getName()
{
return name;
}
public Long getMobNo()
{
return mobNo;
}
public Long getAdharNo()
{
return adharNo;
}
public String getGender()
{
return gender;
}
public int getAge()
{
return age;
}
public double getBalance()
{
return balance;
}
}