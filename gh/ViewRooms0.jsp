<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,com.eResorts.MyFunctions"%>
<%	String UserID=(String)session.getAttribute("UserID");
String list[]=(String [])session.getAttribute("list");
com.eResorts.ViewRoomsBean0 bean=(com.eResorts.ViewRoomsBean0)session.getAttribute("rooms");
String list2[]=new String[200];
list2=bean.getResortId();

System.out.println("s length="+list.length);		
//System.out.println("s2 length="+list2.length);
%>

<HTML>
<HEAD>
<TITLE>View Rooms</TITLE>
    <LINK href="styles.css" type="text/css" rel="stylesheet">
<SCRIPT LANGUAGE="JavaScript">
	<!--
		function validate(){
			var frm = document.forms(0);
			var ResortID = frm.ResortID.value;
			if(ResortID!=""){
				return true;
			}else{
				alert("Please select Location Name to proceed");
				return false;
			}
		}
	//-->
	</SCRIPT>
</HEAD>

<BODY Class='SC'>
<body>

<div id="js2" style="position:absolute; overflow:hidden; left:4px; top:40px; width:310px; height:310px; z-index:7">
<div align="center" id="c_js2" style="overflow:hidden;height:100%;width:100%;"> 
<div id="p1_js2"><img border="0" src="images 2//DoubleBedRoomApartment.jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//SingleBedRoomApartment (2).jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2/SingleBedRoomApartment.jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//StudioApartment (2).jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//StudioApartment.jpg" alt="" title="" vspace="5"><br>

</div> 
<div id="p2_js2"></div> 
</div> 
 
<script language="javascript" type="text/javascript"> 
var speed=30
var i=0
var n=Math.floor(js2.offsetHeight/p1_js2.offsetHeight)
for (i=0;i<=n;i++)
{
p2_js2.innerHTML+=p1_js2.innerHTML
}
function m_js2()
{
if(c_js2.scrollTop>=p2_js2.offsetTop)
 c_js2.scrollTop-=p1_js2.offsetHeight
else
 c_js2.scrollTop++
} 
var mm_js2=setInterval(m_js2,speed) 
c_js2.onmouseover=function(){clearInterval(mm_js2)} 
c_js2.onmouseout=function(){mm_js2=setInterval(m_js2,speed)} 
</script></div>

<FORM Name='Rooms' Id="Rooms" method="Post" onsubmit="return validate();" action="./ViewRooms1" >
		<TABLE align=center width="30%">
		<TR class="row_title">
			<TD colspan=2 align=center><B><CENTER>Choose Location</CENTER></B></TD>
				<TR class="row_even">
			<TH>Location Name</TH>
			<TD><INPUT TYPE="hidden" NAME="LName" value=""><SELECT NAME="ResortID">
			<OPTION Value="">Select</OPTION>
<%String ConValues[]=new String[10];
String IDValues[]=new String[10];
			for(int i=0;i<7;i++){
					
			String x = list[i];
					
					ConValues[i]=x;
					IDValues[i]=list2[i];

					%><OPTION Value=<%=IDValues[i]%>><%=ConValues[i]%></OPTION><%
					

					
				}
%>
		<TR><TH align=center colspan=2><INPUT TYPE="submit" value='ViewRooms'></TH></TR>
	</TABLE>
	</FORM>
	</BODY>

</HTML>

