package com.eResorts;
import java.io.*;
import java.sql.*;
public class ViewLocationsBean implements Serializable
{
private String LocationName,LocationImage,LocationDesc;
public void setLocationName(String LocationName)
{
this.LocationName=LocationName;
}
public String getLocationName()
{
return LocationName;
}
public void setLocationImage(String LocationImage)
{
this.LocationImage=LocationImage;
}
public String getLocationImage()
{
return LocationImage;
}
public void setLocationDesc(String LocationDesc)
{
this.LocationDesc=LocationDesc;
}
public String getLocationDesc()
{
return LocationDesc;
}


 public void  getLoc(String loc)
     {
Connection con=null;
			ResultSet rs=null;
			Statement stmt=null;
			
 try
        {
			
			 con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "select * from accommodation where LocationName='"+loc+"'";
			System.out.println(Query);
			rs=stmt.executeQuery(Query);
			while(rs.next())
			{
			LocationName=rs.getString(2);
			 LocationImage=rs.getString(3);
		       LocationDesc=rs.getString(4);
			}
rs.close();
			stmt.close();
			con.close();
}
			catch(Exception e){
			
			System.out.println("ex="+e);

		}
}
}
