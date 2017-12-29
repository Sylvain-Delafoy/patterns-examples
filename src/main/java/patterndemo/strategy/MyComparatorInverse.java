package patterndemo.strategy;

// Attends, Attends.... Je suis utilisé comme stratégie, mais j'ajoute un comportement à un objet que j'enveloppe.
// Serais-je un Décorator?
public class MyComparatorInverse<T> implements MyComparator<T>{
	private MyComparator<T> original;
	public MyComparatorInverse(MyComparator<T> original) {
		this.original=original;
	}
	@Override
	public boolean compare(T t, T t2) {
		return ! this.original.compare(t, t2);
	}
}