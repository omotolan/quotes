package africa.semicolon.quotes.data.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateQuoteRequest {
    private String text;
    private String author;
}
