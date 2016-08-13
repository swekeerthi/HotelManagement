<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random,com.eResorts.MyFunctions"%>
<%@ page import="com.eResorts.ViewRoomsBean1,java.util.*"%>
<%
String ResortID = (String)session.getAttribute("ResortID");
System.out.println("this is viewrooms1.jsp");
%>	
<HEAD>


	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>


	<LINK href="styles.css" type="text/css" rel="stylesheet">

</HEAD>
<BODY class='SC'>


<h3 align=center>Room Details</h3>
<table align=center>

			<table align="center" width="45%">
<% ArrayList<com.eResorts.ViewRoomsBean1> a=(ArrayList<com.eResorts.ViewRoomsBean1>)session.getAttribute("rooms");

			int rCount=0;
			for(int i=0;i<a.size();i++)
			{
				 com.eResorts.ViewRoomsBean1 b=(com.eResorts.ViewRoomsBean1)a.get(i);
				String RoomID=b.getRoomID();
			String LocationName=b.getLocationName();
			String RoomType=b.getRoomType();
			System.out.println("RoomType"+RoomType);
			String RoomArea=b.getRoomArea();
			String DryKitchenette=b.getDryKitchenette();
			String SofacumBed=b.getSofacumBed();
			String DoubleBeds=b.getDoubleBeds();
			String Telephone=b.getTelephone();
                        String Television=b.getTelevision();
			String RoomCharges=b.getRoomCharges();
			

		%><TR class= "row_odd">
			<th align="center"><Img src="Images/Photos/<%=RoomType%>.jpg"></th>

			<td align="left" colspan=1><B>Amenities:</B>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td colspan=2><%if(DryKitchenette.equals("Yes"))%><%
{%><B>DryKitchenette<br></B><%}else{%>
			<%}%>
			<%if(SofacumBed.equals("Yes"))%><%
{%><B>SofacumBed<br></B><%}else{%>
			<%}%>
			<%if(DoubleBeds.equals("Yes"))%><%
{%><B>DoubleBeds<br></B><%}else{%>
			<%}%>
			<%if(Telephone.equals("Yes"))%><%
{%><B>Telephone<br></B><%}else{%>
			<%}%>
			
<%if(Television.equals("Yes"))%><%
{%><B>Television<br></B><%}else{%>
			<%}%>
			<TR class= "row_even">
			<td align="left" colspan=2><B>LocationName: </B><%=LocationName%></td>
			<td align="left" colspan=2><B>ResortID: </B><%=ResortID%></td></tr>
			
			<td align="left" colspan=2><B>RoomID: </B><%=RoomID%></td></tr>
			
			<TR class= "row_even">
			<td align="left" colspan=2><B>RoomArea: </B><%=RoomArea%>sqft</td>
			<td align="left" colspan=2><B>RoomCharges: </B>Rs.<%=RoomCharges%></td></tr>
			<td align="left" colspan=2><a href ="BookNow0.jsp?RoomID=<%=RoomID%>&RoomCharges=<%=RoomCharges%>&LocationName=<%=LocationName%>&ResortID=<%=ResortID%>"><IMG SRC="Images/BookNow.jpg" WIDTH="114" HEIGHT="23" BORDER="0" ALT="BookNow"></a></tr>
			
			
			

		<%
				rCount++;
			}
			
			if( rCount == 0)	{%><P align=center><h6 align=center>Sorry No records Found</h6><% }
					
		
	
%>
</table>
</BODY>
