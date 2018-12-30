package kr.ayukawa.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class EntryPoint extends Application {
	@Override
	public void start(final Stage primaryStage) {
		Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
		infoAlert.setTitle("Information Box");
		infoAlert.setHeaderText("Look, this is information box");

		Button btn = new Button();
		btn.setText("click to show Information box");
		btn.setOnAction(evt -> {
			infoAlert.setContentText("Today is " + LocalDateTime.now().toString());
			infoAlert.showAndWait();
		});

		BorderPane pane = new BorderPane();
		pane.setCenter(btn);

		Scene scene = new Scene(pane, 320, 280);

		primaryStage.setScene(scene);
		primaryStage.setTitle("GUI Application");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
