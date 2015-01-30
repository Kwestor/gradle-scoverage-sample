package org.gradle.sample.impl

import org.scalatest._

class PersonTest extends FlatSpec with Matchers {

  "Person" should "have some names" in {
    val bob: Person = Person("Bob Smith")
    bob.lastName shouldEqual "Smith"
  }

}
