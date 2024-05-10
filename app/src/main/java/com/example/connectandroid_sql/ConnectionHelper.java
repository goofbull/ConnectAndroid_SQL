package com.example.connectandroid_sql;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import kotlin.jvm.JvmStatic;
import java.sql.SQLException;

public class ConnectionHelper {

//    Connection con;
//    String uname, pass, ip, port, database;
//
//    public Connection connectionclass()
//    {
//        ip = "172.1.1.0";
//        database = "Products";
//        uname = "SOFYA";
//        pass = "root";
//        port = "1433";
//
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//        Connection connection = null;
//        String ConnectionURL = null;
//
//        try {
//
//            Class.forName("net.sourceforge.jtds.jdbc.Driver");
//            ConnectionURL= "jdbc:jtds:sqlserver://"+ ip + ":"+ port+";"+ "databasename="+ database+";user="+uname+";password="+pass+";";
//            connection = DriverManager.getConnection(ConnectionURL);
//        }
//
//        catch (Exception ex){
//            Log.e("Error", ex.getMessage());
//        }
//        return connection;
//    }
}
