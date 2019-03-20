package ca.ualberta.cs.Lab9LonelyTwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LonelyTwitter {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

}