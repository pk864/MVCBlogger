<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page import="cat.Extract" %>
<%@ page import="cat.Home" %>
<%@ page import="cat.Insert" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <%@include file="head" %>
    <body style="background-color: white">
        <div id="large_wrapper">
            <%@include file="banner" %>
            <div id="content_wrapper">
                <%
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
                %>
                <div id="post">    
                    <h3 id="post_id"><%= obj.art[i].id%></h3>
                    <div id="post_title"><%= obj.art[i].title%></div>
                    <div id="post_content"><%= obj.art[i].content%></div>
                    <div id="post_author">Posted by: <%= obj.art[i].username%></div>
                    <div id="post_date"> on <%= obj.art[i].date%></div>
                </div>

                <%
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
                %>
                <div id="post">
                    <%
                        if (!logged) {
                    %>

                    Signup: <br/>
                    <form name="signup" action="?p=user/new" method="post">
                        <label name="Username">Username</label>: <input name="form_username" type="text" placeholder="Username" id="inp" required/><br/>
                        <label name="Password">Password</label>: <input name="form_password" type="password" placeholder="Password" id="inp" required/><br/>
                        <label name="Email">email</label>: <input name="form_email" type="email" placeholder="Email" id="inp" required/><br/>

                        <input type="submit" value="Submit"/>
                        <input type="reset" value="Reset"/>
                    </form>
                </div>
                <br />
                <div id="post">
                    Login: <br/>
                    <form name="login" action="?p=login" method="post">
                        <label name="Username">Username</label>: <input name="form_username" type="text" placeholder="Username" id="inp" required/><br/>
                        <label name="Password">Password</label>: <input name="form_password" type="password" placeholder="Password" id="inp" required/><br/>
                        <input type="submit" value="Submit"/>
                        <input type="reset" value="Reset"/>                        
                    </form>
                </div>
                <%                    }
                %>
                <br />
                <div id="post_test">
                    <h3 style="text-align: center">Current users</h3>
                    <%
                        Extract tmp = new Extract();
                        out.println(tmp.fetchUsers());
                    %>
                </div>
                <%                        }

                    //Blogpost code goes here
                    if (pageVar.equals("blogpost")) {
                        if (!logged) {
                %>

                <div id="post">
                    Please log in and try reloading the page.
                    This is a member restricted area.

                    Thanks!
                </div>

                <%                } else {
                %>
                <div id="post"> 
                    <form name="add_entry" action="?p=blog/submit" method="post">
                        <label value="Title">Title</label>: <br/><input type="text" name="title" size="80px" /><br/>
                        <label value="Content" style="float: top">Content</label>:<br/><textarea name="content" rows="20" cols="50"></textarea><br/>

                        <input type="submit" value="Submit">
                        <input type="reset" value="Reset">
                    </form>                        
                </div>
                <%                        }

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
                %>
                <div id="post">
                    Process completed. Click <a href="?p=home">here</a> to continue.
                </div>
                <%                    }

                    if (notifyString.equals("Failed")) {
                %>
                <div id="post">
                    Process <span style="color: red">NOT</span> completed. Click <a href="?p=home">here</a> to continue.
                </div>
                <%                        }
                    }
                %>
            </div>

            <div id="content_sidebar">
            </div>
        </div>
    </body>
</html:html>
