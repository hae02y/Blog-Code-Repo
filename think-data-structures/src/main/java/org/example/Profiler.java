//package org.example;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
//public class Profiler extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        // 레이아웃 루트
//        BorderPane root = new BorderPane();
//
//        // 예시용 컴포넌트 하나
//        Button startButton = new Button("시작");
//        startButton.setOnAction(event -> {
//            System.out.println("Profiler 시작!");
//            // TODO: 여기서 실제 프로파일링 로직 호출
//        });
//
//        root.setCenter(startButton);
//
//        // Scene 생성
//        Scene scene = new Scene(root, 800, 600);
//
//        primaryStage.setTitle("Profiler");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    void main() {
//        launch();
//    }
//}