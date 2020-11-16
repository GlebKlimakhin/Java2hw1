package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.io.IOException;
import java.util.Observable;


public class Controller {

    @FXML
    private TextField textField;
    @FXML
    private ListView listView;
//    @FXML
//    private TextArea secoundTextField;


    ObservableList<String> wordList = FXCollections.observableArrayList("Привет", "Бака");


    @FXML
    public void initialize() {
        listView.setItems(wordList);
    }

    @FXML
    public void addWordToList() {
        String word = textField.getText();
        if (!word.isEmpty())
            listView.getItems().add(word);
        textField.setText("");
    }

    @FXML
    public void exit() {
        System.exit(0);
    }
    @FXML
    public void delete()
    {
        ObservableList<String> empty = FXCollections.observableArrayList();
        listView.setItems(empty);
        textField.setText("");
        empty = FXCollections.observableArrayList();
    }
}


//    public void start1(Stage secoundaryStage)
//    {
//        Parent root1 = null;
//        try {
//            root1 = FXMLLoader.load(getClass().getClassLoader().getResource("sample/secoundStage.fxml"));
//        } catch (IOException e) {
//            System.out.println("нет.");
//        }
//        secoundaryStage.setScene(new Scene(root1));
//       secoundaryStage.show();
//
//    }
//}