package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MainController {
    @FXML
    private Label titleLabel;
    @FXML
    private Label subtitleLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private ImageView imageView;

    public MainController() {
    }

    @FXML
    protected void handleQuit() {
        System.exit(0);
    }

    @FXML
    protected void handleStart(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource("map-view.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Red Summer Map");
        stage.show();
    }

    @FXML
    public void initialize() {
        this.titleLabel.setText("Interactive Revisionist History Map");
        this.subtitleLabel.setText("Red Summer Edition");
        this.descriptionLabel.setText("In 1919, Red Summer was a pattern of white-on-black violence that occurred in more than three dozen cities across the United States and in one rural county in Arkansas. The term 'Red Summer' was coined by civil rights activist and author James Weldon Johnson, who had been employed as a field secretary by the National Association for the Advancement of Colored People (NAACP) since 1916. It was branded 'Red Summer' because of the bloodshed that occurred during the worst white-on-black violence in U.S. history.");
        this.imageView.setImage(new Image("file:./src/main/resources/images/Red-Summer.jpg"));
    }
}