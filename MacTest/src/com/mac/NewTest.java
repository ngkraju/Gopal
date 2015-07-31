package com.mac;

public enum NewTest {
	gopal("good", 21), krishna("better", 22), raju("best", 23);

	public String getGrade() {
		return grade;
	}

	public int getAge() {
		return age;
	}

	private String grade;
	private int age;

	NewTest(String ade, int ag) {
		grade = ade;
		age = ag;
	}
}
