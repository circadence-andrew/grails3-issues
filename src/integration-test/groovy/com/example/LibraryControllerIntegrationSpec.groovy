package com.example


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class LibraryControllerIntegrationSpec extends Specification {

  def library

  def setup() {
  }

  def cleanup() {
  }

  def setupData() {
    Library.withNewSession {
      library = new Library(name: 'library')
      library.save(flush: true, failOnError: true)
    }
  }

  // This test fails with a 'No Session found in current thread'
  // HibernateException if the following lines are uncommented in build.gradle.
  // Without these lines, it passes.
  //
  //   compile "org.jadira.usertype:usertype.extended:4.0.0.GA"
  //   compile "org.hibernate:hibernate-entitymanager"
  //
  void "test save"() {
    given:
    setupData()

    expect:
    library != null
  }
}
