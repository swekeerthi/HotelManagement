package com.eResorts;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class UnBlockBean
{
private String RegID,UserID;private  String MemberType="";
public void setRegID(String RegID)
{
this.RegID=RegID;
}
public String getRegID()
{
return RegID;
}

public void setMemberType(String MemberType)
{
this.MemberType=MemberType;
}
public String getMemberType()
{
return MemberType;
}

public int insert(String RegID,String UserID)
{
Connection con=null;
	ResultSet rs=null,rs1=null;
	Statement stmt=null,stmt1=null;
	int result=0,flag=0;
    
	 float AmountDeposited=0;
	try{
		
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query1 = "Select AmountDeposited from userprofile where UserID='"+UserID+"' and RegID='"+RegID+"' and MemberType='Blocked'";
			System.out.println(Query1);
			rs = stmt.executeQuery(Query1);
			if(rs.next()){
			AmountDeposited=rs.getFloat(1);
			System.out.println(AmountDeposited);
			}
			if(AmountDeposited==5000){
			MemberType="Silver";
			}else if(AmountDeposited==10000){
						MemberType="Gold";

			}else if(AmountDeposited==15000){
			MemberType="Platinum";
			}
			String Query = "Update userprofile set MemberType='"+MemberType+"' where UserID='"+UserID+"' and RegID='"+RegID+"'";
			System.out.println(Query);
			result = stmt.executeUpdate(Query);
			
			
			if( result > 0)	{
			
			
			flag=1;
			}
			
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("ex in unblockbean="+e);
		}
	
return flag;
}
}
