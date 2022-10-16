package africa.semicolon.quotes.data.model;

public interface UserQuoteService {
    QuoteDto createQuote(CreateQuoteRequest createQuoteRequest);

    Object getQuotes();
}
