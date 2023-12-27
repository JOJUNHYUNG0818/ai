package javaApp2.ch15.sec07;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparetorEx {

	public static void main(String[] args) {

		Fruit fruits1 = new Fruit("포도", 3000);
		Fruit fruits2 = new Fruit("수박", 10000);
		Fruit fruits3 = new Fruit("딸기", 6000);
		
		//TreeSet<Fruit> treeF = new TreeSet<Fruit>();
		TreeSet<Fruit> treeF = new TreeSet<Fruit>(new FruitCom());
		treeF.add(fruits1);
		treeF.add(fruits2);
		treeF.add(fruits3);
		System.out.println(treeF);
		for(Fruit t : treeF) {
			System.out.println(t.name + " "+ t.price);
		}
		
	}

}



class Fruit {
	String name;
	Integer price;
	
	public Fruit(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name+" "+price;
	}
}



class FruitCom implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return o1.price.compareTo(o2.price);
	}
	
}