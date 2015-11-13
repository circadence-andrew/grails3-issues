package com.example

import grails.test.mixin.*
import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LibraryController)
@Mock([Library, Book])
class LibraryControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    // This test fails with a StackOverflowError due to the @EqualsAndHashCode
    // annotations on Library and Book.  Excluding the relationship from one or
    // the other (ex. @EqualsAndHashCode(excludes=['library'])) resolves the
    // issue.
    void "test save"() {
      given:
      request.contentType = FORM_CONTENT_TYPE
      request.method = 'POST'
      params.name = 'library'
      params.cmd = [book:[name: 'book']]

      when:
      controller.save()

      then:
      Book.count() == 1
    }
}
