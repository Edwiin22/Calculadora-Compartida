package org.example.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml");

        Button btnDivision = new Button("Ir a dividir");
        btnDivision.setOnAction(e -> {
            mostrarVentana1();
        });

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void mostrarVentana1() {
        Stage segundaventana = new Stage();
        Label mensaje = new Label("Ingrese los numeros a dividir");

        TextField txtNum1 = new TextField();
        TextField txtNum2 = new TextField();
        Label lblResultado = new Label("Resultado :");
        Button btnOperacion = new Button("division");

        btnOperacion.setOnAction(e -> {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            if (num1 <=0.0 || num2 <=0.0) {
                lblResultado.setText("No se permiten numeros menores o iguales a 0");
            }else{
                double resultado = num1 / num2;
                lblResultado.setText("El resultado es: " + resultado);
            }
        });

        segundaventana.setTitle("Division");
        VBox layout = new VBox(10, mensaje, txtNum1, txtNum2, lblResultado, btnDivision);
        Scene escena = new Scene(layout, 350, 250);
        segundaventana.setScene(escena);
        segundaventana.show();

    public static void main(String[] args) {
        launch();
    }
}