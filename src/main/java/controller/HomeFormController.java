package controller;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import javafx.animation.Transition;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HomeFormController {
    public JFXHamburger btnHamburger;
    public JFXDrawer dwrMenu;
    public AnchorPane root;
    public AnchorPane container;

    public void initialize() throws IOException {
        VBox nav = FXMLLoader.load(this.getClass().getResource("/view/Nav.fxml"));
        nav.setUserData(container);
        dwrMenu.setSidePane(nav);

        btnHamburger.setAnimation(new HamburgerBasicCloseTransition());
        btnHamburger.setOnMouseClicked(mouseEvent -> {
            final Transition burgerAnimation = btnHamburger.getAnimation();
            burgerAnimation.setRate(burgerAnimation.getRate() * -1);
            burgerAnimation.play();
            if (dwrMenu.isShown()) {
                dwrMenu.close();
            } else {
                dwrMenu.open();
            }
        });
    }
}
