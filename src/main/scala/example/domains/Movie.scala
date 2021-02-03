package example.domains

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id

import scala.beans.BeanProperty

@Document(value = "/movies")
case class Movie(
  @Id
  @BeanProperty
  id: String,

  @BeanProperty
  name: String,

  @BeanProperty
  year: Int
)
