package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class InviteBean implements Serializable
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
public int inv(String From,String To,String Status,int Sno)
{
   java.sql.Connection con=null;
java.sql.Statement stmt=null;

int flag=0;

	try{setFrom(From);
	setTo(To);
	setStatus(Status);
	setSno(Sno);
    con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			
			String Query = "Insert into invites values("+Sno+",'"+From+"','"+To+"','"+Status+"')";
			System.out.println("-->"+Query);
			int result = stmt.executeUpdate(Query);
			if( result > 0) 
			{
			flag=1;	
         	
			}}
		catch(Exception e)
		{}
		
	return flag;
}
}