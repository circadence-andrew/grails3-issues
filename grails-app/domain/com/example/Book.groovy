package com.example

import groovy.transform.EqualsAndHashCode 

@EqualsAndHashCode
class Book {

  String name

  static belongsTo = [library: Library]

  static constraints = {
    library(nullable: false)
  }
}
