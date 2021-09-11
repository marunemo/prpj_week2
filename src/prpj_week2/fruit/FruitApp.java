package prpj_week2.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitApp {
	int no;			// number
	String name;	// name
	int price;		// price
	
	public FruitApp(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	public static class AscComparator implements Comparator<FruitApp> {
		@Override
		public int compare(FruitApp o1, FruitApp o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	public static class DescComparator implements Comparator<FruitApp> {
		@Override
		public int compare(FruitApp o1, FruitApp o2) {
			return o2.name.compareTo(o1.name);
		}
	}
	
	@Override
	public String toString() {
		return "Fruit [no=" + this.no + ", name=" + this.name +  ", price=" + this.price + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<FruitApp> fruit = new ArrayList<FruitApp>();
		fruit.add(new FruitApp(1, "apple", 3500));
		fruit.add(new FruitApp(2, "strawberry", 2000));
		fruit.add(new FruitApp(3, "grapes", 5000));
		fruit.add(new FruitApp(4, "orange", 3000));
		fruit.add(new FruitApp(5, "lemon", 4500));
		fruit.add(new FruitApp(6, "kiwi", 3500));
		fruit.add(new FruitApp(7, "cherry", 3000));
		fruit.add(new FruitApp(8, "cranberry", 3500));
		fruit.add(new FruitApp(9, "guava", 5000));
		fruit.add(new FruitApp(10, "mango", 2500));
		
		System.out.println("Friut List (ordered by name)");
		Collections.sort(fruit, new FruitApp.AscComparator());
		fruit.forEach(System.out::println);
		
		System.out.println("Friut List (reverse ordered by name)");
		Collections.sort(fruit, new FruitApp.DescComparator());
		fruit.forEach(System.out::println);	
	}
}
