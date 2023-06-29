package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>JKB BANKING</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"main.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"top\">\n");
      out.write("        <img src=\"images/logo.jpg\" alt=\"BANK LOGO\">\n");
      out.write("        <p>JKB BANK</p>\n");
      out.write("        <a href=\"Loginform/Application.html\" id=\"add\">ADD</a>\n");
      out.write("        <a href=\"Tickets.html\" id=\"bank\">Online Banking</a>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <div class=\"nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"#\">Home</a></li>\n");
      out.write("            <li><a href=\"transaction.jsp\">Services</a></li>\n");
      out.write("            <li><a href=\"addcustomer.jsp\">Send Money</a></li>\n");
      out.write("            <li><a href=\"#\">Add user</a></li>\n");
      out.write("            <li><a href=\"#\">More</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"bg\"></div> \n");
      out.write("        <div class=\"text\">\n");
      out.write("            <h1 style=\"color: white; \">WELCOME TO JKB...</h1><br><br>\n");
      out.write("                <h2 style=\"color: white;\">With JKB Online Banking, you can bank anywhere,anytime</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("          <!------ course ------>\n");
      out.write("<div class=\"course\">\n");
      out.write("\t<h1>Services We Offer</h1>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"course-col\">\n");
      out.write("                    <img src=\"images/icons8-client-management-unscreen.gif\"><br><br>\n");
      out.write("                    <a href=\"transaction.jsp\">Add Customer</a>\n");
      out.write("                    \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"course-col\">\n");
      out.write("\t\t    <img src=\"images/icons8-card-exchange-unscreen.gif\"><br><br>\n");
      out.write("                    <a href=\"transaction.jsp\">Transfer Money</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"course-col\">\n");
      out.write("\t\t    <img src=\"images/icons8-scroll-unscreen.gif\"><br><br>\n");
      out.write("\t\t\t<a href=\"transaction.jsp\">Transaction History</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
