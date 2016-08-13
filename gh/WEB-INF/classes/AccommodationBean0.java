package com.eResorts;
import java.io.*;
import java.sql.*;
public class AccommodationBean0 implements Serializable
{
   
private  String LocationName;

public void setLocationName(String LocationName)
{this.LocationName=LocationName;
}
public String getLocationName()
{return LocationName;
}

 public String[]  getDetails(String Condition)
     {
System.out.println("this is bean");
setLocationName(Condition);

String[] ConValues = new String[200];      
 try
        {
			Connection con=null;
			ResultSet rs=null;
			Statement stmt=null;
			
			int ConCount=0,i=0;
			String Query1="";
                                         con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			if(Condition.trim().equalsIgnoreCase("undefined")){
				System.out.println("in if");
				Query1 = "Select * from accommodation";
			}
			else{
				System.out.println("in else");
				Query1 = "Select "+LocationName+" from accommodation";
			}
			String str="";
			System.out.println(Query1);
System.out.println("before rs");
			rs = stmt.executeQuery(Query1);
System.out.println("after rs");
			System.out.println(rs);
			
				while(rs.next())
                      {
					String x = rs.getString(1);
                          
					ConValues[i]=x;
System.out.println("this is bean");
System.out.println(ConValues[i]);
					i++;
				}
		}
        catch(Exception e)
    
        {}  

return ConValues;

}
}