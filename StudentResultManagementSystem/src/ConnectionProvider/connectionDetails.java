/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

/**
 *
 * @author Rhythin
 */
public class connectionDetails {
    private static final String defaultservername = "localhost";
    private static final String defaultPort ="3306";
    private static final String defaultusername="root";
    private static final String defaultpassowrd="password";
    private static final String defaultdatabase="studentresultsystem";
    private static String servername = "localhost";
    private static String Port ="3306";
    private static String username="root";
    private static String passowrd="password";
    private static String database="studentresultsystem";

    public static String getServername() {
        return servername;
    }

    public static void setServername(String servername) {
        connectionDetails.servername = servername;
    }

    public static String getPort() {
        return Port;
    }

    public static void setPort(String Port) {
        connectionDetails.Port = Port;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        connectionDetails.username = username;
    }

    public static String getPassowrd() {
        return passowrd;
    }

    public static void setPassowrd(String passowrd) {
        connectionDetails.passowrd = passowrd;
    }

    public static String getDatabase() {
        return database;
    }

    public static void setDatabase(String database) {
        connectionDetails.database = database;
    }
    
    public static void setdefault(){
        servername=defaultservername;
        Port=defaultPort;
        username=defaultusername;
        passowrd=defaultpassowrd;
        database=defaultdatabase;
    }
}
