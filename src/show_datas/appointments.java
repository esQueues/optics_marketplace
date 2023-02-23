package show_datas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class appointments implements show_data {
    public void showData (Connection conn){
        try {
            Statement statement= conn.createStatement();
            String query="SELECT DISTINCT appointments FROM glasses";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                String appointments=rs.getString("appointments");
                System.out.println("-"+appointments);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
