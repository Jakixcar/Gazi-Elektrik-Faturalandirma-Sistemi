package proje_elektrik_veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proje_Elektrik_Veritabani {

    public static void main(String[] args) {
        Giris giris = new Giris();
        giris.setVisible(true);
    }
    
}
