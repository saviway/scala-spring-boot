package example.repositories

import example.domains.Movie
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

trait MovieRepository extends ReactiveMongoRepository[Movie, String]
