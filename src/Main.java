import filtering_package.new_filtering_way;
import show_datas.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PostgreConn db = new PostgreConn();
        Connection conn = db.connect_to_db("optics_market", "postgres", "12345");
        Scanner sc = new Scanner(System.in);
        BufferedReader bi = new BufferedReader( new InputStreamReader(System.in));

        boolean q = true;
        while (q) {
            System.out.println("1.SHOW ALL DATA");
            System.out.println("2.FIND WITH FILTERING");
            System.out.println("3.DEVELOPER MODE");
            System.out.println("4.QUIT");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    showing_all_data_class gg = new showing_all_data_class();
                    gg.show_all_glasses(conn);
                    break;
                case 2:

                    ArrayList<String> glasses = new ArrayList<String>();

                    //brand
                    System.out.println("@>In our store has BRANDS like:");
                    brands bb = new brands();
                    bb.showData(conn);
                    System.out.println("@>input name of brand exactly same as in interface*");
                    String b = sc.next();

                    //optic power
                    System.out.println("@>:In our store has glasses only with this POWERS:");
                    optic_power op = new optic_power();
                    op.showData(conn);
                    System.out.println("@>enter your optic POWER of glass:");
                    String p = sc.next();


                    //appointment
                    System.out.println("@>:In our store has APPOINTMENTS:");
                    appointments app = new appointments();
                    app.showData(conn);
                    System.out.println("@>:Input your APPOINTMENT:");
                    String a = sc.next();

                    //type
                    System.out.println("@>:In our store has TYPES:");
                    types ty = new types();
                    ty.showData(conn);
                    System.out.println("@>:Input your TYPE:");
                    String type = bi.readLine();

                    //material
                    System.out.println("@>:In our story has MATERIALS:");
                    material mt = new material();
                    mt.showData(conn);
                    System.out.println("@>:Input MATERIAL:");
                    String material2 = bi.readLine();

                    //color
                    System.out.println("@>:In our story has COLORS:");
                    color cl = new color();
                    cl.showData(conn);
                    System.out.println("@>:Input COLOR:");
                    String color = sc.next();


                    glasses.add(0, "brend");
                    glasses.add(1, b);

                    glasses.add(2, "power");
                    glasses.add(3, p);

                    glasses.add(4, "appointments");
                    glasses.add(5, a);

                    glasses.add(6, "type");
                    glasses.add(7, type);

                    glasses.add(8, "material");
                    glasses.add(9, material2);


                    glasses.add(10, "color");
                    glasses.add(11, color);


                    for (int i = 11; i >= 1; i -= 2) {
                        if (glasses.get(i).equals("nomatter")) {
                            glasses.remove(i);
                            glasses.remove(i - 1);
                        }
                    }

                    new_filtering_way ff12 = new new_filtering_way();
                    ff12.g_filter(conn, glasses);

                    System.out.println("Are gonna buy or skip");

                    String qwe= sc.next();
                    if(qwe.equals("buy")){
                        System.out.println("Input the ID of the glass:");
                        int glass_ID= sc.nextInt();
                        System.out.println("Input your name please:");
                        String  name_client=sc.next();
                        System.out.println("Input your surname sir:");
                        String surname_client= sc.next();
                        buying_by_id glass1=new buying_by_id();
                        glass1.find_ID(conn,glass_ID);
                        System.out.println("You bought the glass");
                    }
                    break;

                case 3:
                    System.out.println("You need to input password to have access");
                    String pass= sc.next();

                    if(pass=="Aitu2025"){
                        System.out.println("welcome");
                        System.out.println("1.add product");
                        System.out.println("2.del product");
                        int dev= sc.nextInt();
                        switch (dev){
                            case 1:

                        }
                    }


                case 4:
                    q=false;


            }

        }

    }
}



