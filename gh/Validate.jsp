<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.sql.*"%>
<%@ page isErrorPage="false" %>
<%@ page errorPage="errorPage.jsp" %>
<%System.out.println("this is valid jsp");
com.eResorts.ValidBean bean=(com.eResorts.ValidBean)session.getAttribute("validdetails");
System.out.println("valid details are taken");
Integer flag=(Integer)session.getAttribute("flag");
int f=flag.intValue();
System.out.println("flag="+f);
String MemberType=bean.getMembertype();
System.out.println("member type taken");
int app=bean.getApp();
Integer auth=(Integer)session.getAttribute("auth");
int a=auth.intValue();
session.setAttribute("MemeberType", MemberType);
session.setAttribute("App",app);
System.out.println("member type="+MemberType);
System.out.println("app="+app);
System.out.println("flag="+flag);
if(f==1)
{
       if(a==1)
    {
                        if(MemberType.equals("Blocked"))
			{
			//out.println("abcd");
			%>
				<jsp:forward page="BlockUser.jsp"/>
			<%
			}
			if(app==0)
			{
				%>
				  <jsp:forward page="reqprocess.jsp"/>
				<%
			}
			if(app==-1)
			{
			%>
		       <jsp:forward page="reqreject.jsp"/>
				
			<%
			}

			%>
		       <jsp:forward page="GuestMenu1.jsp"/>
			<%
			 
        }
      else if(a==0)
      {
				//Show Admin Menu
				%>
				  <jsp:forward page="AdminMenu1.jsp"/>
				<%
      }
			
}
			
else
{
			 
			 
			 %>
				  <jsp:forward page="Login.jsp">
					<jsp:param name="ErrCode" value="1"/>
				  </jsp:forward>
			 <%
}
			
			

	
%>



