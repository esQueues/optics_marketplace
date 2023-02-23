package show_datas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class color implements show_data {
    public void showData(Connection conn){
        try {
            Statement statement= conn.createStatement();
            String query="SELECT DISTINCT color FROM glasses";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                String color=rs.getString("color");
                System.out.println("-"+color);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
