/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author Nikhil
 */
public class Home {

    public int lim = 0;
    public Article art[] = new Article[20];

    public Home() {
        for (int i = 0; i < 20; i++) {
            art[i] = new Article();
        }            
    }
    
    public class Article {

        public String id = new String();
        public String username;
        public String title;
        public String content;
        public String date;
    }

    public Home getArticles() {
        Home home = new Home();
        Extract extract = new Extract();
        extract.extractArticles(home);
        return extract.extractArticles(home);
    }
    
    /*
    @Override
    public String toString() {
        return "Hello string world!";
    }
    * 
    */
    
    public static void main(String args[]) {
        Home home = new Home();
        home = home.getArticles();
        for (int i = 0 ; i < home.lim; i++) {
            System.out.println(home.art[i].date + "\n" + home.art[i].title + "\n" + home.art[i].username + "\n" + home.art[i].content);
        }
    }
}
