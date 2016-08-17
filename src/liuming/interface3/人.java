package liuming.interface3;

public abstract class 人 {
	private String name;//名称
	private int grade;//等级
	
	public abstract void 介绍自己();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
