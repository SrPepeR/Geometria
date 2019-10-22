package dad.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DimensionesApp extends Application {
	
	private Label xLabel;
	private Label yLabel;
	private Label areaLabel;
	
	public void start(Stage primaryStage) throws Exception {
		
		DoubleProperty altura = new SimpleDoubleProperty();
		DoubleProperty ancho = new SimpleDoubleProperty();
		DoubleProperty area = new SimpleDoubleProperty();
		
		xLabel = new Label();
		yLabel = new Label();
		areaLabel = new Label();
		
		VBox root = new VBox(5, xLabel, yLabel, areaLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("Hola JavaFX con Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		altura.bind(scene.heightProperty());
		ancho.bind(scene.widthProperty());
		area.bind(altura.multiply(ancho));
		
		xLabel.textProperty().bind(Bindings.concat("ALTURA: ",altura));
		yLabel.textProperty().bind(Bindings.concat("ANCHO: ",ancho));
		areaLabel.textProperty().bind(Bindings.concat("AREA: ",area));

	}

	public static void main(String[] args) {
		
		launch(args);

	}

}
