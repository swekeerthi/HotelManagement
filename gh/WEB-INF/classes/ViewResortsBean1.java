package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ViewResortsBean1 implements Serializable
{
private String LocationName,ResortImage,NoOfRooms,NoOfRoomsAvailable,Restaurant,Swimmingpool,GamesRoom,Casino,YogaandMeditation,SteamBath,GymandHealthCenter;

public void setLocationName(String LocationName)
{
this.LocationName=LocationName;
}
public String getLocationName()
{
return LocationName;
}

public void setResortImage(String ResortImage)
{
this.ResortImage=ResortImage;
}
public String getResortImage()
{
return ResortImage;
}

public void setNoOfRooms(String NoOfRooms)
{
this.NoOfRooms=NoOfRooms;
}
public String getNoOfRooms()
{
return NoOfRooms;
}

public void setNoOfRoomsAvailable(String NoOfRoomsAvailable)
{
this.NoOfRoomsAvailable=NoOfRoomsAvailable;
}
public String getNoOfRoomsAvailable()
{
return NoOfRoomsAvailable;
}


public void setRestaurant(String Restaurant)
{
this.Restaurant=Restaurant;
}
public String getRestaurant()
{
return Restaurant;
}

public void setSwimmingpool(String Swimmingpool)
{
this.Swimmingpool=Swimmingpool;
}
public String getSwimmingpool()
{
return Swimmingpool;
}

public void setGamesRoom(String GamesRoom)
{
this.GamesRoom=GamesRoom;
}
public String getGamesRoom()
{
return GamesRoom;
}

public void setCasino(String Casino)
{
this.Casino=Casino;
}
public String getCasino()
{
return Casino;
}

public void setYogaandMeditation(String YogaandMeditation)
{
this.YogaandMeditation=YogaandMeditation;
}
public String getYogaandMeditation()
{
return YogaandMeditation;
}

public void setSteamBath(String SteamBath)
{
this.SteamBath=SteamBath;
}
public String getSteamBath()
{
return SteamBath;
}

public void setGymandHealthCenter(String GymandHealthCenter)
{
this.GymandHealthCenter=GymandHealthCenter;
}
public String getGymandHealthCenter()
{
return GymandHealthCenter;
}


public static ArrayList  getResort(String loc)
{
       Connection con=null;
	ResultSet rs=null;
	Statement stmt=null;
		ArrayList<ViewResortsBean1> a=new ArrayList<ViewResortsBean1>();
	try{
			
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "select * from resortsinfo where LocationName='"+loc+"'";
			System.out.println(Query);
			rs=stmt.executeQuery(Query);
			
			int rCount=0;
			while(rs.next())
			{ViewResortsBean1 b=new ViewResortsBean1();
			b.LocationName=rs.getString(2);
		       b.ResortImage=rs.getString(3);
			b.NoOfRooms=rs.getString(4);
			b.NoOfRoomsAvailable=rs.getString(5);
			b.Restaurant=rs.getString(6);
			b.Swimmingpool=rs.getString(7);
			b.GamesRoom=rs.getString(8);
			b.Casino=rs.getString(9);
			b.YogaandMeditation=rs.getString(10);
			b.SteamBath=rs.getString(11);
			b.GymandHealthCenter=rs.getString(12);
		a.add(b);
			}
			rs.close();
			stmt.close();
			con.close();
		}//try
                       catch(Exception e){}
					   return a;
   }//fx
}
	