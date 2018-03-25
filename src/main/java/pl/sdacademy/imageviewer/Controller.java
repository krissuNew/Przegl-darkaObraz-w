package pl.sdacademy.imageviewer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {


    @FXML
    private ImageView imageViewer;
    @FXML
    private Button buttonLeft;
    @FXML
    private Button buttonRight;

    @FXML
    private Button buttonOpen;


    private Stage stage;

    public void initialize(){


        buttonOpen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                final DirectoryChooser directoryChooser =
                        new DirectoryChooser();

                final File selectedDirectory =
                        directoryChooser.showDialog(stage);
                if (selectedDirectory != null) {
                    selectedDirectory.getAbsolutePath();

               /* FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Open file");
                fileChooser.showOpenDialog(stage);*/
                }
            }
        });


    }

    private void displayImage(){

    }

}
