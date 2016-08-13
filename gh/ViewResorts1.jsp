<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,java.util.Random,com.eResorts.MyFunctions"%>
<%@ page import="com.eResorts.ViewResortsBean1,java.util.*"%>
<% String LocationName=(String)session.getAttribute("LocationName");%>
	<script LANGUAGE="Javascript" SRC="Images/validate.js"></script>


	<LINK href="styles.css" type="text/css" rel="stylesheet">

</HEAD>
<BODY class='SC'>
<h3 align=center>Resort Details at <%=LocationName%></h3>
<table align=center>
<table align="center" width="45%">
<% ArrayList<com.eResorts.ViewResortsBean1> a=(ArrayList<com.eResorts.ViewResortsBean1>)session.getAttribute("resorts");
int rCount=0;

for(int i=0;i<a.size();i++)
	{
                       com.eResorts.ViewResortsBean1 b=(com.eResorts.ViewResortsBean1)a.get(i);
                       LocationName=b.getLocationName();
			String ResortImage=b.getResortImage();
			String NoOfRooms=b.getNoOfRooms();
			String NoOfRoomsAvailable=b.getNoOfRoomsAvailable();
			String Restaurant=b.getRestaurant();
			String Swimmingpool=b. getSwimmingpool();
			String GamesRoom=b.getGamesRoom();
			String Casino=b. getCasino();
			String YogaandMeditation=b.getYogaandMeditation();
			String SteamBath=b.getSteamBath();
			String GymandHealthCenter=b.getGymandHealthCenter();
			
	
	%>
	
			<th align="center"><Img src="Images/Photos/<%=ResortImage%>"></th>
			</Table><table align=center width=45%>
			<TR class= "row_even">
			<td align="left" colspan=3><B>Total Rooms:</B>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=NoOfRooms%></td></tr>
			<TR class= "row_even">
			<td align="left" colspan=3><B>Rooms <I></I>Avialable:</B>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=NoOfRoomsAvailable%></td></tr>
			<TR class= "row_odd">
			<td align="left" colspan=1><B>Other Facilities:</B>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td colspan=2><%if(Restaurant.equals("Yes"))%><%
{%><B>Restaurant<br></B><%}else{%>
			<%}%>
			<%if(Swimmingpool.equals("Yes"))%><%
{%><B>Swimmingpool<br></B><%}else{%>
			<%}%>
			<%if(GamesRoom.equals("Yes"))%><%
{%><B>Games Room<br></B><%}else{%>
			<%}%>
			<%if(Casino.equals("Yes"))%><%
{%><B>Casino<br></B><%}else{%>
			<%}%>
			<%if(YogaandMeditation.equals("Yes"))%><%
{%><B>Yoga & Meditation<br></B><%}else{%>
			<%}%>
<%if(SteamBath.equals("Yes"))%><%
{%><B>SteamBath<br></B><%}else{%>
			<%}%>
			<%if(GymandHealthCenter.equals("Yes"))%><%
{%><B>Gym & HealthCenter<br></B><%}else{%>
			<%}%>

		<%
				rCount++;
			}
			
			if( rCount == 0)	{%><P align=center><h6 align=center>Sorry No records Found</h6><% }
		
	
%>
</table>
</BODY>


