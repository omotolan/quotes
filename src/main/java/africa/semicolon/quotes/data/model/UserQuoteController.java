package africa.semicolon.quotes.data.model;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class UserQuoteController {
    private final UserQuoteService userQuoteService;

    @PostMapping("/create")
    public ResponseEntity<?> addQuote(@RequestBody CreateQuoteRequest createQuoteRequest) {

        return new ResponseEntity<>(userQuoteService.createQuote(createQuoteRequest), HttpStatus.CREATED);

    }

    @GetMapping("/user")
    public ResponseEntity<?> getAllQuote() {
        return new ResponseEntity<>(userQuoteService.getQuotes(), HttpStatus.OK);
    }

}
