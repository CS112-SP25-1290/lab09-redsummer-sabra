package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {

    @FXML
    ImageView imageView;

    @FXML
    Label locationLabel;

    @FXML
    Label dateLabel;

    @FXML
    Label descriptionLabel;

    @FXML
    Label revisedDescriptionLabel;

    @FXML
    Hyperlink hyperLinkReference;

    public void handelCloseButton() {

    }

    public void initData(Constants.Event eventIndex) {
        String[] data = Constants.HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);

    }

    public void handleSFButton(ActionEvent actionEvent) {
    }

    public void handleBisbeeButton(ActionEvent actionEvent) {
    }
}
