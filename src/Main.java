import mvc.view.MainView;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    //https://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-connect-drivermanager.html
    //https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Juices?user=juice&password=jcy");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select tip from roles");
        while(rs.next())
            System.out.println(rs.getString(1));

        EventQueue.invokeLater(() -> {
            MainView frame = new MainView();

            frame.setVisible(true);
        });
    }
}
