#include <iostream>
#include "book.h"

using namespace std;
using namespace bo;

Book book = Book("Title", "Author Name", 5, 3, 50); // price = 3.50, available amount = 5

void printBook() {
  cout
      << "Book Title: " << book.getBookTitle() << "\n"
      << "Book Author: " << book.getBookAuthor() << "\n"
      << "Book Price: " << book.getBookPrice().getDinars() << "." << book.getBookPrice().getPiasteres() << "\n";
}


int main() {

  printBook();

}
