#include <iostream>
#include "price.h"

using namespace std;
using namespace pr;

namespace bo {

  class Book {

    private:
        string book_title;
        string book_author;
        mutable int book_count; // mutable so that const Book can use modifyBookCount function
        Price book_price;

    public:
      Book() {};
      Book(string book_title, string book_author, int book_count, int dinars, int piasters) {
        this->book_title = book_title;
        this->book_author = book_author;
        this->book_count = book_count;
        this->book_price = Price(dinars, piasters);
      };

      // Setters

      void setBookTitle(string book_title) {
        this->book_title = book_title;
      }

      void setBookAuthor(string book_author) {
        this->book_author = book_author;
      }

      void setBookCount(int book_count) {
        this->book_count = book_count;
      }

      void setBookPrice(int dinars, int piasters) {
        this->book_price = Price(dinars, piasters);
      }

      // Getters

      string getBookTitle() const { // const so that it can be used in const Book
        return book_title;
      }

      string getBookAuthor() const
      {
        return book_author;
      }

      int getBookCount() const
      {
        return book_count;
      }

      Price getBookPrice() const {
        return book_price;
      }

      void modifyBookCount(int n) const { // const so that it can be used in const Book
        this->book_count += n; // n can be + or -
      };

      void printBook(); // members function, prints (title, author, and price)

  };

};
