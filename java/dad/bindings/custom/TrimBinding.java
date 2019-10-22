package dad.bindings.custom;

import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;

public class TrimBinding extends StringBinding {
	
	private StringExpression s;
	
	public TrimBinding(StringExpression s) {
		
		super();
		this.s = s;
		bind(s);
		
	}
	
	protected String computeValue() {
		return this.s.get().trim();
	}
}
