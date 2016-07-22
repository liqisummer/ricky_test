package com.atguigu.mybatis.test1;

public class User {
	private int id;
	private String name;
	private int age;
	
	public User(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public User(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "["+this.id+","+
		this.name+","+this.age+"]";
	}
	public static void main(String[]args){
		User user = new User(1, "wangjie", 25);
		System.out.println(user);
	}
}
