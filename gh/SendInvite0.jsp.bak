<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,com.eResorts.MyFunctions"%>
<%@ page import="java.util.*"%>
<HEAD>


	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>


	<LINK href="styles.css" type="text/css" rel="stylesheet">

</HEAD>
<BODY class="SC">
<h3 align=center>View Invitations</h3>
<%
ArrayList al=(ArrayList)session.getAttribute("invite");




			%>
			<table align="center" width="45%">
			<TR class="row_title">
			<Td align=center colspan=10><FONT COLOR="#00549A">Send Invitation</FONT></td>
			</TR>		
			
<%int rCount=0;
for(int i=0;i<al.size();i++)
{
com.eResorts.SendInviteBean0 b=(com.eResorts.SendInviteBean0)al.get(i);
			
%>
			
			<TR class= "row_odd">
			<th align="center">Sno</th><td><%=b.getSno()%></td></th>
			<th align=center>From</th><td><%=b.getFrom()%></td></th>
			<th align=center>To</th><td><A HREF="mailto:<%=b.getTo()%>?subject=Invitation to join in eZest"><%=b.getTo()%></A></td>
			<td align="center" colspan=4><I><A href ="./SendInvite1?Sno=<%=b.getSno()%>">&nbsp;&nbsp; <img border="0" name="Send" src="Images/Invite.jpg" onmouseover="document['Send'].src='Images/Invite.jpg'" onmouseout="document['Send'].src='Images/Invite.jpg'"></A></I></td>
			</tr>
			
<%
				
rCount++;
}
			
			if( rCount == 0)	{%><P align=center><FONT SIZE="2" COLOR="#00549A">Sorry No records Found</P>
			<% }
			
		%>
</table>
</BODY>
