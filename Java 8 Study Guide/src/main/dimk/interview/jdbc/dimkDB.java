package main.dimk.interview.jdbc;

import java.sql.*;

/**
 * Created by viioo on 09.01.2016.
 */
public class dimkDB extends Throwable {

    public static void main(String[] args) {
        //
        String st1 = "vodka";
        String st2 = "apple sd !";
        int int1 = 4;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dimk","root", "root");
            Statement stm = conn.createStatement();
            /*stm.executeUpdate("CREATE TABLE REGISTRATION  (id INTEGER, " +
                    "first VARCHAR(255),  " +
                    "last VARCHAR(255),  " +
                    "age INTEGER, " +
                    " PRIMARY KEY ( id ))");*/
            ResultSet rs = stm.executeQuery("SELECT * FROM dimk.registration");

            bd(rs);


            PreparedStatement pstm = conn.prepareStatement("INSERT INTO `dimk`.`REGISTRATION` (`id`, `first`, `last`) VALUES (?,?,?)");
            pstm.setString(3,st1);
            pstm.setString(2,st2);
            pstm.setInt(1,int1);

            pstm.execute();


            ResultSet resultSet = pstm.executeQuery("SELECT * FROM dimk.registration");
            bd(resultSet);

            stm.close();
            conn.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void bd(ResultSet rs) throws Exception{
        ResultSetMetaData meta = rs.getMetaData();
        int lng = meta.getColumnCount();
        while (rs.next()){
            for (int i = 1; i <= lng ; i++) {
                String colname = meta.getColumnLabel(i);
                Object rsp = rs.getObject(i);
                System.out.println(colname+"      "+rsp);
            }

        }

    }
}
