package dad.celcius2fahrenheit;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class C2FAPP extends Application {

	private TextField celsiusTextField;
	private Label fahrenheitLabel;
	
	private DoubleProperty celsius = new SimpleDoubleProperty(0);
	private DoubleProperty fahrenheit = new SimpleDoubleProperty(0);
	
	public void start(Stage primaryStage) throws Exception {
		
		celsiusTextField = new TextField();
		fahrenheitLabel = new Label();
		
		HBox root = new HBox(5, celsiusTextField, fahrenheitLabel);
		celsiusTextField.setMaxWidth(75);
		
		//BINDEOS
		Bindings.bindBidirectional(celsiusTextField.textProperty(), celsius, new NumberStringConverter());

		fahrenheit.bind(celsius.multiply(9.0/5.0).add(32));
		fahrenheitLabel.textProperty().bind(fahrenheit.asString().concat("ºF"));
		
		Scene scene = new Scene(root, 100, 27);
		
		primaryStage.setTitle("Celsius 2 Fahrenheit");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		
		launch(args);

	}

}
