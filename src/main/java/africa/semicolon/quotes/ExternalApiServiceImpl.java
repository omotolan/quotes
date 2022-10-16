package africa.semicolon.quotes;

import africa.semicolon.quotes.data.model.Quotes;
//import africa.semicolon.quotes.data.model.QuoteDesrializer;
import africa.semicolon.quotes.data.model.QuoteRepository;
import africa.semicolon.quotes.data.model.Wrapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor

public class ExternalApiServiceImpl  implements ExternalApiService{

    @NonNull
    private QuoteRepository quoteRepository;
    private final static String url = "https://goquotes-api.herokuapp.com/api/v1/random?count=100";

    @Override
    public void getQuoteFromApi() {
        RestTemplate restTemplate = new RestTemplate();

        List<Quotes> quotes = restTemplate.getForObject(url, Wrapper.class).getQuotes();
        quoteRepository.saveAll(quotes);

    }
    public Map<String, Object> getAllApiQuotes(){
        int numberOfPages = 0;
        int numberOfItems = 1;

        Pageable pageable = PageRequest.of(numberOfPages, numberOfItems);
        Page<Quotes> page = quoteRepository.findAll(pageable);
        Map<String, Object> pageResult = new HashMap<>();
        pageResult.put("totalNumberOfPages", page.getTotalPages());
        pageResult.put("totalNumberOfElementsInDatabase", page.getTotalElements());
        if (page.hasNext()) {
            pageResult.put("nextPage", page.nextPageable());
        }
        if (page.hasPrevious()) {
            pageResult.put("nextPage", page.previousPageable());
        }
        pageResult.put("books", page.getContent());
        pageResult.put("NumberOfElementsInPage", page.getNumberOfElements());
        pageResult.put("pageNumber", page.getNumber());
        pageResult.put("size", page.getSize());

        return pageResult;
//        return quoteRepository.findAll();
    }
}
