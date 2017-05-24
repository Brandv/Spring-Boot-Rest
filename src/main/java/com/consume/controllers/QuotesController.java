package com.consume.controllers;

import com.consume.models.QuoteObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/quotes")
public class QuotesController {

	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@RequestMapping()
	public String findQuote(RestTemplate restTemplate, Model model) {
		String quoteURL = "http://quotes.rest/qod.json";
		QuoteObject quote = restTemplate.getForObject(quoteURL, QuoteObject.class);

		model.addAttribute("quote", quote.getContents().getQuotes().get(0).getQuote());
		model.addAttribute("author", quote.getContents().getQuotes().get(0).getAuthor());
		model.addAttribute("date", quote.getContents().getQuotes().get(0).getDate());
		return "quotes";
	}
}