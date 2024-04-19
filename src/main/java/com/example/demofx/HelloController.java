package com.example.demofx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

public class HelloApplication extends Application {
    public void doPlus (){
        System.out.println("пыта");
    }
}public class  SRectangleCalculator{
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    TextField textX;
    @FXML
    TextField textY;
    public void doLPlus() {
        System.out.println("пытаемся сделать сложение");
        label1.setText("пытаемся сделать сложение");
        int x = Integer.parseInt(textX.getText());
        int y = Integer.parseInt(textY.getText());
        int z = x + y;
        label2.setText(String.valueOf(z));

    }
    public void doMinus (){
        System.out.println( "пытаемся сделать вычитание");
        label1.setText( "пытаемся сделать вычитание");
        int x = Integer.parseInt(textX.getText());
        int y = Integer.parseInt(textY.getText());
        int z=x-y;
        label2.setText(String.valueOf(z));

    }
}
public void sqRectangleArea(){
    System.out.println("вычислить площадь");
    label1.setText( "вычислить площадь");
    int x = Integer.parseInt(textX.getText());
    int y = Integer.parseInt(textY.getText());
    int z=x*y;
    label2.setText(String.valueOf(z));

    public class Rectangle{
        int x,y;


        // Area Method to calculate the area of Rectangle
        void Area()
        {
            double area;
            area = x*y;
            System.out.println("Area of rectangle is : "
                    + area);

        }
    }
    public class Rectangle(int x,int y) throws Exception{
        try
        {
            (x<0 || y<0);
            throw new Exceptiopn( "отрицательная длина и ширина");

        }

catch(ТипИсключения имя)
        {
            код обработки исключения
        }
        if

    }


