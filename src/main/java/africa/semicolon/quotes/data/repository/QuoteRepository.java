package africa.semicolon.quotes.data.repository;

import africa.semicolon.quotes.data.model.Quotes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuoteRepository extends MongoRepository<Quotes, String> {
}
