package com.eResorts;
import java.io.*;
public class ValidBean implements Serializable
{
private int app;
private String membertype;


public void setMembertype(String membertype)
{
this.membertype=membertype;
}
public void setApp(int app)
{
this.app=app;
}
public String getMembertype()
{
return membertype;
}
public int getApp()
{
return app;
}

public int valid(String UserID,String Password,String Auth)
{
java.sql.Connection con=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null,rs1=null;
int flag=0;
try
{

con= com.eResorts.ConnectionPool.getConnection();

stmt=con.createStatement();

String Query = "select * from login where UserID = '"+UserID+"' and Password='"+Password+"' and Auth='"+Auth+"'";
			rs = stmt.executeQuery(Query);
			if(rs.next())	

			{
                                         flag=1;
                                         if(Auth.equals("1"))
                                         {
			String Query1="Select MemberType,approve from userprofile where UserID = '"+UserID+"'";
			System.out.println(Query1);
			rs1=stmt.executeQuery(Query1);
			if(rs1.next())
			{
			 membertype=rs1.getString(1);
			 app=rs1.getInt(2);
			 System.out.println(membertype);
			}
                                         }
                                        
                                        }
                                        
}//try
catch(Exception e)
{
System.out.println("ex="+e);
}//catch
System.out.println("this is bean");
return flag;}//valid
}//validbean
