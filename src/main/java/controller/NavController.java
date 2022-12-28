package controller;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class NavController {
    public VBox nav;

    public void btnHomeOnAction(ActionEvent actionEvent) {
        AnchorPane container = (AnchorPane) nav.getUserData();
        container.getChildren().clear();
    }

    public void btnAddStudentOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane container = (AnchorPane) nav.getUserData();
        container.getChildren().clear();
        container.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/AddStudentForm.fxml")));
    }

    public void btnViewStudentsOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane container = (AnchorPane) nav.getUserData();
        container.getChildren().clear();
        container.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/ViewStudentForm.fxml")));
    }
}
