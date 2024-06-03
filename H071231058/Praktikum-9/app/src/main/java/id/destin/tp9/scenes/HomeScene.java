package id.destin.tp9.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
       Label labelHi = new Label("Hi!");
       labelHi.setFont(Font.font("System", FontWeight.BOLD, 30));
       labelHi.setTextFill(Color.DARKGREEN);

       Label labelName = new Label("Fullname");
       labelName.setTextFill(Color.DARKGREEN);

       TextField textfieldName = new TextField();
       textfieldName.setMaxWidth(150);

       Label labelPhone = new Label("Phone");
       labelPhone.setTextFill(Color.DARKGREEN);

       TextField textfieldPhone = new TextField();
       textfieldPhone.setMaxWidth(150);

       Label errorLabel = new Label();
       errorLabel.setTextFill(Color.RED);

       Label labelAddress = new Label("Address");
       labelAddress.setTextFill(Color.DARKGREEN);

       TextField textfieldAddress = new TextField();
       textfieldAddress.setMaxWidth(150);

       Button buttonLogin = new Button("Go to Profile");
       buttonLogin.setPrefWidth(150);
       buttonLogin.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, new CornerRadii(10), null)));
       buttonLogin.setTextFill(Color.WHITE);
       buttonLogin.setOnAction(e -> {
        ProfileScene profileScene = new ProfileScene(stage);
        

        if (textfieldName.getText().trim().isEmpty() || textfieldPhone.getText().trim().isEmpty() || textfieldAddress.getText().trim().isEmpty()) {
            return;
        } else {
            // ProfileScene profileScene = new ProfileScene(stage);
            profileScene.setName(textfieldName.getText());
            try {
                long phoneNumber = Long.parseLong(textfieldPhone.getText());
                profileScene.setPhone(phoneNumber);
                errorLabel.setText("");
            } catch (NumberFormatException ex) {
                errorLabel.setText("Invalid phone number. Please  enter a valid phone number");
                return;
            }

            profileScene.setAddress(textfieldAddress.getText());
            profileScene.show();
        }
       });

       VBox root = new VBox(labelHi, labelName, textfieldName,labelPhone, textfieldPhone, errorLabel, labelAddress, textfieldAddress, buttonLogin);
       root.setAlignment(Pos.CENTER);
       root.setSpacing(10);
       root.setPadding(new Insets(30));
       stage.getScene().setRoot(root);
       root.setBackground(new Background(new BackgroundFill(Color.LINEN, CornerRadii.EMPTY, null)));
    }
}
