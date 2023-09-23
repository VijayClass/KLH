package prodcons;

public class Consumer implements Runnable{
	Producer prod = null;
	public Consumer(Producer ob)
	{
		prod = ob;
	}
	@Override
	public void run() {
		try {
			synchronized (prod.sb) {
				System.out.println("Consumer Activated");
				for(int i=100;i<110;i++) {
					System.out.println("i: "+i);
					Thread.sleep(500);
				}
				System.out.println("Consumer Blocked");
				prod.sb.wait();
				for(int i=200;i<210;i++) {
					System.out.println("i: "+i);
					Thread.sleep(500);
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
