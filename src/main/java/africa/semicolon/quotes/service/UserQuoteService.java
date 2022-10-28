package africa.semicolon.quotes.service;

import africa.semicolon.quotes.dto.CreateQuoteRequest;
import africa.semicolon.quotes.dto.QuoteDto;

public interface UserQuoteService {
    QuoteDto createQuote(CreateQuoteRequest createQuoteRequest);

    Object getQuotes();
}
