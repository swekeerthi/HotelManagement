package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class MyBookingsBean implements Serializable
{
private String BookingID,ResortID,RoomID,LocationName,UserID,MemberType,RoomCharges,From,To,BookingStatus;

public void setLocationName(String LocationName)
{
this.LocationName=LocationName;
}
public String getLocationName()
{
return LocationName;
}
public void setResortID(String ResortID)
{
this.ResortID=ResortID;
}
public String getResortID()
{
return ResortID;
}
public void setMemberType(String MemberType)
{
this.MemberType=MemberType;
}
public String getMemberType()
{
return MemberType;
}
public void setFrom(String From)
{
this.From=From;
}
public String getFrom()
{
return From;
}
public void setTo(String To)
{
this.To=To;
}
public String getTo()
{
return To;
}
public void setBookingStatus(String BookingStatus)
{
this.To=To;
}
public String getBookingStatus()
{
return BookingStatus;
}
public void setBookingID(String BookingID)
{
this.BookingID=BookingID;
}
public String getBookingID()
{
return BookingID;
}
public void setRoomID(String RoomID)
{
this.RoomID=RoomID;
}
public String getRoomID()
{
return RoomID;
}

public void setUserID(String UserID)
{
this.UserID=UserID;
}
public String getUserID()
{
return UserID;
}
public void setRoomCharges(String RoomCharges)
{
this.RoomCharges=RoomCharges;
}
public String getRoomCharges()
{
return RoomCharges;
}



public static ArrayList  getBookings(String UserID)
{
       Connection con=null;
	ResultSet rs=null;
	Statement stmt=null;
		ArrayList<MyBookingsBean> a=new ArrayList<MyBookingsBean>();
	try{
			
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "select * from bookingsinfo where UserID='"+UserID+"' and BookingStatus='Booked' order by bookingid";
			System.out.println(Query);
			rs=stmt.executeQuery(Query);
			while(rs.next())
			{MyBookingsBean b=new MyBookingsBean();
			b.BookingID=rs.getString(1);
			b.ResortID=rs.getString(2);
			b.RoomID=rs.getString(3);
			b.LocationName=rs.getString(4);
			b.UserID=rs.getString(5);
			b. MemberType=rs.getString(6);
			b.RoomCharges=rs.getString(7);
			b.From=rs.getString(8);
			b.To=rs.getString(9);
			b.BookingStatus=rs.getString(10);
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
	