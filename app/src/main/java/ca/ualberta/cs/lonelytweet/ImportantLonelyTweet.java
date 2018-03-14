package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	@Override
	public boolean isValid() {
		// FIX: Removed redundant if statement since we can return bool
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("ImportantLonelyTweet", string);
		return string;
	}

	// FIX: Made private because this is only called internally
	private String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}