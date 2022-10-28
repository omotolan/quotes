package africa.semicolon.quotes.controller;

import africa.semicolon.quotes.service.ExternalApiService;
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
    private final ExternalApiService externalApiService;
    @GetMapping("/api")
    public ResponseEntity<?> fetchQuoteFromApi() {
        externalApiService.getQuoteFromApi();
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getFromDB(){
        return  new ResponseEntity<>(externalApiService.getAllApiQuotes(), HttpStatus.OK);

    }

}
