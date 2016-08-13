package com.eResorts;
import java.io.*;
import java.sql.*;
public class ViewRoomsBean0 implements Serializable
{
  private  String LocationName,ResortId[];

   public void setLocationName(String LocationName)
   {
     this.LocationName=LocationName;
   }
   public String getLocationName()
   {
     return LocationName;
   }
    public void setResortId(String ResortId[])
   {
     this.ResortId=ResortId;
   }
   public String[] getResortId()
   {
     return ResortId;
   }

   public String[]  getDetails(String Condition)
   {
      System.out.println("this is bean");
      setLocationName(Condition);
      String[] ConValues = new String[2000];
	  String[] IDValues = new String[2000];

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
				Query1 = "Select * from resortsinfo";
			}
			else{
				System.out.println("in else");
				Query1 = "Select "+Condition+",ResortID from resortsinfo";
			}
			String str="";
			System.out.println(Query1);
			rs = stmt.executeQuery(Query1);
			System.out.println(rs);
			int rCount=0;
				while(rs.next())
                                  {
					String x = rs.getString(1);
					String ResortID=rs.getString(2);
					System.out.println(ResortID);
					ConValues[i]=x;
					IDValues[i]=ResortID;

					i++;
				}
		setResortId(IDValues);
		}
                   catch(Exception e){}
         return ConValues;
		  }
  }