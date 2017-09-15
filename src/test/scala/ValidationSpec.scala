import io.github.hamsters.Validation
import Validation._
import org.scalatest._


//Very simple test to ensure the lib is loaded from dependency
class ValidationSpec extends FlatSpec with Matchers {

  "Validation" should "give failures" in {
    val e1 = OK(1)
    val e2 = KO("nan")
    val e3 = KO("nan2")

    Validation.failures(e1,e2,e3) should be(List("nan", "nan2"))
  }

}
