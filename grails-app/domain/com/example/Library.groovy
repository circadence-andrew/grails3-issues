package com.example

import groovy.transform.EqualsAndHashCode 

@EqualsAndHashCode
class Library {

  String name

  static hasMany = [books: Book]

  static constraints = {
    books(nullable: true)
  }
}
