package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/We")
public class We extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public We() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
			String name = request.getParameter("name");
			String Email = request.getParameter("Email");
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:/sudhir","root","8658");
			Statement st = con.createStatement();
			System.out.println("hhhhh");
			 ResultSet ex = st.executeQuery("insert into emp values where name='"+name+"'and Email='"+Email+"'");
			 if(ex.next()) {
				 
				 
			 }
			 else {
				 
				 
			 }
			
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
