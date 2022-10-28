package africa.semicolon.quotes.dto;

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
