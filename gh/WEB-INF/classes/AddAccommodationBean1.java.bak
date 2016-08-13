package com.eResorts;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class AddAccommodationBean1
{
private String LocationID,LocationName,LocationImage,LocationDesc;
public void setLocationID(String LocationID)
{
this.LocationID=LocationID;
}
public String getLocationID()
{
return LocationID;
}
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


public int add(String LocationID,String LocationName,String LocationImage,String LocationDesc)
{

	Connection con=null;
	ResultSet rs=null;
	Statement stmt=null;
	int flag=0;
	

	
	try{
			
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			System.out.println("lid="+LocationID);
		
			String Query = "Insert into accommodation values('"+LocationID+"','"+LocationName+"','"+LocationImage+"','"+LocationDesc+"')";
			int result = stmt.executeUpdate(Query);
			if( result > 0)	{
				flag=1;
			}
			
		
			stmt.close();
			con.close();
		}catch(Exception e){
			System.out.println("ex in AddAcc1="+e);

		}
	
return flag;
}
}
