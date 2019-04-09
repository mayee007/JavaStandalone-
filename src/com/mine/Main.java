package com.mine; 
import java.lang.reflect.Method;
import java.util.*;

public class Main{
   public static void main(String []args){
	   Class student = Student.class; 
	   Method[] methods = student.getMethods(); 
	   
	   List<String> strList = new ArrayList<String>(); 
	   
	   for (Method method: methods) { 
		   //System.out.println(method.getName());
		   strList.add(method.getName()); 
	   }
	   
	   Collections.sort(strList); 
	   
	   for (String str: strList) { 
		   System.out.println(str); 
	   }
   }
   
}



class Student { 
	String id; 
	String name; 
	String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}