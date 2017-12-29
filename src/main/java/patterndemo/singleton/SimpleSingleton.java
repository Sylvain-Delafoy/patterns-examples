package patterndemo.singleton;

class SimpleSingleton {
	static SimpleSingleton instance = null;

	public SimpleSingleton() {
		SingletonDemo.sleep();
		System.out.println("Simple : init" + this);
	}

	public static SimpleSingleton getInstance() {
		//System.out.println("Simple : get");
		if (instance == null) {
			instance = new SimpleSingleton();
		}
		return instance;
	}
}