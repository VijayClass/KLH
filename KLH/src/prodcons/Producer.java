package prodcons;

public class Producer implements Runnable{
	public StringBuffer sb = null;
	public Producer()
	{
		sb = new StringBuffer();
	}
	@Override
	public void run() {
		try {
			synchronized(sb) {
			for(int i =0;i<10;i++)
			{
				sb.append(i+":");
				System.out.println("Producer is Appending data..!");
				Thread.sleep(500);
			}
			sb.notify();
		 }
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
