package example

import example.repositories.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.{Flux, Mono}
import example.domains.Movie

@Service
class MovieService @Autowired()(movieRepository: MovieRepository) {

  /**
   * find all movies
   * @return Flux[Movie]
   */
  def findAll: Flux[Movie] = movieRepository.findAll()

  /**
   * Find a movie by id
   * @param id
   * @return Mono[Movie]
   */
  def findById(id: String): Mono[Movie] = movieRepository.findById(id)

  /**
   * Save a movie to database
   * @param movie
   * @return
   */
  def save(movie: Movie): Mono[Movie] = movieRepository.save(movie)


  /**
   * Delete a movie by id
   * @param id
   * @return
   */
  def deleteById(id: String): Mono[Movie] = {
    movieRepository.findById(id)
      .flatMap(movie => movieRepository.deleteById(movie.id).thenReturn(movie))
  }
}
