package LambdaExpression;
import java.util.ArrayList;
import java.util.List;

public class ForEachExample 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("sagar");
		l.add("kalayni");
		l.add("vaibhav");
		l.add("harshad");
		l.add("Akshay");
		l.add("Amir");
		
		l.forEach((n)-> System.out.println(n));
	}

}
