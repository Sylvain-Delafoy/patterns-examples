package patterndemo.strategy;

public class TrieurTemplateMethodInt extends TrieurTemplateMethod<Integer>{
	@Override
	protected boolean compare(Integer t, Integer t2) {
		return t > t2;
	}
}