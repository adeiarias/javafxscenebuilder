package ehu.isad.controller.db;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EurobisioaDBKud {

  // singleton patroia

  private static EurobisioaDBKud instantzia = new EurobisioaDBKud();

  public static EurobisioaDBKud getInstantzia(){
    return instantzia;
  };

  private EurobisioaDBKud(){}

  public ObservableList<String> lortuHerrialdeak(){

    ObservableList<String> emaitza = FXCollections.observableArrayList();
    DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
    String query = "select izena from Herrialde";
    ResultSet rs = dbkud.execSQL(query);

    try {
      while (rs.next()) {
        String izena = rs.getString("izena");
        emaitza.add(izena);
      }
    }catch (SQLException e){
      System.err.println(e);
    }

    return emaitza;
  }
/*
  public void eguneratu() {
    DBKudeatzaile dbkud = DBKudeatzaile.getInstantzia();
    dbkud.execSQL("INSERT INTO properties ('userid', 'key', 'value') values ('5','6','7')");

  }*/
}