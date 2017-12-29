package patterndemo.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {
		SingletonDemo.sleep();
		System.out.println("BPS : init"+this);
	}

	private static class SingletonHolder {
		private static BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		//System.out.println("BPS : get");
		return SingletonHolder.instance;
	}
}
