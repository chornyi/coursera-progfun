package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  test("adding ints") {
    assert(1 + 2 === 3)
  }

  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  test("s1 contains 1") {
    new TestSets {
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("s1 does not contain 2") {
    new TestSets {
      assert(!contains(s1, 2), "Singleton")
    }
  }

  test("union contains all elements") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }

  test("intersection") {
    new TestSets {
      val s = union(s1, s2)
      val inter = intersect(s, s1)
      assert(contains(inter, 1), "Union 1")
      assert(!contains(inter, 2), "Union 2")
    }
  }

  test("diff") {
    new TestSets {
      val s = union(s1, s2)
      val d = diff(s, s1)
      assert(!contains(d, 1), "Union 1")
      assert(contains(d, 2), "Union 2")
    }
  }
  
  test("filter") {
    new TestSets {
      val s = union(s1, s2)
      val f = filter(s, n => n > 1)
      assert(!contains(f, 1), "Union 1")
      assert(contains(f, 2), "Union 2")
    }
  }
  
  test("forall") {
    new TestSets {
      val s = union(s1, s2)
      val f = forall(s, n => n > 0)
      val f1 = forall(s, n => n > 1)
      assert(f, "1")
      assert(!f1, "2")
    }
  }
  
  test("exists") {
    new TestSets {
      val s = union(s1, s2)
      val f = exists(s, n => n > 1)
      val f1 = exists(s, n => n > 2)
      assert(f, "1")
      assert(!f1, "2")
    }
  }
  
  test("map") {
    new TestSets {
      val s = union(s1, s2)
      val f = FunSets.map(s, n => n * n)

      assert(contains(f, 1), "1")
      assert(contains(f, 4), "2")
      assert(!contains(f, 2), "3")
    }
  }
}
