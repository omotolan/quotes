package africa.semicolon.quotes.service;


import java.util.List;
import java.util.Map;

public interface ExternalApiService {
    void getQuoteFromApi();
    Map<String, Object> getAllApiQuotes();
}
