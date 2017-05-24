package com.consume.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteObject {

    //Field names must match JSON Keys
    private QuoteData contents;

    public QuoteObject() {
    }

    public QuoteData getContents() {
        return contents;
    }

    @Override
    public String toString(){
        return contents.toString();
    }

}
