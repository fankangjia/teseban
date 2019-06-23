package study.week3.xml.xml.vo;

import java.util.ArrayList;
import java.util.List;

public class Person {

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
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	String name ;
	int age;
	List<Car> carList = new ArrayList<Car>();
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", carList=" + carList
				+ "]";
	}
}
