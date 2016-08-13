package com.eResorts;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class BlockBean
{
private String RegID,UserID;
public void setRegID(String RegID)
{
this.RegID=RegID;
}
public String getRegID()
{
return RegID;
}
public void setUserID(String RegID)
{
this.UserID=UserID;
}
public String getUserID()
{
return UserID;
}
public int insert(String RegID,String UserID)
{
Connection con=null;
Statement st=null;
int res=0;int flag=0;
try
{
                        con = com.eResorts.ConnectionPool.getConnection();
			st =  con.createStatement();
			String Query = "Update userprofile set MemberType='Blocked' where UserID='"+UserID+"' and RegID='"+RegID+"'";
			System.out.println(Query);
			res = st.executeUpdate(Query);
		        if(res>0)
			flag=1;
			st.close();
			con.close();
			}//try
catch(Exception e)
{
System.out.println(" exception in BlockBean"+e);
}
return flag;
}
}
