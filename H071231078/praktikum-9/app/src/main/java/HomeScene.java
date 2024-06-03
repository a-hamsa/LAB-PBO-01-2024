
import java.util.List;
import java.util.Optional;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {

    private Stage stage;
    private List<Profile> daftarMahasiswa;



    public HomeScene(Stage stage, List<Profile> daftarMahasiswa) {
        this.stage = stage;
        this.daftarMahasiswa = daftarMahasiswa;
    }



    public void show() {
        BorderPane sceneLayout = new BorderPane();

        Label hello = new Label("HELLO");
        hello.setId("helloText");

        Label welcome = new Label("WELCOME");
        welcome.setId("welcomeText");

        TextArea name = new TextArea();
        name.setId("name");

        TextArea id = new TextArea();
        id.setId("id");

        Button loginButton = new Button("LOGIN");
        Button signUpButton = new Button("SIGN UP");
        loginButton.setId("button");
        signUpButton.setId("button");

        Image image = new Image("/image/7f0884c34b23d737989ddbbfde65c8fd 1.png");
        ImageView imageView = new ImageView(image);
        imageView.setId("mainimage");
        
        BorderPane imagemain = new BorderPane();
        imagemain.setId("image");

        HBox hBox_1 = new HBox(hello);
        HBox hBox_2 = new HBox(welcome);
        HBox hBox_3 = new HBox(name);
        HBox hBox_4 = new HBox(id);
        HBox hBox_5 = new HBox(10);
        hBox_5.getChildren().addAll(loginButton, signUpButton);

        VBox vBox = new VBox(10);
        vBox.setPrefWidth(230);
        vBox.setPadding(new Insets(20));
        vBox.setAlignment(Pos.CENTER);
        vBox.setId("vbox");
        vBox.getChildren().addAll(hBox_1, hBox_2, hBox_3, hBox_4, hBox_5);

        loginButton.setOnAction(v -> {
            String nama = name.getText().trim();
            String nim = id.getText().trim();

            Optional<Profile> existingProfile = daftarMahasiswa.stream()
                .filter(profile -> profile.getNama().equals(nama) && profile.getNim().equals(nim))
                .findFirst();

            if (existingProfile.isPresent()) {
                ProfileScene profileScene = new ProfileScene(stage, nama, nim, daftarMahasiswa);
                profileScene.show();
            } else {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Login Error");
                alert.setHeaderText(null);
                alert.setContentText("Profile not found. Please sign up.");
                alert.showAndWait();
            }
        });

        signUpButton.setOnAction(v -> {
            String nama = name.getText().trim();
            String nim = id.getText().trim();

            boolean namaExists = daftarMahasiswa.stream()
                .anyMatch(profile -> profile.getNama().equals(nama));

            if (namaExists) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Username Error");
                alert.setHeaderText(null);
                alert.setContentText("Username already exists. Please use a different name.");
                alert.showAndWait();
            } else {
                daftarMahasiswa.add(new Profile(nama, nim));
                ProfileScene profileScene = new ProfileScene(stage, nama, nim, daftarMahasiswa);
                profileScene.show();
            }
        });



        sceneLayout.setLeft(vBox);
        sceneLayout.setRight(imagemain);



        Scene scene = new Scene(sceneLayout, 500, 400);
        scene.getStylesheets().add(getClass().getResource("/styling/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


    
    public static class Profile {
        private String nama;
        private String nim;

        public Profile(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public String getNim() {
            return nim;
        }
    }
}
