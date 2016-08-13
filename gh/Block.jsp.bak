<%@ page language="java" %>
<%@ page session="true" %>

<%
Integer flag=(Integer)session.getAttribute("flag");
int f=flag.intValue();
%>
<HEAD>


	<script LANGUAGE="Javascript" SRC="validate.js"></script>


	<LINK href="styles.css" type="text/css" rel="stylesheet">
		

</HEAD>
<BODY class="SC">
<h3 align=center>Block User </h3>
<%
if( f > 0)	{
			
			
			%><P align=center><h3 align=center>User Blocked sucessfully</h3></P>
				<P align=center><A HREF="./ViewMembers">Back</A></P>

				<%
			}
			else{
				%><P align=center><h3 align=center>Error in updating..please try again</h3></P>
 				 <P align=center><A HREF="./ViewMembers">Back</A></P>
				<% 
			}
			%>
			</body>
			</html>
