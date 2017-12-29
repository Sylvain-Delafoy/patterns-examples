package patterndemo.singleton;

class DoubleCheckSingleton {
	public DoubleCheckSingleton() {
		SingletonDemo.sleep();
		System.out.println("DoubleCheck : init" + this);
	}

	private static volatile DoubleCheckSingleton instance;

	public static DoubleCheckSingleton getInstance() {
		//System.out.println("DoubleCheck : get");
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}