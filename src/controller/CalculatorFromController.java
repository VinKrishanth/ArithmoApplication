package controller;
import calculator.*;
import calculator.InputValues;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CalculatorFromController {
    InputValues object1 = new InputValues();
    Calculate object2 = new Calculate();
    public Button btnAdd;
    public Button btnSub;
    public Button btnMul;
    public Button btnDiv;
    public TextField txtNumber1;
    public TextField txtNumber2;
    public Label lblDisplay;
    String num1;
    String num2;
    String str;
    public void initialize(){
        txtNumber1.requestFocus();
        btnAdd.setVisible(false);
        btnSub.setVisible(false);
        btnMul.setVisible(false);
        btnDiv.setVisible(false);

    }

    public void txtNumber1OnAction(ActionEvent actionEvent) {
        txtNumber1.requestFocus();
        String text = txtNumber1.getText();
        object1.setNumber1(text);
        num1 = object1.getNumber1();
        lblDisplay.setText(num1);
        System.out.println("Number 1 : " + num1);
    }

    public void txtNumber2OnAction(ActionEvent actionEvent) {
        txtNumber2.requestFocus();
        String text = txtNumber2.getText();
        object1.setNumber2(text);
        num2 = object1.getNumber2();
        System.out.println("Number 2 : " + num2);
        lblDisplay.setText(num2);
        btnAdd.setVisible(true);
        btnSub.setVisible(true);
        btnMul.setVisible(true);
        btnDiv.setVisible(true);
    }

    public void lblDisplayOnAction(MouseEvent mouseEvent) {

    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        lblDisplay.requestFocus();
        str = addValues();
        System.out.print("Total : " + str );
        lblDisplay.setText(str);
        clearNumber();
    }

    public void btnDivOnAction(ActionEvent actionEvent) {
        lblDisplay.requestFocus();
        str = divValues();
        System.out.print("Division : " +str );
        lblDisplay.setText(str);
        clearNumber();
    }

    public void btnMulOnAction(ActionEvent actionEvent) {
        lblDisplay.requestFocus();
        str = mulValues();
        System.out.print("Multiplication : " +str );
        lblDisplay.setText(str);
        clearNumber();
    }

    public void btnSubOnAction(ActionEvent actionEvent) {lblDisplay.requestFocus();
        lblDisplay.requestFocus();
        str = subValues();
        System.out.print("Subtraction : " +str );
        lblDisplay.setText(str);
        clearNumber();
    }

    public String addValues(){
        int num = object2.addition(num1,num2);
        return String.valueOf(num);
    }
    public String subValues(){
        int num = object2.subtraction(num1,num2);
        return String.valueOf(num);
    }
    public String mulValues(){
        int num = object2.multiplication(num1,num2);
        return String.valueOf(num);
    }
    public String divValues(){
        int num = object2.division(num1,num2);
        return String.valueOf(num);
    }

    public void clearNumber(){
        txtNumber1.clear();
        txtNumber2.clear();
        System.out.println();
        System.out.println();
    }
}
