package data.converter;


import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.sql.*;
import java.util.logging.Logger;


public class Converter implements Closeable {

    private static final Logger log = Logger.getLogger(Converter.class.getName());

    private static final String truncateSql = "TRUNCATE TABLE test";
    private static final String insertSql = "INSERT INTO test (`field`) VALUES (?)";
    private static final String selectSql = "SELECT field FROM test";

    public static final int BATCH_SIZE = 1000;

    private Connection conn;

    private int rowsNumber; // N
    private String connectionUrl; // "jdbc:mysql://localhost:3306/test_schema"
    private String userName;
    private String password;
    private String driverName;

    public Converter(int rowsNumber, String connectionUrl, String userName, String password, String driverName) {
        this.rowsNumber = rowsNumber;
        this.connectionUrl = connectionUrl;
        this.userName = userName;
        this.password = password;
        this.driverName = driverName;
    }

    private Connection getBdConnection() throws ClassNotFoundException, SQLException {
        if (conn == null){
            Class.forName(driverName);
            conn = DriverManager.getConnection(connectionUrl, userName, password);
        }
        return conn;
    }


    public void initBD() throws ConverterExeption {
        try {
            Connection conn = getBdConnection();

            // delete all rows
            PreparedStatement pstm = conn.prepareStatement(truncateSql);
            pstm.executeUpdate();
            pstm.close();

            // initializing data
            PreparedStatement insertStatement = conn.prepareStatement(insertSql);

            int count = 0;
            for (int i = 1; i <= rowsNumber ; i++) {
                insertStatement.setInt(1, i);
                insertStatement.addBatch();

                if (++count % BATCH_SIZE == 0){
                    insertStatement.executeBatch();
                }
            }
            insertStatement.executeBatch();
            insertStatement.close();
        }  catch (Exception e) {
            log.severe("Exception: " + e.toString());
            throw new ConverterExeption(e);
        }
    }

    public void readData() throws ConverterExeption {
        try {
            Connection conn = getBdConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSql);

            OutputStream outputStream = new FileOutputStream(new File("1.xml"));

            XMLStreamWriter out = XMLOutputFactory.newInstance().createXMLStreamWriter(
                    new OutputStreamWriter(outputStream, "utf-8"));

            out.writeStartDocument();
            out.writeStartElement("entries");

            int counter = 0;

            while (rs.next()){
                int rowNum = rs.getInt(1);
                out.writeStartElement("entry");
                out.writeStartElement("field");
                out.writeCharacters(String.valueOf(rowNum));
                out.writeEndElement();
                out.writeEndElement();
                if (++counter % BATCH_SIZE == 0){
                    out.flush();
                }
            }

            out.writeEndElement(); // entries
            out.writeEndDocument();

            out.flush();
            out.close();
            stm.close();
        } catch (Exception e) {
            log.severe("Exception: " + e.toString() );
            throw new ConverterExeption(e);
        }
    }



    @Override
    public void close() throws IOException {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new IOException(e);
        } finally {
            conn = null;
        }
    }

    @Override
    protected void finalize(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public int getRowsNumber() {
        return rowsNumber;
    }

    public void setRowsNumber(int rowsNumber) {
        this.rowsNumber = rowsNumber;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverClass) {
        this.driverName = driverClass;
    }


}
