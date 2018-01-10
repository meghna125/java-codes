package com.javaBeans;

import java.io.Serializable;

public class Student implements Serializable
{
	private String firstname="Mridula";
	private String lastname="Garg";
	public Student()
	{ }
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname=firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname=lastname;
	}

}	 