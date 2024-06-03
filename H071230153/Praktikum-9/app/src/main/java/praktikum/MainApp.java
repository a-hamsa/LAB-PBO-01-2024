package praktikum;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Screen 1
        Text introText = new Text("Hi, I'm Fathan come see my details under this button");

        Button detailsButton = new Button("See Details");

        VBox vbox1 = new VBox(20, introText, detailsButton);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-background-color: #38b6ff; -fx-padding: 20;"); // Background color light gray

        // Screen 2
        Rectangle kotak = new Rectangle(300, 200);
        kotak.setFill(Color.LIGHTBLUE);
        kotak.setArcHeight(20);
        kotak.setArcWidth(20);

        Text detailsText = new Text(
            "Name: Fathan Wibowo\n" +
            "NIM: H071231053\n" +
            "Major: Information System\n" +
            "Hobby: sleeping\n" +
            "Email: ziworth05@gmail.com\n" +
            "WhatsApp num.: 081728239332"
        );
        detailsText.setStyle("-fx-font-size: 14pt; -fx-fill: black;"); // Text color black

        Button backButton = new Button("Back");

        VBox screen2VBox = new VBox(20, new Text("Details"), detailsText, backButton);
        screen2VBox.setAlignment(Pos.CENTER);
        screen2VBox.setStyle("-fx-background-color: #CCFFCC; -fx-padding: 20;"); // Background color light green

        StackPane susun = new StackPane();
        susun.getChildren().addAll(kotak, screen2VBox);
        susun.setAlignment(Pos.CENTER);

        // Switch scenes
        Scene scene1 = new Scene(vbox1, 800, 600);
        Scene scene2 = new Scene(susun, 800, 600);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Fathan's Details");
        primaryStage.show();

        detailsButton.setOnAction(e -> primaryStage.setScene(scene2));
        backButton.setOnAction(e -> primaryStage.setScene(scene1));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
