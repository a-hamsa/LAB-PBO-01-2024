import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfileScene {

    private Stage stage;
    private String nama;
    private String nim;
    private List<HomeScene.Profile> daftarMahasiswa;


    public ProfileScene(Stage stage, String nama, String nim, List<HomeScene.Profile> daftarMahasiswa) {
        this.stage = stage;
        this.nama = nama;
        this.nim = nim;
        this.daftarMahasiswa = daftarMahasiswa;
    }
    

    public void show() {
        BorderPane sceneLayout = new BorderPane();
        sceneLayout.setId("body");

        // Image image1 = new Image("/image/image-2.png");
        // ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("/image/image-3.png");
        ImageView imageView2 = new ImageView(image2);

        Image avatar_1 = new Image("/image/Avatar-1.png");
        ImageView imageView3 = new ImageView(avatar_1);

        Label namaLabel = new Label("NAMA : " + this.nama.toUpperCase());
        Label nimLabel = new Label("NIM     : " + this.nim.toUpperCase());
        namaLabel.setId("profile-text");
        nimLabel.setId("profile-text");
        Button backButton = new Button(" < ");
        backButton.setId("button");

        HBox nama = new HBox(namaLabel);
        HBox nim = new HBox(nimLabel);

        VBox vBox1 = new VBox(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(nama, nim);

        HBox hBox1 = new HBox(20);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(imageView3, vBox1);

        HBox hBox2 = new HBox(backButton);
        hBox2.setPadding(new Insets(10));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView2, hBox1);

        backButton.setOnAction(v -> {
            HomeScene firstScene = new HomeScene(stage, daftarMahasiswa);
            firstScene.show();
        });

        sceneLayout.setCenter(stackPane);
        sceneLayout.setTop(hBox2);

        Scene scene = new Scene(sceneLayout, 500, 400);
        scene.getStylesheets().add(getClass().getResource("/styling/style2.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
