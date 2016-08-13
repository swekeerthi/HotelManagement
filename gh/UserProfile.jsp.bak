<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random"%>
 <% 
com.eResorts.UserProfileBean bean=(com.eResorts.UserProfileBean)session.getAttribute("userdetails");
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
<FORM Name="UserDetails">
<%

if(f==1)
{
			%>
	<!--Displaying the table header-->

	<br>
<!--	<DIV STYLE="overflow:scroll;width:650px; height:400px;">-->

<table align=center border=0  width="60%">
		 <TR class="row_title">
		<Td align=left colspan=2><FONT COLOR="#00549A" size=3>User Profile</FONT>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;<A onclick='fnEmpPopUp("./EditProfile?UserID=<%=UserID%>",600,600)'><IMG SRC="Images/Update.jpg" WIDTH="104" HEIGHT="26" BORDER="0" ALT=""></A>
		</font></td>
		</TR>
		  <tr class=row_even><td align=Left style="background-color:#F4E6C4" width="50%"><b>FirstName</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getFirstname()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>LastName</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getLastname()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4" ><b>Age</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getAge()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>EmailAddress</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getEmailaddr()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>Address</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getAddr()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>ContactNumber</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getContactno()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>Occupation</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getOccupation()%></font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>MemberType</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><P align=left><%=bean.getMembertype()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		 <% if(!bean.getMembertype().equals("Platinum")){%>
		 <A      onclick='fnEmpPopUp("UpgradeMemberType.jsp?UserID=<%=UserID%>&MemberType=<%=bean.getMembertype()%>",600,600)'><IMG SRC="Images/Upgrade.jpg" WIDTH="106" HEIGHT="26" BORDER="0" ALT=""></A>
		 <%}%>
		</font></td></tr>
		 <tr class=row_even><td align=Left style="background-color:#F4E6C4"><b>Balance Amount</b></td>
		 <td align=Left style="background-color:#F8EDD6"><font  color="black"><%=bean.getAmtdeposit()%></font></td></tr>
		 		
		</tr>
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

	
