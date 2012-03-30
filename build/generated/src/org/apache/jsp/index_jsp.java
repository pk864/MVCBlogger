package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cat.Extract;
import cat.Home;
import cat.Insert;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/head");
    _jspx_dependants.add("/banner");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_lang;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_scope_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html_lang = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html_lang.release();
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_html_base_nobody.release();
    _jspx_tagPool_logic_notPresent_scope_name.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html_lang.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      _jspx_th_html_html_0.setLang(true);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
          out.write("<head>\r\n");
          out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
          out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/style.css\">\r\n");
          out.write("    <title>");
          if (_jspx_meth_bean_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</title>\r\n");
          out.write("    ");
          if (_jspx_meth_html_base_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("</head>");
          out.write("\n");
          out.write("    <body style=\"background-color: white\">\n");
          out.write("        <div id=\"large_wrapper\">\n");
          out.write("            ");
          if (_jspx_meth_logic_notPresent_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        \r\n");
          out.write("<center>\r\n");
          out.write("    <h1>");
          if (_jspx_meth_bean_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</h1>\r\n");
          out.write("    <p>");
          if (_jspx_meth_bean_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</p>\r\n");
          out.write("    <ol id=\"nav\">\r\n");
          out.write("        <li><a href=\"?p=home\">Home </a></li>\r\n");
          out.write("        <li><a href=\"?p=user\">User accounts </a></li>\r\n");
          out.write("        <li><a href=\"?p=blogpost\">Blog post</a></li>\r\n");
          out.write("        <li><a href=\"?p=about\">About</a></li>\r\n");
          out.write("        ");

            //Only show logout button if the user is logged in
            boolean logged = false;

            Cookie cookies[] = request.getCookies ();
            Cookie myCookie = null;
            if (cookies != null)
            {
                for (int i = 0; i < cookies.length; i++) 
                {
                    if (cookies[i].getName().equals("username"))
                    {
                        myCookie = cookies[i];
                        logged = true;
                        break;
                    }
                }
            }
            
            if (logged)
            {
                out.println("<li id=\"logged\"><a href=\"?p=logout\">Logout " + myCookie.getValue() + "</a></li>");
            }
        
          out.write("\r\n");
          out.write("    </ol>\r\n");
          out.write("</center>");
          out.write("\n");
          out.write("            <div id=\"content_wrapper\">\n");
          out.write("                ");

                    String pageVar = request.getParameter("p");
                    if (pageVar == null) {
                        pageVar = "home";
                    }

                    //Home code goes here
                    if (pageVar.equals("home")) {
                        //out.print(pageVar);
                        int i = 0;
                        Home obj = new Home();
                        obj = obj.getArticles();
                        //out.println(obj.lim);
                        while (i < obj.lim) {
                
          out.write("\n");
          out.write("                <div id=\"post\">    \n");
          out.write("                    <h3 id=\"post_id\">");
          out.print( obj.art[i].id);
          out.write("</h3>\n");
          out.write("                    <div id=\"post_title\">");
          out.print( obj.art[i].title);
          out.write("</div>\n");
          out.write("                    <div id=\"post_content\">");
          out.print( obj.art[i].content);
          out.write("</div>\n");
          out.write("                    <div id=\"post_author\">Posted by: ");
          out.print( obj.art[i].username);
          out.write("</div>\n");
          out.write("                    <div id=\"post_date\"> on ");
          out.print( obj.art[i].date);
          out.write("</div>\n");
          out.write("                </div>\n");
          out.write("\n");
          out.write("                ");

                            i++;
                        }
                    }

                    //New user
                    if (pageVar.equals("user/new")) {
                        String method = request.getParameter("action");
                        String username = request.getParameter("form_username");
                        String password = request.getParameter("form_password");
                        String email = request.getParameter("form_email");
                        String redirectURL = "?p=notify&str=Done";
                        Insert user = new Insert();
                        boolean status = user.insertUser(username, password, email);
                        out.println(status);

                        if (!status) {
                            redirectURL = "?p=notify&str=Failed";
                        }
                        response.sendRedirect(redirectURL);
                    }

                    //Login code goes here
                    if (pageVar.equals("login")) {
                        String username = request.getParameter("form_username");
                        String password = request.getParameter("form_password");
                        String redirectURL = "?p=notify&str=Done";
                        Extract user = new Extract();
                        boolean status = user.login(username, password);
                        //out.println("Status: " + status);
                        if (status) {
                            String timestamp = new Date().toString();
                            Cookie cookie = new Cookie("username", username);
                            //cookie.setMaxAge(365 * 24 * 60 * 60);
                            //cookie.setDomain("http://localhost:8080/");
                            response.addCookie(cookie);
                        }

                        if (!status) {
                            redirectURL = "?p=notify&str=Failed";
                        }
                        response.sendRedirect(redirectURL);
                    }

                    //Logout code goes here
                    if (pageVar.equals("logout")) {
                        String redirectURL = "?p=notify&str=Done";
                        String timestamp = new Date().toString();
                        Cookie cookie = new Cookie("username", null);
                        cookie.setMaxAge(0);
                        //cookie.setDomain("http://localhost:8080/");
                        response.addCookie(cookie);

                        response.sendRedirect(redirectURL);
                    }

                    //User code goes here
                    if (pageVar.equals("user")) {
                
          out.write("\n");
          out.write("                <div id=\"post\">\n");
          out.write("                    ");

                        if (!logged) {
                    
          out.write("\n");
          out.write("\n");
          out.write("                    Signup: <br/>\n");
          out.write("                    <form name=\"signup\" action=\"?p=user/new\" method=\"post\">\n");
          out.write("                        <label name=\"Username\">Username</label>: <input name=\"form_username\" type=\"text\" placeholder=\"Username\" id=\"inp\" required/><br/>\n");
          out.write("                        <label name=\"Password\">Password</label>: <input name=\"form_password\" type=\"password\" placeholder=\"Password\" id=\"inp\" required/><br/>\n");
          out.write("                        <label name=\"Email\">email</label>: <input name=\"form_email\" type=\"email\" placeholder=\"Email\" id=\"inp\" required/><br/>\n");
          out.write("\n");
          out.write("                        <input type=\"submit\" value=\"Submit\"/>\n");
          out.write("                        <input type=\"reset\" value=\"Reset\"/>\n");
          out.write("                    </form>\n");
          out.write("                </div>\n");
          out.write("                <br />\n");
          out.write("                <div id=\"post\">\n");
          out.write("                    Login: <br/>\n");
          out.write("                    <form name=\"login\" action=\"?p=login\" method=\"post\">\n");
          out.write("                        <label name=\"Username\">Username</label>: <input name=\"form_username\" type=\"text\" placeholder=\"Username\" id=\"inp\" required/><br/>\n");
          out.write("                        <label name=\"Password\">Password</label>: <input name=\"form_password\" type=\"password\" placeholder=\"Password\" id=\"inp\" required/><br/>\n");
          out.write("                        <input type=\"submit\" value=\"Submit\"/>\n");
          out.write("                        <input type=\"reset\" value=\"Reset\"/>                        \n");
          out.write("                    </form>\n");
          out.write("                </div>\n");
          out.write("                ");
                    }
                
          out.write("\n");
          out.write("                <br />\n");
          out.write("                <div id=\"post_test\">\n");
          out.write("                    <h3 style=\"text-align: center\">Current users</h3>\n");
          out.write("                    ");

                        Extract tmp = new Extract();
                        out.println(tmp.fetchUsers());
                    
          out.write("\n");
          out.write("                </div>\n");
          out.write("                ");
                        }

                    //Blogpost code goes here
                    if (pageVar.equals("blogpost")) {
                        if (!logged) {
                
          out.write("\n");
          out.write("\n");
          out.write("                <div id=\"post\">\n");
          out.write("                    Please log in and try reloading the page.\n");
          out.write("                    This is a member restricted area.\n");
          out.write("\n");
          out.write("                    Thanks!\n");
          out.write("                </div>\n");
          out.write("\n");
          out.write("                ");
                } else {
                
          out.write("\n");
          out.write("                <div id=\"post\"> \n");
          out.write("                    <form name=\"add_entry\" action=\"?p=blog/submit\" method=\"post\">\n");
          out.write("                        <label value=\"Title\">Title</label>: <br/><input type=\"text\" name=\"title\" size=\"80px\" /><br/>\n");
          out.write("                        <label value=\"Content\" style=\"float: top\">Content</label>:<br/><textarea name=\"content\" rows=\"20\" cols=\"50\"></textarea><br/>\n");
          out.write("\n");
          out.write("                        <input type=\"submit\" value=\"Submit\">\n");
          out.write("                        <input type=\"reset\" value=\"Reset\">\n");
          out.write("                    </form>                        \n");
          out.write("                </div>\n");
          out.write("                ");
                        }

                    }

                    if (pageVar.equals("blog/submit")) {
                        Insert tmp = new Insert();
                        Date tmpDt = new Date();
                        tmp.insertBlogEntry(myCookie.getValue(), request.getParameter("title"), request.getParameter("content"), tmpDt.getDate(), tmpDt.getMonth(), tmpDt.getYear());
                    }

                    //About code goes here
                    if (pageVar.equals("about")) {
                        out.print(pageVar);
                    }

                    if (pageVar.equals("notify")) {
                        String notifyString = request.getParameter("str");
                        if (notifyString.equals("Done")) {
                
          out.write("\n");
          out.write("                <div id=\"post\">\n");
          out.write("                    Process completed. Click <a href=\"?p=home\">here</a> to continue.\n");
          out.write("                </div>\n");
          out.write("                ");
                    }

                    if (notifyString.equals("Failed")) {
                
          out.write("\n");
          out.write("                <div id=\"post\">\n");
          out.write("                    Process <span style=\"color: red\">NOT</span> completed. Click <a href=\"?p=home\">here</a> to continue.\n");
          out.write("                </div>\n");
          out.write("                ");
                        }
                    }
                
          out.write("\n");
          out.write("            </div>\n");
          out.write("\n");
          out.write("            <div id=\"content_sidebar\">\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </body>\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_html_lang.reuse(_jspx_th_html_html_0);
        return;
      }
      _jspx_tagPool_html_html_lang.reuse(_jspx_th_html_html_0);
      out.write('\n');
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

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_0.setKey("blog.title");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_html_base_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_base_0 = (org.apache.struts.taglib.html.BaseTag) _jspx_tagPool_html_base_nobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_base_0.setPageContext(_jspx_page_context);
    _jspx_th_html_base_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    int _jspx_eval_html_base_0 = _jspx_th_html_base_0.doStartTag();
    if (_jspx_th_html_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
      return true;
    }
    _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
    return false;
  }

  private boolean _jspx_meth_logic_notPresent_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_0 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_scope_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_notPresent_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_notPresent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_logic_notPresent_0.setName("org.apache.struts.action.MESSAGE");
    _jspx_th_logic_notPresent_0.setScope("application");
    int _jspx_eval_logic_notPresent_0 = _jspx_th_logic_notPresent_0.doStartTag();
    if (_jspx_eval_logic_notPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<div style=\"color: red\">\r\n");
        out.write("    ERROR:  Application resources not loaded -- check servlet container logs for error messages.\r\n");
        out.write("</div>\r\n");
        int evalDoAfterBody = _jspx_th_logic_notPresent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notPresent_scope_name.reuse(_jspx_th_logic_notPresent_0);
      return true;
    }
    _jspx_tagPool_logic_notPresent_scope_name.reuse(_jspx_th_logic_notPresent_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_1.setKey("blog.heading");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_2.setKey("blog.message");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }
}
