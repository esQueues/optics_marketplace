import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class buying_by_id {
    public void find_ID(Connection conn,int id){
        try {
            String query="SELECT *FROM glasses WHERE id="+id;
            Statement st= conn.createStatement();
            ResultSet rs= st.executeQuery(query);
            while (rs.next()){
                int id777= rs.getInt("id");
                String name=rs.getString("name");
                String brand_name = rs.getString("brend");
                String price = rs.getString("price");
                String optic_power = rs.getString("power");
                String gender = rs.getString("appointments");
                String type1 = rs.getString("type");
                String material1= rs.getString("material");
                String color1 = rs.getString("color");
                System.out.println("IT'S YOUR GLASS WHICH YOU HAVE CHOSEN!");
                System.out.println(id+"|||"+name+"|||"+brand_name+"|||"+price+"|||" +optic_power+"|||"+gender+"|||"+type1+"|||"+material1+"|||"+color1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
