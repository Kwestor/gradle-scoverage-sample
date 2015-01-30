package org.gradle.sample.impl

import org.gradle.sample.api.PersonLike

/**
 * Immutable implementation of [[org.gradle.sample.api.PersonLike]].
 */
case class Person(private val name: String) extends PersonLike {
  def firstName: String = name.split(" ")(0)
  def lastName: String = name.split(" ")(1)
}
