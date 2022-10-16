package africa.semicolon.quotes;

import africa.semicolon.quotes.data.model.Quotes;

import java.util.List;
import java.util.Map;

public interface ExternalApiService {
    void getQuoteFromApi();
    Map<String, Object> getAllApiQuotes();
}
