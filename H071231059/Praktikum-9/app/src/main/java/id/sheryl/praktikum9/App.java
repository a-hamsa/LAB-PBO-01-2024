package id.sheryl.praktikum9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class App extends Application{
    private Stage stage;
    String name, status;
    int age;
    boolean cekProfile = false;
    boolean isimage = false;
    ImageView profilePhoto;

    @Override
    public void start(Stage primmaryStage) throws Exception {
        stage = primmaryStage;
        stage.setTitle("Profile App");
        showHomeScene();
        stage.show();
    }

    private void showHomeScene() {
        VBox vBox = new VBox(10);
        vBox.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        Text headerText = new Text("Welcome, user!");
        headerText.getStyleClass().add("hometext-style");

        Button btnRegister = new Button("Create a New Profile");
        btnRegister.getStyleClass().add("button-style");

        btnRegister.setOnAction(e -> {
            registerProfileScene();
        });

        Button btnShowProfile = new Button("Show Profile Detail");
        btnShowProfile.getStyleClass().add("button-style");
        btnShowProfile.setOnAction(e -> {
            if (cekProfile) {
                showProfileScene();
            } else {
                headerText.setText("     There is no profile yet. \nPlease create a new profile!");
            }
        });

        HBox hBox = new HBox(20, btnRegister, btnShowProfile);
        hBox.setAlignment(Pos.CENTER);
        
        vBox.getChildren().addAll(headerText, hBox);
        vBox.setAlignment(Pos.CENTER);
        
        vBox.setStyle("-fx-background-color: #AEC6CF;");

        Scene homescene = new Scene(vBox, 500, 400);
        stage.setScene(homescene);
    }

    private void registerProfileScene() {
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        Button imagebtn = new Button("Choose Profile Photo");
        imagebtn.setStyle("-fx-background-color: white; -fx-text-fill: #AEC6CF; -fx-font-weight: bold; -fx-border-radius: 5px;  -fx-background-radius: 5px;");
        ImageView imageView = new ImageView();

        imageView.setFitWidth(200);
        imageView.setFitHeight(100);
        imageView.setPreserveRatio(true);

        imagebtn.setOnAction(e -> {
            Image chooseImage = new Image(getClass().getResourceAsStream("/CHIBI.png"));
            imageView.setImage(chooseImage);
            isimage = true;
        });

        Text text = new Text("Please complete your profile with the correct answers.");
        text.getStyleClass().add("registext-style");

        Label nameLbl = new Label("        Name: ");
        nameLbl.getStyleClass().add("label-style");
        TextField nameField = new TextField();
        nameField.getStyleClass().add("textfield-style");
        nameField.setPrefSize(350,30);

        Label ageLbl = new Label("        Age: ");
        ageLbl.getStyleClass().add("label-style");
        TextField ageField = new TextField();
        ageField.getStyleClass().add("textfield-style");
        ageField.setPrefSize(350,30);

        Label statusLbl = new Label("        Status: ");
        statusLbl.getStyleClass().add("label-style");
        TextField statusField = new TextField();
        statusField.getStyleClass().add("textfield-style");
        statusField.setPrefSize(350,30);

        Button btnSave = new Button("   Save   ");
        btnSave.getStyleClass().add("button-style");
        btnSave.setOnAction(e ->{
            try {
                if (isimage) {
                    profilePhoto = imageView;
                    name = nameField.getText();
                    status = statusField.getText();
                    age = Integer.parseInt(ageField.getText());
                    cekProfile = true;
                    isimage = false;
                    showHomeScene();
                } else {
                    text.setText("Please select a profile photo.");
                }
            } catch (Exception ex) {
                text.setText("Please fill in the answer in the right format");
            }
        });
      
        Button btnHome = new Button("   Home   ");
        btnHome.getStyleClass().add("button-style");
        btnHome.setOnAction(e -> {
            showHomeScene();
        });
        
        HBox namahBox  = new HBox(10, nameLbl, nameField);
        namahBox.setAlignment(Pos.CENTER);
        HBox ageHBox = new HBox(20, ageLbl, ageField);
        ageHBox.setAlignment(Pos.CENTER);
        HBox statusHBox = new HBox(10, statusLbl, statusField);
        statusHBox.setAlignment(Pos.CENTER);

        
        HBox hBox = new HBox(20, btnHome, imagebtn, btnSave);
        hBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(imageView, text, namahBox,ageHBox, statusHBox, hBox);
        vBox.setStyle("-fx-background-color: #AEC6CF;");
        vBox.setAlignment(Pos.CENTER);
        
        Scene registerProfilScene = new Scene(vBox, 500, 400);
        stage.setScene(registerProfilScene);
    }

    private void showProfileScene() {
        VBox vBox = new VBox(15);
        vBox.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        Text header = new Text("User Detail Profile:");
        header.getStyleClass().add("profiletext-style");

        Text nameText = new Text("Name : " + name);
        nameText.getStyleClass().add("text-style");
        Text ageText = new Text("Age : " + age + " years old");
        ageText.getStyleClass().add("text-style");

        Text statusText = new Text("Status : " + status);
        statusText.getStyleClass().add("text-style");
        
        Button btnHome = new Button("Home");
        btnHome.getStyleClass().add("button-style");
        btnHome.setOnAction(e -> showHomeScene());
        
        vBox.getChildren().addAll(header, profilePhoto, nameText, ageText, statusText, btnHome);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: #AEC6CF;");
        
        Scene profilScene = new Scene(vBox, 500, 400);
        stage.setScene(profilScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}