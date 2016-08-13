import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ViewRooms0 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
  
String list[]=new String[7];  
String list2[]=new String[7];

       String Condition="LocationName";
      com.eResorts.ViewRoomsBean0 bean=new com.eResorts.ViewRoomsBean0 ();

      list= bean.getDetails(Condition);
	  list2=bean.getResortId();
System.out.println("Acc ser succ");

req.getSession().setAttribute("list",list);
req.getSession().setAttribute("rooms",bean);
System.out.println("it is acc0 servlet");
for(int i=0;i<=6;i++)
{
System.out.println(list[i]);
System.out.println(list2[i]);
}
getServletContext().getRequestDispatcher("/ViewRooms0.jsp").forward(req,resp);
  }
}