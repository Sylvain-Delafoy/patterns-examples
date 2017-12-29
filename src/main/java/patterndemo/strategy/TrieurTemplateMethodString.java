package patterndemo.strategy;

public class TrieurTemplateMethodString extends TrieurTemplateMethod<String>{
	@Override
	protected boolean compare(String t, String t2) {
		return t.compareTo(t2)>0;
	}
}