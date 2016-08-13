package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ApproveMembersBean implements Serializable
{
private String UserID,MemberType;

public void setUserID(String UserID)
{
this.UserID=UserID;
}
public String getUserID()
{
return UserID;
}

public void setMemberType(String MemberType)
{
this.MemberType=MemberType;
}
public String getMemberType()
{
return MemberType;
}


  public ArrayList viewappMem()
{
java.sql.Connection con=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null,rs1=null;
ArrayList<ApproveMembersBean> a=new ArrayList<ApproveMembersBean>();
	try{
con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "Select userid,membertype from userprofile where approve = 0";
			rs = stmt.executeQuery(Query);
			int rCount=0;
			while(rs.next())
			{ApproveMembersBean b=new ApproveMembersBean();
				b.UserID=rs.getString(1);
				b.MemberType=rs.getString(2);
				a.add(b);
			}
			
			rs.close();
			stmt.close();
			con.close();
		}
                catch(Exception e)
               {}
	
return a;
}
}			