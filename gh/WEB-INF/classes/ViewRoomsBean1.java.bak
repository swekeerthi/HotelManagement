package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ViewRoomsBean1 implements Serializable
{
private String LocationName,RoomID,RoomArea,DryKitchenette,SofacumBed,DoubleBeds,Telephone,Television,RoomCharges,RoomType;

public void setRoomType(String RoomType)
{
this.RoomType=RoomType;
}
public String getRoomType()
{
return RoomType;
}
public void setLocationName(String LocationName)
{
this.LocationName=LocationName;
}
public String getLocationName()
{
return LocationName;
}

public void setRfoomID(String RoomID)
{
this.RoomID=RoomID;
}
public String getRoomID()
{
return RoomID;
}

public void setRoomArea(String RoomArea)
{
this.RoomArea=RoomArea;
}
public String getRoomArea()
{
return RoomArea;
}

public void setDryKitchenette(String DryKitchenette)
{
this.DryKitchenette=DryKitchenette;
}
public String getDryKitchenette()
{
return DryKitchenette;
}


public void setSofacumBed(String SofacumBed)
{
this.SofacumBed=SofacumBed;
}
public String getSofacumBed()
{
return SofacumBed;
}

public void setDoubleBeds(String DoubleBeds)
{
this.DoubleBeds=DoubleBeds;
}
public String getDoubleBeds()
{
return DoubleBeds;
}

public void setTelephone(String Telephone)
{
this.Telephone=Telephone;
}
public String getTelephone()
{
return Telephone;
}

public void setTelevision(String Television)
{
this.Television=Television;
}
public String getTelevision()
{
return Television;
}

public void setRoomCharges(String RoomCharges)
{
this.RoomCharges=RoomCharges;
}
public String getRoomCharges()
{
return RoomCharges;
}



public static ArrayList  getRooms(String ResortID)
{
       Connection con=null;
	ResultSet rs=null;
	Statement stmt=null;
	ArrayList<ViewRoomsBean1> a=new ArrayList<ViewRoomsBean1> ();
		
	try{
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "select * from roomsinfo where ResortID='"+ResortID+"'";
			System.out.println(Query);
			rs=stmt.executeQuery(Query);
			
			int rCount=0;
			while(rs.next())
			{ViewRoomsBean1 b=new ViewRoomsBean1();
			 b. RoomID=rs.getString(2);
			  b.LocationName=rs.getString(4);
			 b.RoomType=rs.getString(5);
		        b.RoomArea=rs.getString(6);
			b.DryKitchenette=rs.getString(7);
			b.SofacumBed=rs.getString(8);
			b.DoubleBeds=rs.getString(9);
			b.Telephone=rs.getString(10);
			b.Television=rs.getString(11);
			b.RoomCharges=rs.getString(12);
			a.add(b);
			}

			rs.close();
			stmt.close();
			con.close();
		}
                    catch(Exception e){}
     
	 return a;
	 }

}
		
	
	