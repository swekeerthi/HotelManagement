<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random"%>

<HEAD>


	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>


	<LINK href="styles.css" type="text/css" rel="stylesheet">

</HEAD>
<BODY class="SC">
<h4 align=center>Member Reviews</h4>

<%
com.eResorts.MemberReviewBean0 bean=(com.eResorts.MemberReviewBean0)session.getAttribute("review");
Integer flag=(Integer)session.getAttribute("flag");
int f=flag.intValue();
if(f==0)
{%>
<h3 align=center>Sorry No records Found</h3>
<%}
else
{
%>
<table align="center" width="60%">
							<tr class=row_title>
							<th align="left">FId</th><th align="left">UserID</th><th align="center">Feedback</th><th align="left">Date Of Submittion</th>
							</tr>
							<tr >
						<td><%=bean.getFID()%></td>
						<td><%=bean.getUserID()%></td>
						<td><%=bean.getFeedBack()%></td>
						<td><%=bean.getDateSubmitted()%></td>
					</tr>
					</table>
<%}
%>
					</BODY>

</PRE>