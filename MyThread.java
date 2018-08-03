
public class MyThread extends Thread {
	private int data;

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for(int c=1; c<=50; c++)
			System.out.println(name + ": " + ++ data);
	}
	
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("First");
		MyThread mt2 = new MyThread("Second");
		MyThread mt3 = new MyThread("Third");
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		String name = currentThread().getName();
		for(int c=1; c<=50; c++)
			System.out.println(name + ": " + c);
	}
}
