import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ApprovedMembers extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
com.eResorts.ApproveMembersBean bean=new com.eResorts.ApproveMembersBean ();
ArrayList<com.eResorts.ApproveMembersBean> a=new ArrayList<com.eResorts.ApproveMembersBean>();
a=bean.viewappMem();

req.getSession().setAttribute("appmembers",a);
System.out.println("it is viewloc servlet");
getServletContext().getRequestDispatcher("/ApproveMembers.jsp").forward(req,resp);
}// service()
}// class
