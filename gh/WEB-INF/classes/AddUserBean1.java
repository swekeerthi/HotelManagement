package com.eResorts;
import java.io.*;
import java.sql.*;

public class AddUserBean1 implements Serializable
{
  private String UserID,Password,Auth;
  public void setUserID(String UserID)
  {
  this.UserID=UserID;
  }
  public String UserID()
  {
  return UserID;
  }
   public void setPassword(String Password)
  {
  this.Password=Password;
  }
  public String Password()
  {
  return Password;
  }
   public void setAuth(String Auth)
  {
  this.Auth=Auth;
  }
  public String Auth()
  {
  return Auth;
  }
  
  public String[] addUser(String UserID,String Password,String Auth)
{
java.sql.Connection con=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null,rs1=null;
String flag[]=new String[2];
try
{setUserID(UserID);
setPassword(Password);
setAuth(Auth);

  con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
	
			
			String Query = "Insert into login values('"+UserID+"','"+Password+"','"+Auth+"')";
			int result = stmt.executeUpdate(Query);
			if( result > 0)	{flag[0]="1";
				System.out.println("Login created successfully");
			}
			else{flag[1]="1";
				System.out.println("Error in login creation..please try again");
			}
			stmt.close();
			con.close();
		}
  catch(SQLException se)
 {
			if(se.getErrorCode()==1062){flag[0]="1";
				System.out.println("User already exists, Please try another id");
			}else{flag[1]="0";
				System.out.println("Error in login creation..please try again");
			} 
		}
		catch(Exception e)
               {System.out.println("ex2="+e);
			   }
return flag;
}
	
}