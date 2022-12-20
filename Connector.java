import java.sql.Connection;
import java.sql.DriverManager;

public class Connector{
	
public static Connection con;

public static Connection getCon() {
	
	try{  
		 Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_database?autoReconnect=true&useSSL=false","root","sambibo"); 
        //con.close(); 

   
   }catch(Exception e){ 
	  System.out.println("The database is not connected.");
	  e.printStackTrace();
	
	
}
	return con;
}

public static void setCon(Connection con) {
	Connector.con = con;
}
}
