// inspired by https://github.com/bjoernjacobs/spring-boot-scala
// some example of spring boot jpa with scala (2016) https://dzone.com/articles/spring-boot-with-scala
// another example (with services) 2017 https://github.com/bjoernjacobs/spring-boot-scala
package example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ScalaBoot {

}

object ScalaBoot extends App {
  SpringApplication.run(classOf[ScalaBoot])
}
