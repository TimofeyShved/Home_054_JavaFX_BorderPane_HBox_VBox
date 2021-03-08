package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Box");

        VBox vBox = new VBox(10); // горизонтальное
        HBox hBox = new HBox(10); // вертикальное
        hBox.setAlignment(Pos.CENTER);
        vBox.setAlignment(Pos.CENTER);

        Button btn1 = addButton("1");//     1/2/3               Top
        Button btn2 = addButton("2");// ---------------     --------------
        Button btn3 = addButton("3");// 4 /         /            /      /
        Button btn4 = addButton("4");// 5 /         /       left | centr | right
        Button btn5 = addButton("5");// 6 /         /           /       /
        Button btn6 = addButton("6");// ----------------    --------------
                                           //                       bottom

        hBox.getChildren().addAll(btn1,btn2,btn3); // горизонтальное
        vBox.getChildren().addAll(btn4,btn5,btn6); // вертикальное

        // добавление на сцены на форму, а так же кнопки и квадрата
        BorderPane root = new BorderPane(); // Основное
        root.setTop(hBox);
        root.setLeft(vBox);
        primaryStage.setScene(new Scene(root, 300, 275));  // размер формы и сцена
        primaryStage.show(); // отобразить
    }

    private Button addButton(String name){
        Button button = new Button(name);
        button.setPrefSize(70, 20);
        return button;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
