package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Time;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import servlet.sendMoney;

public final class transferform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input required type=\"text\" class=\"form-control\" id=\"name\" aria-describedby=\"emailHelp\" placeholder=\"Enter Name\" name=\"tname\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input required type=\"email\" class=\"form-control\" id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\" name=\"mail\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input required type=\"number\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Amount\" name=\"amt\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <button type=\"reset\" class=\"btn tbtn\">Reset</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn tbtn\">Transfer</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("      <button type=\"button\" class=\"btn tbtn\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
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
