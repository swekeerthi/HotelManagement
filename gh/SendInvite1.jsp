<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random"%>
<% 
	Integer f=(Integer)session.getAttribute("flag");
	int flag=f.intValue();

%>

<HEAD>
	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>
	<LINK href="styles.css" type="text/css" rel="stylesheet">
</HEAD>
<BODY class="SC">

<h3 align=center>Send Invite</h2>
<%
if( flag > 0)	{
				%><P align=center><FONT SIZE="2" COLOR="#00549A"> Invited sucessfully</P>
				<%
			}
			else{
				%><P align=center><FONT SIZE="2" COLOR="#00549A">Error in updating..please try again</P>
				<A HREF="SendInvite0.jsp">Back</A></P>

				<%
			}
			%>
</BODY>
