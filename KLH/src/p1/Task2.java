package p1;

public class Task2 implements Runnable{
	public void run()
	{
		for (int j=220;j<=240;j++)
		{
			System.err.println("j: "+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
