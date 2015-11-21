package TD_devoir_Charpentier_Louis.gui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * Created by Louis on 20/11/2015.
 */
public class App extends Application {
    private String fromMoney;
    private String toMoney;
    public static void main(String[] args) {

        Application.launch(App.class, args);
    }
    public String caclul(String fromMoney,String toMoney,String value)
    {
        return "";
    }
    public void setValue(int value,String fromOrTo)
    {
        if(fromOrTo=="from")
        {
            if(value==0)
            {}
        }
    }
    @Override
    public void start(Stage primaryStage) {


        primaryStage.setTitle("Convertisseur!");
        Group root= new Group();
        Scene scene = new Scene(root,300,250,Color.GRAY);
        TextField numberFrom=new TextField();
        numberFrom.setPrefSize(75, 12);
        numberFrom.setLayoutX(20);
        numberFrom.setLayoutY(20);

        TextField numberTo=new TextField();
        //numberTo.setDisable(true);
        numberTo.setPrefSize(75,12);
        numberTo.setLayoutX(210);
        numberTo.setLayoutY(20);


        Button EURFrom = new Button();
        EURFrom.setText("EUR");
        EURFrom.setLayoutX(20);
        EURFrom.setLayoutY(100);
        EURFrom.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if(EURFrom.getTextFill()==Color.RED)
                {
                    EURFrom.setTextFill(Color.BLACK);

                }
                else
                {EURFrom.setTextFill(Color.RED);
                    fromMoney="EUR";

                }

            }
        });

        Button USDFrom = new Button();
        USDFrom.setText("USD");
        USDFrom.setLayoutX(20);
        USDFrom.setLayoutY(130);
        USDFrom.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event)
            {
                if(USDFrom.getTextFill()==Color.RED)
            {
                USDFrom.setTextFill(Color.BLACK);

            }
            else
            {
                USDFrom.setTextFill(Color.RED);
                EURFrom.setTextFill(Color.BLACK);
                fromMoney="USD";

            }
            }
        });

        Button GBDFrom = new Button();
        GBDFrom.setText("GBD");
        GBDFrom.setLayoutX(20);
        GBDFrom.setLayoutY(160);
        GBDFrom.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                {
                    if(GBDFrom.getTextFill()==Color.RED)
                    {
                        GBDFrom.setTextFill(Color.BLACK);

                    }
                    else
                    {
                        GBDFrom.setTextFill(Color.RED);
                        EURFrom.setTextFill(Color.BLACK);
                        USDFrom.setTextFill(Color.BLACK);
                        fromMoney="GBD";

                    }
                }
            }
        });

        Button GBDTo = new Button();
        GBDTo.setText("GBD");
        GBDTo.setLayoutX(250);
        GBDTo.setLayoutY(160);
        GBDTo.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                {
                    if(GBDTo.getTextFill()==Color.RED)
                    {
                        GBDTo.setTextFill(Color.BLACK);

                    }
                    else
                    {
                        GBDTo.setTextFill(Color.RED);
                        toMoney="GBD";

                    }
                }
            }
        });

        Button USDTo = new Button();
        USDTo.setText("USD");
        USDTo.setLayoutX(250);
        USDTo.setLayoutY(130);
        USDTo.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                {
                    if(USDTo.getTextFill()==Color.RED)
                    {
                        USDTo.setTextFill(Color.BLACK);

                    }
                    else
                    {
                        USDTo.setTextFill(Color.RED);
                        GBDTo.setTextFill(Color.BLACK);
                        toMoney="USD";

                    }
                }
            }
        });

        Button EURTo = new Button();
        EURTo.setText("EUR");
        EURTo.setLayoutX(250);
        EURTo.setLayoutY(100);
        EURTo.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                {
                    if(EURTo.getTextFill()==Color.RED)
                    {
                        EURTo.setTextFill(Color.BLACK);

                    }
                    else
                    {
                        EURTo.setTextFill(Color.RED);
                        GBDTo.setTextFill(Color.BLACK);
                        USDTo.setTextFill(Color.BLACK);
                        toMoney="EUR";

                    }
                }
            }
        });

        Button calcul = new Button();
        calcul.setText("Calcul");
        calcul.setLayoutX(125);
        calcul.setLayoutY(225);
        calcul.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                numberTo.setText(calcul(fromMoney,toMoney,numberFrom.getText()));
            }
        });

        root.getChildren().add(EURFrom);
        root.getChildren().add(GBDFrom);
        root.getChildren().add(USDFrom);
        root.getChildren().add(EURTo);
        root.getChildren().add(USDTo);
        root.getChildren().add(GBDTo);
        root.getChildren().add(numberFrom);
        root.getChildren().add(numberTo);
        root.getChildren().add(calcul);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String calcul(String fromMoney,String toMoney,String value)
    {


        if(fromMoney.equalsIgnoreCase("EUR"))
        {

            if(toMoney.equalsIgnoreCase("EUR"))
            {
                return String.valueOf(Integer.parseInt(value));
            }
            else if(toMoney.equalsIgnoreCase("USD"))
            {

                return String.valueOf(Integer.parseInt(value)*1.065);
            }
            else if(toMoney.equalsIgnoreCase("GBD"))
            {
                return String.valueOf(Integer.parseInt(value)*0.7);
            }
            else
            {
                return "Error";
            }

        }
      else  if(fromMoney.equalsIgnoreCase("USD"))
        {
            if(toMoney.equalsIgnoreCase("EUR"))
            {
                return String.valueOf(Integer.parseInt(value)*0.94);
            }
            else if(toMoney.equalsIgnoreCase("USD"))
            {
                return String.valueOf(Integer.parseInt(value));
            }
            else if(toMoney.equalsIgnoreCase("GBD"))
            {
                return String.valueOf(Integer.parseInt(value)*0.66);
            }
            else
            {
                return "Error";
            }

    }
        else if(fromMoney.equalsIgnoreCase("GBD"))
        {
            if(toMoney.equalsIgnoreCase("EUR"))
            {
                return String.valueOf(Integer.parseInt(value)*1.43);
            }
            else if(toMoney.equalsIgnoreCase("USD"))
            {
                return String.valueOf(Integer.parseInt(value)*1.52);
            }
            else if(toMoney.equalsIgnoreCase("GBD"))
            {
                return String.valueOf(Integer.parseInt(value));
            }
            else
            {
                return "Error";
            }
}
    else
        {
            return "error";
        }
    }
}
