package org.example.menu;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DivisionVentana {

    public static void show() {
        Stage ventana = new Stage();
        ventana.setTitle("División");

        Label lblTitulo     = new Label("Ingrese los números a dividir");
        TextField txtNum1   = new TextField();
        TextField txtNum2   = new TextField();
        Label lblResultado  = new Label("Resultado:");
        Button btnDividir   = new Button("Dividir");

        btnDividir.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());

                Division operacion = new Division();

                if (num2 == 0) {
                    lblResultado.setText("❌ No se puede dividir entre 0");
                } else if (num1 <= 0 || num2 <= 0) {
                    lblResultado.setText("❌ Sólo números mayores que 0");
                } else {
                    double resultado = operacion.dividir(num1, num2);
                    lblResultado.setText("Resultado: " + resultado);
                }
            } catch (NumberFormatException ex) {
                lblResultado.setText("❌ Ingresa valores numéricos");
            }
        });

        VBox layout = new VBox(10, lblTitulo, txtNum1, txtNum2, btnDividir, lblResultado);
        layout.setPadding(new Insets(15));

        Scene escena = new Scene(layout, 350, 250);

        escena.getStylesheets().add(
                DivisionWindow.class.getResource("/src/main/resources/Styles/EstiloDivision.css").toExternalForm()
        );

        ventana.setScene(escena);
        ventana.show();
    }
}