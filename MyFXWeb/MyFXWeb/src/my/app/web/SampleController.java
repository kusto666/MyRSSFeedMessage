package my.app.web;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {
	//http://qaru.site/questions/tagged/rss
	@FXML
	void btOnSearch(ActionEvent event)
	{
		System.out.println(Main.getInstance().fxTextInput.getText());
		
		RSSFeedParser parser = new RSSFeedParser(Main.getInstance().fxTextInput.getText());
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
            System.out.println(message.description);

        }
	}
}
