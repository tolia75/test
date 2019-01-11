package app;

import Dao.DaoArticle;
import Dao.DaoArticleFactory;
import Dao.DaoArticleJpa;
import util.Article;
import util.BluRay;
import util.Dvd;

public class App {

	public static void main(String[] args) {
		
		Article a = new Dvd(25,true);
		Article b = new BluRay(26,true);
		
		DaoArticle DaoArticle = DaoArticleFactory.getInstance();
		DaoArticle.insert(a);
		DaoArticle.insert(b);

	}

}
