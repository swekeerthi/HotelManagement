<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random"%>
<% 
	String UserID=(String)session.getAttribute("UserID");

%>

<HEAD>
	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>
	<LINK href="styles.css" type="text/css" rel="stylesheet">
</HEAD>
<BODY class="SC">

<h3 align=center>Details of <%=UserID%></h2>
<%Integer flag=(Integer)session.getAttribute("flag");
      int f=flag.intValue();
			if( f > 0)	{
				%><P align=center><h3 align=center>Updated sucessfully</h3>
				<center><input type=button value=close onclick="window.close();"></center>


				<%
			}
			else{
				%><P align=center><h3 align=center>Error in updating..please try again</h3>
				<A HREF="EditBasicDetails.jsp">Back</A></P>

				<%
			}%>
	
</BODY>
