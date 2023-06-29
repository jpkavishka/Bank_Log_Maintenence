package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class sendMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendMoney() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","123");
		    
			boolean isAvailable=false;
			String uname=request.getParameter("tname");
			String email=request.getParameter("mail");
			int amt=Integer.parseInt(request.getParameter("amt"));
			String remn="select * from customersaccount where name=?";			
		    PreparedStatement pst=con.prepareStatement(remn);	
		    pst.setString(1, uname);
			java.sql.ResultSet rs=pst.executeQuery();
			if(rs.next()){
				isAvailable=true;
			}
						 if(isAvailable!=false){
				    String up="update customersaccount set balance=balance-? where name=?";
					String qr="update customersaccount set balance=balance+? where email=?";
					String tm="insert into transactionhistory(user, amount, dt,tt) values(?,?,curdate(),curtime())";
					PreparedStatement pup=con.prepareStatement(up);
					PreparedStatement ps=con.prepareStatement(qr);
					PreparedStatement pt=con.prepareStatement(tm);
					pup.setString(2, "KAVISHKA");
					pup.setInt(1, amt);
					ps.setString(2,email);
					ps.setInt(1,amt);
					pt.setString(1, uname);
					pt.setInt(2, amt);
					
					
					pup.executeUpdate();
					ps.executeUpdate();
					pt.executeUpdate();
					
					
				    	
				  HttpSession httpSession=request.getSession();
					httpSession.setAttribute("message", "Money Transferred Sucessfully!!");
					response.sendRedirect("transaction.jsp");
					return;
				    }	
			 else {
				 
				 HttpSession httpSession=request.getSession();
					httpSession.setAttribute("message", "Customer does not Exist!!");
					response.sendRedirect("transaction.jsp");
					return;
				 
				    
			 }
		
		      //HttpSession httpSession=request.getSession();
				//httpSession.setAttribute("message", "deleted Sucessfully!!!!");
			    
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		


	
	}

}
