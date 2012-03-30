/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Nikhil
 */
public class Extract {

    String send = "";
    int count = 0;

    public Extract() {
    }

    public Home extractArticles(Home home) {
        try {
            File file = new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\Article.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            //send = "Root element: " + doc.getDocumentElement().getNodeName() + "\n";

            NodeList nodeLst = doc.getElementsByTagName("element");
            //send += "Information of articles: \n";

            home.lim = nodeLst.getLength();
            //System.out.println(nodeLst.getLength());
            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;

                    NodeList idElmntLst = fstElmnt.getElementsByTagName("id");
                    Element idNmElmnt = (Element) idElmntLst.item(0);
                    NodeList idNm = idNmElmnt.getChildNodes();
                    home.art[s].id = ((Node) idNm.item(0)).getNodeValue();

                    NodeList userElmntLst = fstElmnt.getElementsByTagName("username");
                    Element userElmnt = (Element) userElmntLst.item(0);
                    NodeList userNm = userElmnt.getChildNodes();
                    home.art[s].username = ((Node) userNm.item(0)).getNodeValue();

                    NodeList titleElmntLst = fstElmnt.getElementsByTagName("title");
                    Element titleElmnt = (Element) titleElmntLst.item(0);
                    NodeList titleNm = titleElmnt.getChildNodes();
                    home.art[s].title = ((Node) titleNm.item(0)).getNodeValue();

                    NodeList contentElmntLst = fstElmnt.getElementsByTagName("content");
                    Element contentElmnt = (Element) contentElmntLst.item(0);
                    NodeList contentNm = contentElmnt.getChildNodes();
                    home.art[s].content = ((Node) contentNm.item(0)).getNodeValue();

                    /*
                    NodeList dateElmntLst = fstElmnt.getElementsByTagName("date");
                    Element dateElmnt = (Element) dateElmntLst.item(0);
                    NodeList dateNm = dateElmnt.getChildNodes();
                    home.art[s].date = ((Node) dateNm.item(0)).getNodeValue();
                    */
                 }
            }
        } catch (Exception e) {
            System.out.println("Exceptions!");
        }

        return home;
    }

    public int nextNode() {
        try {
            File file = new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\Article.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            //send = "Root element: " + doc.getDocumentElement().getNodeName() + "\n";

            NodeList nodeLst = doc.getElementsByTagName("element");
            //send += "Information of articles: \n";

            return nodeLst.getLength();
        } catch (Exception e) {
            System.out.println("Exceptions!");
        }

        return 0;
    }

    public String fetchUsers() {
        String ret = "";

        try {
            File file = new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\User.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            //send = "Root element: " + doc.getDocumentElement().getNodeName() + "\n";

            NodeList nodeLst = doc.getElementsByTagName("element");
            //send += "Information of articles: \n";

            //System.out.println(nodeLst.getLength());
            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    NodeList userElmntLst = fstElmnt.getElementsByTagName("username");
                    Element userElmnt = (Element) userElmntLst.item(0);
                    NodeList userNm = userElmnt.getChildNodes();
                    ret += ((Node) userNm.item(0)).getNodeValue() + "<br/>";

                    //ret += (Node(Element) userElmntLst.item(0).getChildNodes().item(0)).getNodeValue();
                }
            }
        } catch (Exception e) {
            System.out.println("Exceptions!");
        }

        return ret;
    }

    public boolean login(String username, String password) {
        boolean flag = false;
        String current_user = "";
        String current_pass = "";

        try {
            File file = new File("C:\\Users\\Nikhil\\Documents\\NetBeansProjects\\Blogger\\web\\User.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            //send = "Root element: " + doc.getDocumentElement().getNodeName() + "\n";

            NodeList nodeLst = doc.getElementsByTagName("element");
            //send += "Information of articles: \n";

            //System.out.println(nodeLst.getLength());
            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    NodeList userElmntLst = fstElmnt.getElementsByTagName("username");
                    Element userElmnt = (Element) userElmntLst.item(0);
                    NodeList userNm = userElmnt.getChildNodes();
                    current_user = ((Node) userNm.item(0)).getNodeValue();

                    NodeList titleElmntLst = fstElmnt.getElementsByTagName("password");
                    Element titleElmnt = (Element) titleElmntLst.item(0);
                    NodeList titleNm = titleElmnt.getChildNodes();
                    current_pass = ((Node) titleNm.item(0)).getNodeValue();

                    System.out.println(current_user + current_pass);
                    
                    if (current_user.equals(username) && current_pass.equals(password)) {
                        flag = true;
                        break;
                    }
                    //ret += (Node(Element) userElmntLst.item(0).getChildNodes().item(0)).getNodeValue();
                }
            }
        } catch (Exception e) {
            System.out.println("Exceptions!");
        }

        return flag;
    }

    public static void main(String args[]) {
        System.out.println(new Extract().login("atm", "atm"));
    }
}
