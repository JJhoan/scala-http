package com.course.course

import org.scalatest._
import org.scalatest.Matchers._

final class CourseTest extends WordSpec with GivenWhenThen {
  "Course" should {
    "greet" in {
      Given("a Course")

      val course = new Course

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = course.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
