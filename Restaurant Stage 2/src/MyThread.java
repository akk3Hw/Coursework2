import java.util.ArrayList;

public class MyThread extends Thread {
	ArrayList<Order> arrayOfOrders = new ArrayList <Order>(); 
	public void run(Order order) {
		arrayOfOrders.add(order);
		try {
		sleep(200);
	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(arrayOfOrders.size());
        
}
}

