package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.Time;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import servlet.sendMoney;

public final class transaction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/common.jsp");
    _jspx_dependants.add("/message.jsp");
    _jspx_dependants.add("/modals.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");

Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spark", "root", "123");

String remn = "select * from account";
Statement st = (Statement) con.createStatement();
ResultSet rs = (ResultSet) st.executeQuery(remn);

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Spark Foundation</title>\n");
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"main.css\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("\tintegrity=\"sha512-SfTiTlX6kk+qitfevl/7LibUOeJWlt9rbyDn92a1DqWOw9vWG2MFoays0sgObmWazO5BQPiFucnnEAjpAB+/Sw==\"\n");
      out.write("\tcrossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"functions.js\"></script>");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("         <div class=\"top\">\n");
      out.write("            <img src=\"images/logo.jpg\" alt=\"BANK LOGO\">\n");
      out.write("             <p>JKB BANK</p>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Back To Home</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<section class=\"serviceoffer\" id=\"servicediv\" style=\"margin-top: 50px;\">\n");
      out.write("\t\t<div class=\"container-fluid heading text-center\" style=\"background: linear-gradient(#16c9f6,#fff);\">\n");
      out.write("\t\t<br>\n");
      out.write("\t\t\t<h1 class=\"text-center font-weight-bold\"><span style=\"color: #fff;\">Account Holder</span></h1>\n");
      out.write("\t\t\t<h3 class=\"text-center font-weight-bold\" style=\"color: maroon;\">\n");
      out.write("\t\t\t\t");

				if (rs.next()) {
//					int id = rs.getInt("id");
					String ac = rs.getString("account_number");
					String name = rs.getString("name");
					String mail = rs.getString("email");
					int blnc = rs.getInt("balance");
					System.out.println(name);
					System.out.println(ac);
					System.out.println(mail);
				
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(name);
      out.write("</h3>\n");
      out.write("\t\t\t<h4 class=\"text-center\">\n");
      out.write("\t\t\t\tTotal Bank Balance : $\n");
      out.write("\t\t\t\t");
      out.print(blnc);
      out.write("</h4>\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("                            \n");
      out.write("\t\t\t\t<a class=\"tbtn btn mb-2\"  data-toggle=\"modal\" data-target=\"#trans\">Transaction History</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<br>\n");
      out.write("\t");

String message =(String) session.getAttribute("message");
if(message!=null){	

      out.write("\n");
      out.write("<div class=\"alert alert-success alert-dismissible fade show text-center container\" role=\"alert\">\n");
      out.write("  <strong>");
      out.print( message );
      out.write("</strong>  \n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("\t\n");
	
	session.removeAttribute("message");

}


      out.write('\n');
      out.write("\n");
      out.write("\t<hr>\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\t<div\n");
      out.write("\t\tclass=\"container table-responsive-sm table-responsive-md table-responsive-lg table-responsive-xl\">\n");
      out.write("\t\t<table class=\"table table-striped\">\n");
      out.write("\t\t\t<thead style=\"background: #16c9f6; color: white; font-size: 20px;\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Account Number</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Name</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Email</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Balance</th>\n");
      out.write("                                        <th scope=\"col\">Action</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				ResultSet r = (ResultSet) st.executeQuery(remn);
				if (r.next()) {
					do {
//						int id = r.getInt("id");
						String ac = r.getString("account_number");
						String name = r.getString("name");
						String mail = r.getString("email");
						int blnc = r.getInt("balance");
				
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(ac);
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(name);
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(mail);
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>$ ");
      out.print(blnc);
      out.write("</td>\n");
      out.write("                                        <td><a  class=\"tbtn btn mb-2\" data-toggle=\"modal\" data-target=\"#money\">Transfer Money</a> </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");

				} while (r.next());
				} else {
				out.println("No records found");
				}
				con.close();
				
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\t<footer class=\"footers\" id=\"footerr\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6 col-12 f-div\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t<h4>About Spark Banking System</h4>\n");
      out.write("\t\t\t\t\t\t<p>In Sparks Banking System customers feels the sense of safety for their bank balance. And easily transfer the money to each other.\n");
      out.write("\t\t\t\t\tHere transaction history saved i.e. each transaction have its own id for easy identification.</p>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6 col-12 f-div\">\n");
      out.write("\t\t\t\t\t<div class=\"container text-center\">\n");
      out.write("\t\t\t\t\t\t<h4>Navigation Links</h4>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Subscribe Us</a></li>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-12 col-12 f-div mt-3\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-center\">Contact Details</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-lg-8 col-md-8 col-10 offset-lg-2 offset-md-2 offset-1 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"https://www.youtube.com/channel/UC6rqE8pTrNvyQg3Hq-REJvQ\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"image/youtube.png\" style=\"max-width: 55px;\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded-circle\" alt=\"product_icon\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-lg-8 col-md-8 col-10 offset-lg-2 offset-md-2 offset-1 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"https://www.linkedin.com/in/anjali-mishra-8a8a4419a/\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"image/linkedin (2).png\" style=\"max-width: 55px;\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded-circle\" alt=\"product_icon\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"container text-center\">\n");
      out.write("\t\t\t<div class=\"mt-5 text-center\">\n");
      out.write("\t\t\t\t<p>Copyright @2021 All right reserved | This website design by\n");
      out.write("\t\t\t\t\tAni</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  ");

Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","123");

String rem="select * from transfer";
Statement stt=(Statement) conn.createStatement();

      out.write("  \n");
      out.write(" \n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"trans\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\" style=\"background: #16c9f6; color: white; font-size: 20px;\">\n");
      out.write("        <h5 class=\"modal-title\">Transaction History</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"table-responsive-sm table-responsive-md table-responsive-lg table-responsive-xl\">\n");
      out.write("\t\t<table class=\"table table-striped\">\n");
      out.write("\t\t\t<thead style=\"background: #16c9f6; color: white; font-size: 20px;\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t            <th scope=\"col\">Transfer To</th>\n");
      out.write("\t\t\t\t    <th scope=\"col\">Amount</th>\n");
      out.write("\t\t\t\t    <th scope=\"col\">Date</th>\n");
      out.write("\t\t\t\t    <th scope=\"col\">Time</th>\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

			ResultSet rst=(ResultSet) stt.executeQuery(rem);
  if(rst.next())
  {
  	do
  	{
  		String name=rst.getString("user");
  		int bln=rst.getInt("amount");
  		String d=rst.getDate("dt").toString();
  		String t=rst.getTime("tt").toString();
  
      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <td>");
      out.print(name );
      out.write("</td>\n");
      out.write("      <td>$ ");
      out.print(bln );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(d );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(t );
      out.write("</td>\n");
      out.write("     </tr>\n");
      out.write("     \n");
      out.write("    ");

	}while(rst.next());
}
else
{
	out.println("No records found");
}
conn.close();

      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn tbtn\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" role=\"dialog\" id=\"money\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\" style=\"background: #16c9f6; color: white; font-size: 20px;\">\n");
      out.write("        <h5 class=\"modal-title\">Transfer Money</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form action=\"sendMoney\" method=\"post\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <input required type=\"text\" class=\"form-control\" id=\"name\" aria-describedby=\"emailHelp\" placeholder=\"Enter Name\" name=\"tname\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <input required type=\"email\" class=\"form-control\" id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\" name=\"mail\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <input required type=\"number\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Amount\" name=\"amt\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"text-center\">\n");
      out.write("  <button type=\"reset\" class=\"btn tbtn\">Reset</button>\n");
      out.write("  <button type=\"submit\" class=\"btn tbtn\">Transfer</button>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("      <button type=\"button\" class=\"btn tbtn\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
