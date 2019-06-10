package my.app.web;
	
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	private static Main mInstance;
	@FXML
	public TextField fxTextInput;
	@FXML
	public Button fxBtnSearch;
	@FXML
	private FXMLLoader m_Loader;
	@FXML
	Parent root;
	@FXML
	public static Scene scene = null;// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@FXML
	public static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Инициализация всех внутренних контролов!!!
			m_Loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			root = m_Loader.load();
			
			
			stage = primaryStage;
			fxTextInput = (TextField)m_Loader.getNamespace().get("fxTextInput");
			fxTextInput.setText("https://www.feedforall.com/sample.xml");
			fxBtnSearch = (Button)m_Loader.getNamespace().get("fxBtnSearch");
			scene = new Scene(root);
            stage.setTitle("777");
            stage.setScene(scene);
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	 public Main() {
	 		mInstance = this;
	     }
	 	
	 	public static  Main getInstance() {
	        return mInstance;
	    }
	
	public static void main(String[] args) {
		launch(args);
		// create the rss feed
       /* String copyright = "Copyright hold by Lars Vogel";
        String title = "Eclipse and Java Information";
        String description = "Eclipse and Java Information";
        String language = "en";
        String link = "http://www.vogella.com";
        Calendar cal = new GregorianCalendar();
        Date creationDate = cal.getTime();
        SimpleDateFormat date_format = new SimpleDateFormat(
                "EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
        String pubdate = date_format.format(creationDate);
        Feed rssFeeder = new Feed(title, link, description, language,
                copyright, pubdate);
*/
        // now add one example entry
       /* FeedMessage feed = new FeedMessage();
        feed.setTitle("RSSFeed");
        feed.setDescription("This is a description");
        feed.setAuthor("nonsense@somewhere.de (Lars Vogel)");
        feed.setGuid("https://www.vogella.com/tutorials/RSSFeed/article.html");
        feed.setLink("https://www.vogella.com/tutorials/RSSFeed/article.html");
        rssFeeder.getMessages().add(feed);

        // now write the file
        RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, "articles.rss");
        try {
            writer.write();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
	}
}
