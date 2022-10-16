package africa.semicolon.quotes.data.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuoteDto {
    private String message;
    public QuoteDto(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "QuoteDto{" +
                "message='" + message + '\'' +
                '}';
    }
}
