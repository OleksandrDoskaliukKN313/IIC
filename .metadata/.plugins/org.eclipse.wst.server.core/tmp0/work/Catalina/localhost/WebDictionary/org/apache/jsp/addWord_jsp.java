package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import database.DatabaseFacade;

public final class addWord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Add new word</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"w3.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"w3-light-grey \">\r\n");
      out.write("<div class=\"w3-container w3-blue-grey w3-opacity w3-left-align \t\">\r\n");
      out.write("        <h1 class = \"w3-xxxlarge\">Add new word</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("<div class = \"w3-xlarge w3-container w3-center\">\r\n");

	String en = request.getParameter("en");
	if(!en.equals(""))
	{
	String ua = new String(request.getParameter("ua").getBytes("ISO-8859-1"),"UTF8");
	
	DatabaseFacade.getStatment().execute("insert into words.words (en,ua,count_correct_en,count_correct_ua) values("+"'"+en+"',"
				+"'"+ua+"',"+"0,0);");
	
	
	
      out.write("\r\n");
      out.write("\t\t<p>EN: ");
      out.print(en  );
      out.write("</p>\r\n");
      out.write("        <p>UA: ");
      out.print(ua  );
      out.write("</p>\r\n");
      out.write("        <p>Done!</p>\r\n");
      out.write("        ");

        }
	else
	{
		
      out.write("\r\n");
      out.write("\t\t<p>Can`t add nothing!</p>\r\n");
      out.write("\t\t");

	}
	
      out.write("\r\n");
      out.write("        <div >\r\n");
      out.write("        <button class = \"w3-btn w3-hover-green w3-round-large\" onclick=\"location.href='addWord'\">Add new word</button>\r\n");
      out.write("        <br>\r\n");
      out.write("        <button class=\"w3-btn w3-hover-red w3-round-large w3-large w3-margin-top\" onclick=\"location.href='index.html'\">Back</button>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("       \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
