package com.example

class BookCmd {
  Book book
}

class LibraryController {
  def save(Library library, BookCmd cmd) {
    library.addToBooks(cmd.book)
    library.save(flush: true, failOnError: true)
  }
}
