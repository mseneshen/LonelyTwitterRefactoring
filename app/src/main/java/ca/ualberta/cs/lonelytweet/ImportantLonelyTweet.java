package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

    @Override
    public boolean isValid() {
		// FIX 1: Removed if statement to return expression value, for simplification.
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);

	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}