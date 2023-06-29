package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("   </head>\n");
      out.write("    <script>\n");
      out.write("    function validateform(){\n");
      out.write("        var name=document.myform.name.value;\n");
      out.write("       \n");
      out.write("        var email=document.myform.email.value;\n");
      out.write("       \n");
      out.write("        var currentbalance=document.myform.currentbalance.value;\n");
      out.write("        var atposition=email.indexOf(\"@\");  \n");
      out.write("        var dotposition=email.lastIndexOf(\".\"); \n");
      out.write("        \n");
      out.write("        if(name==null || name==\"\"){\n");
      out.write("           alert(\"Name can't be blank\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){  \n");
      out.write("            alert(\"Please enter a valid e-mail address\");  \n");
      out.write("            return false;  \n");
      out.write("        }\n");
      out.write("        else if(currentbalance==\"\") {\n");
      out.write("            alert(\"Please enter current balance\");\n");
      out.write("           \n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        else{\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg1\"></div>\n");
      out.write("        <div class=\"signup-box\">\n");
      out.write("            <img src=\"images/avatar.png\" class=\"avatar\">\n");
      out.write("            <h1 style=\"color: rgb(11, 1, 1)\">CUSTOMER</h1>\n");
      out.write("                    <form name=\"myform\" action=\"addcustomer\" method=\"post\" onsubmit=\"return validateform();\">\n");
      out.write("                        <p>Name</p>\n");
      out.write("                        <input type=\"text\" name=\"name\" placeholder=\"Enter Name\">\n");
      out.write("                        <p>Account Number</p>\n");
      out.write("                        <input type=\"number\" name=\"accno\" placeholder=\"Enter Accountno\">\n");
      out.write("                        <p>Email Id</p>\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Enter Email\">\n");
      out.write("                        <p>Balance</p>\n");
      out.write("                        <input type=\"text\" name=\"balance\" placeholder=\"Enter balance\">\n");
      out.write("                        <br></br> \n");
      out.write("                      \n");
      out.write("                        <div class=\"Signup\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success btn-lg\">Create</button>\n");
      out.write("                                <button type=\"reset\"  class=\"btn btn-danger btn-lg\">Reset</button>\n");
      out.write("                                <a href=\"index.jsp\" class=\"btn btn-primary btn-lg\" role=\"button\">Back</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
