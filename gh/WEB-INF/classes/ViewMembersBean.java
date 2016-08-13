package com.eResorts;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ViewMembersBean implements Serializable
{
private String RegID,UserID,FirstName,LastName,EmailAddress,MemberType;

public void setRegID(String RegID)
{
this.RegID=RegID;
}
public String getRegID()
{
return RegID;
}

public void setUserID(String UserID)
{
this.UserID=UserID;
}
public String getUserID()
{
return UserID;
}

public void setFirstName(String FirstName)
{
this.FirstName=FirstName;
}
public String getFirstName()
{
return FirstName;
}

public void setLastName(String LastName)
{
this.LastName=LastName;
}
public String getLastName()
{
return LastName;
}

public void setEmailAddress(String EmailAddress)
{
this.EmailAddress=EmailAddress;
}
public String getEmailAddress()
{
return EmailAddress;
}

public void setMemberType(String MemberType)
{
this.MemberType=MemberType;
}
public String getMemberType()
{
return MemberType;
}


  public  static ArrayList viewMem()
{
java.sql.Connection con=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null,rs1=null;
	try{
			
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "select * from userprofile where MemberType!='Blocked' and approve=1"; 
			System.out.println(Query);
			rs=stmt.executeQuery(Query);
			ArrayList<ViewMembersBean> a=new ArrayList<ViewMembersBean>();
			
			
			
			while(rs.next())
			{ViewMembersBean b=new ViewMembersBean();
			 b.RegID=rs.getString(1);
			 b.UserID=rs.getString(2);
			 b.FirstName=rs.getString(3);
			 b.LastName=rs.getString(4);
			 b.EmailAddress=rs.getString(6);
			 b.MemberType=rs.getString(10);
			
		
				a.add(b);		
			}
			
			
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e){
			}
		
	return a;
}
}