package show_datas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class brands implements show_data {

    public void showData(Connection conn) {

        try {
            Statement statement = conn.createStatement();
            String query = String.format("SELECT DISTINCT brend  FROM glasses");
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {

                System.out.println("-"+rs.getString("brend"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
