package main.dom;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.sql.*;

public class ParseDB {

    private String connUrl = "jdbc:mysql://localhost:3306/market";
    private String userName = "root";
    private String password = "root";
    private String selectSql = "SELECT * FROM market.goods";

    private Connection conn;

    private Connection getConn() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connUrl, userName, password);
        }
        return conn;
    }

    public void readDb() throws SQLException, ClassNotFoundException, FileNotFoundException, UnsupportedEncodingException, XMLStreamException {
        Connection conn = getConn();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(selectSql);

        OutputStream outputStream = new FileOutputStream(new File("goods.xml"));

        XMLStreamWriter out = XMLOutputFactory.newInstance()
                .createXMLStreamWriter(new OutputStreamWriter(outputStream, "utf-8"));

        out.writeStartDocument();
        out.writeStartElement("market");
        out.writeStartElement("Goods");

        ResultSetMetaData meta = rs.getMetaData();
        meta.getColumnName(2);

        while (rs.next()){
            out.writeStartElement("SerialNumber");
            out.writeAttribute("id", String.valueOf(rs.getInt(1)));
            out.writeStartElement(meta.getColumnName(2));
            out.writeCharacters(String.valueOf(rs.getString(2)));
            out.writeEndElement();
            out.writeStartElement(meta.getColumnName(3));
            out.writeCharacters(String.valueOf(rs.getString(3)));
            out.writeEndElement();
            out.writeStartElement("amount");
            out.writeCharacters(String.valueOf(rs.getString(4)));
            out.writeEndElement();
            out.writeStartElement("provider");
            out.writeCharacters(String.valueOf(rs.getString(5)));
            out.writeEndElement();
            out.writeEndElement();

        }
        out.writeEndElement();
        out.writeEndElement();
        out.writeEndDocument();

        out.close();
        stm.close();
    }
}
