package example.controllers

import example.MovieService
import example.domains.Movie
import org.reactivestreams.Publisher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.{DeleteMapping, GetMapping, PathVariable, PostMapping, PutMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(value = Array("/movie"), produces = Array(APPLICATION_JSON_VALUE))
class MovieController @Autowired()(movieService: MovieService) {
  @GetMapping
  def getAll: Publisher[Movie] = movieService.findAll

  @GetMapping(value = Array("/{id}"))
  def getById(@PathVariable(value = "id") id: String): Publisher[Movie] = movieService.findById(id)

  @PostMapping
  def create(@RequestBody movie: Movie): Publisher[Movie] = movieService.save(movie)

  @PutMapping
  def updateMovie(@RequestBody movie: Movie): Publisher[Movie] = movieService.save(movie)

  @DeleteMapping(value = Array("/{id}"))
  def deleteMovieById(@PathVariable(value = "id") id: String): Publisher[Movie] = movieService.deleteById(id)
}
