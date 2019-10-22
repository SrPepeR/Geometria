package dad.bidireccional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BidireccionalApp extends Application {
	
	private TextField texto1, texto2;
	
	public void start(Stage primaryStage) throws Exception {
		
		texto1 = new TextField();
		texto2 = new TextField();
		
		VBox root = new VBox(5, texto1, texto2);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);
		
		//BINDEO
		texto1.textProperty().bindBidirectional(texto2.textProperty());
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Binding bidireccional");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		
		launch(args);

	}

}
