package com.eResorts;
import java.io.*;
public class UserProfileBean implements Serializable
{
private String regid;
private String userid;
private String firstname;
private String lastname;
private String age;
private String emailaddr;
private String addr;
private String contactno;
private String occupation;
private String membertype;
private String amtdeposit;

public void setRegid(String regid)
{
this.regid=regid;
}
public String getRegid()
{
return regid;
}

public void setUserid(String userid)
{
this.userid=userid;
}
public String getUserid()
{
return userid;
}

public void setFirstname(String firstname)
{
this.firstname=firstname;
}
public String getFirstname()
{
return firstname;
}

public void setLastname(String lastname)
{
this.lastname=lastname;
}
public String getLastname()
{
return lastname;
}

public void setAge(String age)
{
this.age=age;
}
public String getAge()
{
return age;
}

public void setEmailaddr(String emailaddr)
{
this.emailaddr=emailaddr;
}
public String getEmailaddr()
{
return emailaddr;
}

public void setAddr(String addr)
{
this.addr=addr;
}
public String getAddr()
{
return addr;
}

public void setContactno(String contactno)
{
this.contactno=contactno;
}
public String getContactno()
{
return contactno;
}

public void setOccupation(String occupation)
{
this.occupation=occupation;
}
public String getOccupation()
{
return occupation;
}

public void setMembertype(String membertype)
{
this.membertype=membertype;
}
public String getMembertype()
{
return membertype;
}

public void setAmtdeposit(String amtdeposit)
{
this.amtdeposit=amtdeposit;
}
public String getAmtdeposit()
{
return amtdeposit;
}


public int profile(String UserID)
{
java.sql.Connection con=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null;
int flag=0;
try{
			con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			String Query = "Select * from userprofile where UserID='"+UserID+"'";
			System.out.println(Query);
			rs = stmt.executeQuery(Query);
			System.out.println(Query);
if(rs!=null)
{
						
                       while(rs.next())
			
                         {	regid=rs.getString(1);
				firstname=rs.getString(3);
				lastname=rs.getString(4);
				age=rs.getString(5);
				emailaddr=rs.getString(6);
				addr=rs.getString(7);
				contactno=rs.getString(8);
				occupation=rs.getString(9);
				membertype=rs.getString(10);
				amtdeposit=rs.getString(11);
                         }//while
 flag=1;
}//if
}//try
			
			catch(Exception e){
			System.out.println("exception raised");
		}//catch
			
return flag;
}
}

