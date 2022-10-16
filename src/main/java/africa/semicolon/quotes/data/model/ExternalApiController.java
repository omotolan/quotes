package africa.semicolon.quotes.data.model;

import africa.semicolon.quotes.ExternalApiServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class ExternalApiController {
    private final ExternalApiServiceImpl externalApiServiceImpl;
    @GetMapping("/api")
    public ResponseEntity<?> re() {
        externalApiServiceImpl.getQuoteFromApi();
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getFromDB(){
        return  new ResponseEntity<>(externalApiServiceImpl.getAllApiQuotes(), HttpStatus.OK);

    }
}
