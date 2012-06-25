import org.scalatest.Tag
import org.scalatest.FunSuite

class ExampleSuite extends FunSuite {

  test("Some passing test") {
    assert(true) //easy
  }

  test("Some no passing Filtered test", Tag("com.mycompany.tags.BadTest") ) {
    assert(false)
  }
}


