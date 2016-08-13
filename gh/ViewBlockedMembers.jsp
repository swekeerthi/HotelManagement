<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random,com.eResorts.MyFunctions,java.util.*,com.eResorts.ViewMembersBean"%>
<HEAD>


	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>


	<LINK href="styles.css" type="text/css" rel="stylesheet">

</HEAD>
<BODY class='SC'>
<h3 align=center>Members Details</h3>
<table align=center>

			<table align="center" width="45%">
			<% ArrayList<com.eResorts.ViewBlockedMembersBean> a=(ArrayList<com.eResorts.ViewBlockedMembersBean>)session.getAttribute("blockmembers");
int rCount=0;

for(int i=0;i<a.size();i++)
	{
                       com.eResorts.ViewBlockedMembersBean b=(com.eResorts.ViewBlockedMembersBean)a.get(i);
			
		
			String RegID=b.getRegID();
			String UserID=b.getUserID();
			String FirstName=b.getFirstName();
			String LastName=b.getLastName();
			String EmailAddress=b.getEmailAddress();
			String MemberType=b.getMemberType();
			
		
		%>
			<TR class= "row_even">
			<td align="left" colspan=2><B>RegID: </B><%=RegID%></td><td align="left" colspan=2><a href ="./UnBlock?UserID=<%=UserID%>&RegID=<%=RegID%>"><IMG SRC="Images/UnBlock.jpg" WIDTH="130" HEIGHT="26" BORDER="0" ALT=""></a></td></tr>
			
			<TR class= "row_even">
			<td align="left" colspan=2><B>UserID: </B><%=UserID%></td>
			<td align="left" colspan=2><B>MemberType:</B><%=MemberType%></td></tr>
		
			<TR class= "row_even">
			<td align="left" colspan=2><B>FirstName: </B><%=FirstName%></td><td align="left" colspan=2><B>EmailAddress: </B><%=EmailAddress%></td></tr>
						
			<tr class=row_odd>	
			<th align="left" colspan=4><hr color='#F3E1BC'></th></tr>

			

		<%
				rCount++;
			}
			
			if( rCount == 0)	{%><P align=center><h6 align=center>Sorry No records Found</h6><% }
			
		
	
%>
</table>
</BODY>
