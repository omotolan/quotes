package africa.semicolon.quotes.data.model;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserQuoteServiceImpl implements UserQuoteService {
    private final UserQuoteRepository userQuoteRepository;
    private final ModelMapper mapper;
@Override
    public QuoteDto createQuote(CreateQuoteRequest createQuoteRequest){
        UserQuotes userQuotes = mapper.map(createQuoteRequest, UserQuotes.class);
    System.out.println(userQuotes.getAuthor());
    userQuoteRepository.save(userQuotes);
//        userQuoteRepository.save(userQuotes);
        return new QuoteDto("saved");
    }

    @Override
    public List<UserQuotes> getQuotes() {
        return userQuoteRepository.findAll();
    }
}
