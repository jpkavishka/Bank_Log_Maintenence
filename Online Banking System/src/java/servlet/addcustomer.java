package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hp
 */
public class addcustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String account_number = request.getParameter("accno");
        String email = request.getParameter("email");
        String balance=request.getParameter("balance");
        HttpSession session=request.getSession(); 
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","123");
            PreparedStatement preparedStmt= con.prepareStatement( "insert into customersaccount values ( ?, ?, ?, ?)");
            preparedStmt.setString(1,name);
            preparedStmt.setString(2, account_number);
            preparedStmt.setString (3, email);
            preparedStmt.setString (4, balance);
            preparedStmt.execute();
            response.sendRedirect("transaction.jsp");
        }catch(Exception e){e.printStackTrace();}
       
    }
}
