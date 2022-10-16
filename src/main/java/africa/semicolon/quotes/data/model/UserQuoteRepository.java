package africa.semicolon.quotes.data.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserQuoteRepository extends MongoRepository<UserQuotes, String> {
}
