/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
БИЛЕТ № 11.
Напишите программу, которая создает и выводит на экран 5 случайных целых чисел. Диапозон чисел задает пользователь.
Приложение доллжно быть с графическим интерфейсом JavaFX. Выполните документацию на основе JavaDoc.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Главный класс приложения.
 */
public class Main extends Application {

    private final Random random = new Random(); // объект для генерации случайных чисел

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Случайные числа");

        // создаем элементы управления
        Label rangeLabel = new Label("Диапазон чисел:");
        TextField rangeField = new TextField();
        Label numbersLabel = new Label("Случайные числа:");
        Label numbersField = new Label();
        Button generateButton = new Button("Сгенерировать");

        // задаем действие при нажатии на кнопку
        generateButton.setOnAction(event -> {
            try {
                // получаем диапазон чисел, введенный пользователем
                int range = Integer.parseInt(rangeField.getText());

                // создаем массив из 5 случайных чисел
                int[] numbers = new int[5];
                for (int i = 0; i < 5; i++) {
                    numbers[i] = random.nextInt(range + 1);
                }

                // формируем строку со случайными числами
                StringBuilder sb = new StringBuilder();
                for (int number : numbers) {
                    sb.append(number).append(" ");
                }

                // выводим строку со случайными числами
                numbersField.setText(sb.toString());
            } catch (NumberFormatException e) {
                // обрабатываем ошибку при неправильном вводе диапазона чисел
                numbersField.setText("Ошибка! Неправильный ввод диапазона.");
            }
        });

        // создаем панель, на которой расположим элементы управления
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // добавляем элементы управления на панель
        grid.add(rangeLabel, 0, 0);
        grid.add(rangeField, 1, 0);
        grid.add(generateButton, 1, 1);
        grid.add(numbersLabel, 0, 2);
        grid.add(numbersField, 1, 2);

        // создаем корневой элемент и добавляем в него панель с элементами управления
        VBox root = new VBox();
        root.getChildren().add(grid);

        // создаем сцену и добавляем в нее корневой элемент
        Scene scene = new Scene(root, 300, 200);

        // задаем сцену для основного окна приложения и отображаем его
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
