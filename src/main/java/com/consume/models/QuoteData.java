package com.consume.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteData {

    //Field names must match JSON Keys
    private ArrayList<QuoteContents> quotes; // = new ArrayList<QuoteContents>(0);

    public QuoteData() {
		this.quotes = new ArrayList<QuoteContents>();

	}

	@Override
	public String toString(){
    	return quotes.get(0).toString();
	}

	public ArrayList<QuoteContents> getQuotes() {
		return quotes;
	}
}
