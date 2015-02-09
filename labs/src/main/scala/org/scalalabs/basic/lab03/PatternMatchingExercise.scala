package org.scalalabs.basic.lab03
import sys._
/**
 * This exercise introduces you to the powerful pattern matching features of Scala.
 *
 * Pattern matching can in its essence be compared to Java's 'switch' statement,
 * even though it provides many more possibilites. Whereas the Java switch statmenet
 * lets you 'match' primitive types up to int's, Scala's pattern matching goes much
 * further. Practically everything from all types of objects and Collections
 * can be matched, not forgetting xml and a special type of class called case classes.
 *
 * Pattern matching is also often used in combination with recursive algorithms.
 *
 * For this exercise exclusively use pattern matching constructs in order to make the
 * corresponding unit test work.
 *
 * Reference material to solve these exercises can be found here:
 * Pattern matching in general: http://programming-scala.labs.oreilly.com/ch03.html#PatternMatching
 * Pattern matching in combination with partial functions: http://programming-scala.labs.oreilly.com/ch08.html#PartialFunctions
 */

object PatternMatchingExercise {

  /*************************************************************************
   *  pattern matching exercises
   * For expected solution see unittest @PatternMatchingExerciseTest
   *************************************************************************/

  // Possible inputs: Smalltalk, Clojure, Java, Haskel, C, Scala, Oz
  def describeLanguage(s: String) = {
    // Uncomment and replace the "_" to validate tests
    /*
    s match {
      case _ => "OOP"
      case _ => "Functional"
      case _ => "Hybrid"
      case _ => "Procedural"
      case _ => "Unknown"
    }
    */
    error("fix me")
  }

  def matchOnInputType(in: Any) = {
    // Uncomment and replace the "_" to validate tests
    /*
    case _ => s"A string with length ${s.length}"
    case _ => "A positive integer"
    case _ => s"A person with name: ${p.name}"
    case _ => "Seq with more than 10 elements"
    case _ => s"first: $first, second: $second, rest: $tail"
    case _ => "A Scala Option subtype"
    case _ => "Some Scala class"
    case _ => "A null value"
    case _ => "The default"
     */
    error("fix me")
  }

}

case class Person(name: String, age: Int)