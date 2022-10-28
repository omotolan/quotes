package africa.semicolon.quotes.data.repository;

import africa.semicolon.quotes.data.model.UserQuotes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserQuoteRepository extends MongoRepository<UserQuotes, String> {
}
