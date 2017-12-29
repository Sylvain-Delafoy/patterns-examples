package patterndemo.singleton;

class EagerSingleton {
	static EagerSingleton instance = new EagerSingleton();

	public EagerSingleton() {
		SingletonDemo.sleep();
		System.out.println("Eager : init" + this);
	}

	public static EagerSingleton getInstance() {
		//System.out.println("Eager : get");
		return instance;
	}
}