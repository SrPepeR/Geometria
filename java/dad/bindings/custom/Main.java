package dad.bindings.custom;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Main {

	public static void main(String[] args) {
		
//		DoubleProperty a = new SimpleDoubleProperty(3);
//		DoubleProperty b = new SimpleDoubleProperty(5);
//		DoubleProperty c = new SimpleDoubleProperty();
//		
//		c.bind(MathBinding.pow(a, 2.0).add(b));
//		
//		c.bind(MathBinding.sqrt(a).add(b));
//		
//		
//		System.out.println(c.get());
//		
//		a.set(5);
//		
//		System.out.println(c.get());
		
		StringProperty str = new SimpleStringProperty("   Hola socio     ");
		StringProperty str2 = new SimpleStringProperty("   Hola socio     ");
		
		str2.bind(StringBinding.trim(str2));
		
		System.out.println("-" + str.get() + "-");
		System.out.println("-" + str2.get() + "-");

	}

}
