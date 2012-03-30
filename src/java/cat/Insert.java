/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author Nikhil
 */
public class Insert {
    /*
    public static void main(String args[]) {
        new Insert().insertUser("Tanvi", "catcatcat", "tanvi_the_ultimate@yahoo.co.in");
    }
    * 
    */

    public boolean insertUser(String username, String password, String email) {
        boolean flag = true;
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\User.xml"));

            Element root = doc.getDocumentElement();
            Element cElement = doc.createElement("element");

            Text cUsernameText = doc.createTextNode(username);
            Text cPasswordText = doc.createTextNode(password);
            Text cEmailText = doc.createTextNode(email);

            Element cUsername = doc.createElement("username");
            Element cPassword = doc.createElement("password");
            Element cEmail = doc.createElement("email");

            root.appendChild(cElement);
            cElement.appendChild(cUsername);
            cUsername.appendChild(cUsernameText);
            cElement.appendChild(cPassword);
            cPassword.appendChild(cPasswordText);
            cElement.appendChild(cEmail);
            cEmail.appendChild(cEmailText);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
            String xmlString = sw.toString();
            System.out.println(xmlString);

            FileWriter fstream = new FileWriter("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\User.xml");
            //File file = new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\User.xml");
            BufferedWriter bw = new BufferedWriter(fstream);
            bw.write(xmlString);
            bw.flush();
            bw.close();
        } catch (SAXException e) {
            flag = false;
        } catch (IOException e) {
            flag = false;
        } catch (ParserConfigurationException e) {
            flag = false;
        } catch (TransformerConfigurationException e) {
            flag = false;
        } catch (TransformerException e) {
            flag = false;
        }

        return flag;
    }

    public boolean insertBlogEntry(String username, String title, String content, int d, int m, int y) {
        boolean flag = true;
        y %= 100;
        try {
            int next = new Extract().nextNode() + 1;

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\Article.xml"));

            Element root = doc.getDocumentElement();
            Element cElement = doc.createElement("element");

            Text cIDText = doc.createTextNode(Integer.toString(next));
            Text cUsernameText = doc.createTextNode(username);
            Text cTitleText = doc.createTextNode(title);
            Text cContentText = doc.createTextNode(content);
            /*
            Text cdDayText = doc.createTextNode(Integer.toString(d));
            Text cdMonthText = doc.createTextNode(Integer.toString(m));
            Text cdYearText = doc.createTextNode(Integer.toString(y));
            */
            
            Text cDateText = doc.createTextNode(Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(y));
            
            Element cID = doc.createElement("id");
            Element cUsername = doc.createElement("username");
            Element cTitle = doc.createElement("title");
            Element cContent = doc.createElement("content");
            Element cDate = doc.createElement("date");
            
            /*
            Element cdDay = doc.createElement("day");
            Element cdMonth = doc.createElement("month");
            Element cdYear = doc.createElement("year");
            */
            
            root.appendChild(cElement);
            cElement.appendChild(cID);
            cID.appendChild(cIDText);
            cElement.appendChild(cUsername);
            cUsername.appendChild(cUsernameText);
            cElement.appendChild(cTitle);
            cTitle.appendChild(cTitleText);
            cElement.appendChild(cContent);
            cContent.appendChild(cContentText);
            cElement.appendChild(cDate);
            cDate.appendChild(cDateText);
            
            /*
            cDate.appendChild(cdDay);
            cdDay.appendChild(cdDayText);
            cDate.appendChild(cdMonth);
            cdMonth.appendChild(cdMonthText);
            cDate.appendChild(cdYear);
            cdYear.appendChild(cdYearText);
            */
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
            String xmlString = sw.toString();

            FileWriter fstream = new FileWriter("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\Article.xml");
            System.out.println(xmlString);
            BufferedWriter bw = new BufferedWriter(fstream);
            bw.write(xmlString);
            bw.flush();
            bw.close();
        } catch (SAXException e) {
            flag = false;
        } catch (IOException e) {
            flag = false;
        } catch (ParserConfigurationException e) {
            flag = false;
        } catch (TransformerConfigurationException e) {
            flag = false;
        } catch (TransformerException e) {
            flag = false;
        }

        return flag;
    }
    
    
    public static void main(String args[]) {
    
        Insert ins = new Insert();
    /*
        ins.insertUser("vauly", "vauly", "vaulstein@gmail.com");
    * 
    */
        ins.insertBlogEntry("atm", "I am so baked already", "JavaServer Pages (JSP) is a technology that helps software developers serve dynamically generated web pages based on HTML, XML, or other document types. Released in 1999 by Sun Microsystems, JSP is similar to ASP and PHP, but it uses the Java programming language. To deploy and run, a compatible web server with servlet container is required. The Java Servlet and the JavaServer Pages (JSP) specifications from Sun Microsystems and the JCP (Java Community Process) must both be supported by the container. Apache Tomcat is a widely used servlet container/web server.", 30, 3, 2012);
        
        
    }
}
