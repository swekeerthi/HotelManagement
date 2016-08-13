import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ViewBlockedMembers extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
com.eResorts.ViewBlockedMembersBean bean=new com.eResorts.ViewBlockedMembersBean ();
ArrayList<com.eResorts.ViewBlockedMembersBean> a=new ArrayList<com.eResorts.ViewBlockedMembersBean>();
a=bean.viewBlockedMem();

req.getSession().setAttribute("blockmembers",a);
System.out.println("it is viewloc servlet");
getServletContext().getRequestDispatcher("/ViewBlockedMembers.jsp").forward(req,resp);
}// service()
}// class
