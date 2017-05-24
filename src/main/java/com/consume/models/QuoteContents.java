package com.consume.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteContents {

	private String quote;
	private String length;
	private String author;
	private String date;
	private ArrayList<String> tags; // = new ArrayList<String>(0);

	public QuoteContents() {
		this.tags = new ArrayList<String>();

	}

	@Override
	public String toString(){
		return "Quote: " + quote +", length: " + length + ", author: " + author + ", date: " + date + ", tags: " + tags;
	}



	public String getQuote() {
		return quote;
	}

	public String getAuthor() {
		return author;
	}

	public int getLength() {
		return Integer.parseInt(length);
	}

	public String getDate() {
		return date;
	}

	public ArrayList<String> getTags() {
		return tags;
	}
}
