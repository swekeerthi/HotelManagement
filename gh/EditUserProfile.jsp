<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random"%>
 <% 
com.eResorts.EditProfileBean bean=(com.eResorts.EditProfileBean)session.getAttribute("userdetails");
String UserID=(String)session.getAttribute("UserID");
Integer flag=(Integer)session.getAttribute("flag");
int f=flag.intValue();
UserID = (session.getAttribute("UserID")==null) ? "Null" : (String)session.getAttribute("UserID"); 

if(UserID.equals("Null"))
{
	session.invalidate();
	%>
	<!--<H5 align=center><IMG SRC="Images/error.gif" WIDTH="17" HEIGHT="13" BORDER=0 ALT="">Session time out...Please login again</H5>-->
	<script language=javascript>
		location.replace('sessiontimeout.html');
	</script>
	<% 
}//if
else{
%>
<HEAD>
	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>

	
	<LINK href="styles.css" type="text/css" rel="stylesheet">

</HEAD>
<BODY class="SC">

<h3 align=center>Details of <%=UserID%></h2>
<FORM Name="editUserDetails" action="./EditProfile1">
<%

if(f==1)
{
			%>
	<!--Displaying the table header-->

	<br>
<!--	<DIV STYLE="overflow:scroll;width:650px; height:400px;">-->

<table align=center border=0  width="60%">
		 <TR class="row_title">
		<Td align=left colspan=2><FONT COLOR="#00549A" size=3>User Profile</FONT></td>
		</TR>
		  <tr class=row_even><td align=Left style="background-color:#F4E6C4" width="50%"><b>First Name</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="FirstName" value="<%=bean.getFirstname()%>"></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>Last Name</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="LastName" value="<%=bean.getLastname()%>"></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>Age</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="Age" value="<%=bean.getAge()%>"></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>EmailAddress</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="EmailAddress" value="<%=bean.getEmailaddr()%>"></font></td></tr>
		<tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>Address</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><textarea name="Address" Rows=5 cols =20><%=bean.getAddr()%></textarea></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>ContactNumber</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="ContactNumber" value="<%=bean.getContactno()%>"></font></td></tr>
		<tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>Occupation</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="Occupation" value="<%=bean.getOccupation()%>"></font></td></tr>
		
			 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>MemberType</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><Input type=text name="MemberType" value="<%=bean.getMembertype()%>" readonly></font></td></tr>
		
		<TR>
		<TH><INPUT TYPE="submit" value='Update' ></TH>
		<TH><INPUT TYPE="reset" value='Clear' ></TH></TR>
		</table>	

	

	
	<%
	}//if
	else
	{
	/*To write to the server if the resultset is null*/
	%>
		<CENTER>
			<tr><th colspan=6>No Records found</th></tr>
		</CENTER>
	<%}%>//else
	


</table>

</FORM>
</BODY>
</HTML>
<%
}//else
%>

	
