package africa.semicolon.quotes.data.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Wrapper {
    private String message;
    private int status;
    private int count;
    private List<Quotes> quotes;
}


