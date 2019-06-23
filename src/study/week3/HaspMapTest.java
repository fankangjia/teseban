package study.week3;

import java.util.HashMap;
import java.util.Map;
class Customer{
	private String name;
	private int age;
	Customer(String name,int age){
		this.name=name;
		this.age=age;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class HaspMapTest {

	public static void swap(Integer a,Integer b) {
		int tem;
		tem=a;
		a=b;
		b=tem;
				
				
	}
	
	public static void main(String[] args) {
		Map<Customer, Integer> map=new HashMap();
		map.put(new Customer("Aa",6),6);
		map.put(new Customer("Aa",6),7);
		Integer a=1;
		Integer a1=new Integer(1);
		Integer b=2;
		Integer b1=new Integer(2);
		a=3;
		a=b;
		swap(a,b);
		swap(a1,b1);
		System.out.println(a+"   "+b);
		System.out.println(a1+"   "+b1);
		int tem;
		tem=a;
		a=b;
		b=tem;
		System.out.println(a+"   "+b);
	}

}
