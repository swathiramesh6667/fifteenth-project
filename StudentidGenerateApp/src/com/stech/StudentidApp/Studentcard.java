package com.stech.StudentidApp;

//POJO-plain Old Java Object Class
public class Studentcard 
{
	// privately declared data
 private String studID;
 private String stuFullName;
 private String studClass;
 private String studBloodGr;
 private String dateOfBirth;
 
 //parameterized Constructor
 
 Studentcard(String studID, String stuFullName, String studClass, String studBloodGr, String dateOfBirth) 
{
	this.studID = studID;
	this.stuFullName = stuFullName;
	this.studClass = studClass;
	this.studBloodGr = studBloodGr;
	this.dateOfBirth = dateOfBirth;
}

 // Getter and Setter for Studentid
public String getStudID() {
	return studID;
}

public void setStudID(String studID) {
	this.studID = studID;
}

//Getter and Setter for Student Name
public String getStuFullName() {
	return stuFullName;
}

public void setStuFullName(String stuFullName) {
	this.stuFullName = stuFullName;
}

//Getter and Setter for Student Class
public String getStudClass() {
	return studClass;
}

public void setStudClass(String studClass) {
	this.studClass = studClass;
}

//Getter and Setter for Student Blood group
public String getStudBloodGr() {
	return studBloodGr;
}

public void setStudBloodGr(String studBloodGr) {
	this.studBloodGr = studBloodGr;
}

//Getter and Setter for Student Date of Birth
public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
 
 public void displayStudentIdDetails()
 {
	 System.out.println("****************** STUDENT ID *******************");
	 System.out.println();
	 System.out.println("Student Id");
 }
 
}
