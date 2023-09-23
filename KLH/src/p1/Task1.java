package p1;

public class Task1 implements Runnable{
	public void run()
	{
		for(int i=100;i<=120;i++)
		{
			System.out.println("i: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
