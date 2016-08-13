import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ViewMembers extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
com.eResorts.ViewMembersBean bean=new com.eResorts.ViewMembersBean ();
ArrayList<com.eResorts.ViewMembersBean> a=new ArrayList<com.eResorts.ViewMembersBean>();
a=bean.viewMem();

req.getSession().setAttribute("members",a);
System.out.println("it is viewloc servlet");
getServletContext().getRequestDispatcher("/ViewMembers.jsp").forward(req,resp);
}// service()
}// class
