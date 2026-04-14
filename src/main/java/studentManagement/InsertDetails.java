package studentManagement;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/details")
public class InsertDetails extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String name = req.getParameter("un");
		System.out.println(name);
//		resp.getWriter().print("Data recieved: "+" "+name+"\n");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("the student details has been successfully stored temproraliy");
		out.println();
		out.println("<h1 style='text-align:center;color:red;'> Welcome "+name+" to this website </h1>");
		
		return;
	}

}
