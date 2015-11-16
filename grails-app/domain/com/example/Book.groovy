package com.example

class Book {

  String name

  static belongsTo = [library: Library]

  static constraints = {
    library(nullable: false)
  }
}
