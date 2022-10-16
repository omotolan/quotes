package africa.semicolon.quotes.data.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;

@Document(collection = "Quotes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quotes  {
    @Id
    private String id;
    private String text;
    private String author;

}
