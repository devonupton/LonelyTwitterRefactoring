package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
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
				|| tweetBody.trim().length() > 10);
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	// FIX: Made private because this is only called internally
	private String getTweetBody() {
        return tweetBody;
    }
}