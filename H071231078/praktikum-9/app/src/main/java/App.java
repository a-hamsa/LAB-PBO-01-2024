import javafx.application.Application;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        List<HomeScene.Profile> daftarMahasiswa = new ArrayList<>();
        HomeScene initScene = new HomeScene(primaryStage, daftarMahasiswa);
        initScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
