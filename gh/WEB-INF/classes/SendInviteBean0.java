package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class SendInviteBean0 implements Serializable
{
private int Sno;
private String From;
private String To;
private String Status;
public void setSno(int Sno)
{
this.Sno=Sno;
}
public int getSno()
{
return Sno;
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
public void setStatus(String Status)
{
this.Status=Status;
}
public String getStatus()
{
return Status;
}
public ArrayList getInvite()
{
   java.sql.Connection con=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null;
int flag=0;
ArrayList al=new ArrayList();
	try{

			
            con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "select * from invites  where Status ='Invite'";
			System.out.println(Query);
			rs=stmt.executeQuery(Query);
			
			while(rs.next())
			{SendInviteBean0 b=new SendInviteBean0();
		     b.setSno(rs.getInt(1));
			 b.setFrom(rs.getString(2));
			 b.setStatus(rs.getString(4));
			 b.setTo(rs.getString(3));
			al.add(b);
			}
			
		}
		catch(Exception e)
		{}
		
	return al;
}
}