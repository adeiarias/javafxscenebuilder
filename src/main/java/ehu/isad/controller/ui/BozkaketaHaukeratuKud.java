package ehu.isad.controller.ui;

import ehu.isad.Main;
import ehu.isad.controller.db.EurobisioaDBKud;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class BozkaketaHaukeratuKud {

  private Main main;
  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private ImageView irudiBalioa;

  @FXML
  private Button okBotoia;

  @FXML
  private ComboBox<String> comboBoxa;

  @FXML
  void onClick(ActionEvent event) {
    main.herriInfoIkusi();
  }

  public void setMainApp(Main main) {
    this.main = main;
  }

  @FXML
  void initialize() {
    Image logoa = new Image("/eurobisioa_logo.png");
    irudiBalioa.setImage(logoa);
    ObservableList<String> lista = EurobisioaDBKud.getInstantzia().lortuHerrialdeak();
    comboBoxa.setItems(lista);
    comboBoxa.setEditable(false);

  }
}
