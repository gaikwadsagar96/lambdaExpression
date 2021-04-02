package LambdaExpression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Product> l=new ArrayList<Product>();
		
		l.add(new Product(1, "Dell", 50000));
		l.add(new Product(4, "sony", 100000));
		l.add(new Product(2, "hp", 40000));
		l.add(new Product(3, "lenovo", 30000));
		l.add(new Product(5, "Asus", 50000));
		Collections.sort(l,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for (Product p : l) 
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		
		
	}

}
