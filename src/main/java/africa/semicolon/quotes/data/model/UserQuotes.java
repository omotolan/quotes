package africa.semicolon.quotes.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "UserQuotes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserQuotes {
    @Id
    private String id;
    private String text;
    private String author;

}
