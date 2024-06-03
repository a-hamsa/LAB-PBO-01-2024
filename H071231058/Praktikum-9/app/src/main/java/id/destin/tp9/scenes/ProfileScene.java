package id.destin.tp9.scenes;

import java.io.File;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ProfileScene {
    private Stage stage;
    private String name;
    private long phone;
    private String address;
    private ImageView profileImage;
    private Circle clip;
    
    public ProfileScene(Stage stage) {
        this.stage = stage;
        this.profileImage = new ImageView();
        this.clip = new Circle(50);
        profileImage.setClip(clip);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void show() {
        Label label = new Label("Profile");
        label.setFont(Font.font("System", FontWeight.BOLD, 30));
       label.setTextFill(Color.DARKGREEN);

        Label labelName = new Label("Name    : " + name);
        labelName.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        Label labelPhone = new Label("Phone    : " + phone);
        labelPhone.setFont(Font.font("Georgia", FontWeight.BOLD, 15));
        Label labelAddress = new Label("Address : " + address);
        labelAddress.setFont(Font.font("Georgia", FontWeight.BOLD, 15));

        Button btnLogout = new Button("Keluar");
        btnLogout.setStyle("-fx-background-color: #ff4d4d; -fx-text-fill: white; -fx-font-weight: bold;");
        btnLogout.setOnAction(e -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });

        Button btnChooseImage = new Button("Choose Profile Image");
        btnChooseImage.setStyle("fx-background-color: #4d79ff; -fx-text-fill: black; -fx-font-weight: bold;");
        btnChooseImage.setOnAction(e -> chooseImage());

        VBox profile = new VBox(10, labelName, labelPhone, labelAddress, btnChooseImage, btnLogout);
        profile.setAlignment(Pos.BASELINE_LEFT);
        profile.setSpacing(5);
        profile.setPadding(new Insets(30));
        // profile.setBackground(new Background(new BackgroundFill(Color.LINEN, CornerRadii.EMPTY, null)));
        // stage.getScene().setRoot(profile);
        
        profileImage.setFitWidth(100);
        profileImage.setFitHeight(100);
        profileImage.setPreserveRatio(true);
        // profileImage.setClip(clip);
        
        HBox hbox = new HBox(20, profile, profileImage);
        hbox.setAlignment(Pos.CENTER);
        // hbox.setPadding(new Insets(20));

        VBox mainView = new VBox(10, label, hbox);
        mainView.setAlignment(Pos.CENTER);
        // mainView.setPadding(new Insets(20));
        mainView.setBackground(new Background(new BackgroundFill(Color.LINEN, CornerRadii.EMPTY, null)));

        Scene scene = new Scene(mainView, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    
    private void chooseImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"));

        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            profileImage.setImage(image);
            clip.setRadius(profileImage.getFitWidth()/2);
            clip.setCenterX(profileImage.getFitWidth()/2);
            clip.setCenterY(profileImage.getFitHeight()/2);
        }
    }
}

