/*package LambdaExpression;

public class ThreadExampleUsingLambda {

	public static void main(String[] args)
	{
		//without lambda
		Runnable r1=new Runnable() 
		{		
			public void run() {
				System.out.println("Thread one is running..");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Runnable r2=()->{
			System.out.println("Thread 2 is running...");
		};
		Thread  t2=new Thread(r2);
		t2.start();

	}

}*/
