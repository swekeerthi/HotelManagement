package com.eResorts;
import java.io.*;
import java.sql.*;
public class SendInviteBean1 implements Serializable
{
  private  int Sno;

   public void setSno(int Sno)
   {
     this.Sno=Sno;
   }
   public int getSno()
   {
     return Sno;
   }
   public int getDetails(int Sno)
   {
      System.out.println("this is bean");
      setSno(Sno);
	  int flag=0;
	  Connection con;
	  Statement stmt;
      
       try
        {
            con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "Update invites set Status ='Invited' where Sno="+Sno;
			System.out.println(Query);
			int result = stmt.executeUpdate(Query);
			if( result > 0)	
			flag=1;
		}
	     catch(Exception e)
	     {}
return flag;
}
}