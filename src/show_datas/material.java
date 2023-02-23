package show_datas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class material implements show_data{
    public void showData(Connection conn){
        try {
            Statement statement= conn.createStatement();
            String query="SELECT DISTINCT material FROM glasses";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                String material=rs.getString("material");
                System.out.println("-"+material);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
