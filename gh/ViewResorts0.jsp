<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*,java.io.*,com.eResorts.MyFunctions"%>
<%  String Condition = "LocationName";%>
<%String UserID=(String)session.getAttribute("UserID");
String list[]=(String [])session.getAttribute("list");%>

<HTML>
<HEAD>
<TITLE>View Resorts</TITLE>
    <LINK href="styles.css" type="text/css" rel="stylesheet">
</HEAD>

<BODY Class='SC'>

<div id="js2" style="position:absolute; overflow:hidden; left:4px; top:40px; width:310px; height:310px; z-index:7">
<div align="center" id="c_js2" style="overflow:hidden;height:100%;width:100%;"> 
<div id="p1_js2"><img border="0" src="images 2//cidade-de-goa-india.jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//Home0.gif" alt="" title="" vspace="5"><br>
<img border="0" src="images 2/HighLand Parade.jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//De-Vivendi-Resort-Manali-Package.jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//beach-resorts-in-munnar1.jpg" alt="" title="" vspace="5"><br>
<img border="0" src="images 2//chancellor-resort-view.jpg" alt="" title="" vspace="5"><br>
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
 

<HR><br>
<FORM  method="Post" action="./ViewResorts1" >
		<TABLE align=center width="30%">
		<TR class="row_title">
			<TD colspan=2 align=center><B><CENTER>Choose Resort Location</CENTER></B></TD>
				<TR class="row_even">
			<TH>Location Name</TH>
			<TD><INPUT TYPE="hidden" NAME="LName" value=""><SELECT NAME="LocationName">
			<OPTION Value="">Select</OPTION>
<% String ConValues[]=new String[10];
	for(int i=0;i<6;i++)
        {
	     String x = list[i];
	     ConValues[i]=x;
	     %><OPTION Value=<%=ConValues[i]%>><%=ConValues[i]%></OPTION><%
					
				}
		
%>
		<TR><TH align=center colspan=2><INPUT TYPE="submit" value='ViewResort'></TH></TR>
	</TABLE>
	</FORM>
	</BODY>

</HTML>
