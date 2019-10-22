package dad.bindings.custom;

import javafx.beans.binding.StringExpression;

public class StringBinding {

	public static TrimBinding trim (StringExpression str) {
		return new TrimBinding(str);
	}
	

}
