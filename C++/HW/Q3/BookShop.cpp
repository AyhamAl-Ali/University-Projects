#include <iostream>
#include "BookShop.h"

using namespace std;
using namespace bs; // BookShop
using namespace bo; // Book

int main() {

    BookShop bookShop = BookShop(5, 0); // 5 max books, 0 current

    cout << "isEmpty: " << boolalpha << bookShop.isEmpty() << endl; // boolalpha will allow outputting 'true', 'false' instead of '1', '0', use 'noboolalpha' to use 1 and 0 instead
    cout << "isFull: " << boolalpha << bookShop.isFull() << endl;

    cout << "findTitle (test): " << bookShop.findTitle("test") << endl;

    bookShop.addBook(Book("TITLE", "AUTHOR", 3, 5, 60));

    cout << "findTitle (TITLE): " << bookShop.findTitle("TITLE") << endl;

    cout << "isEmpty: " << boolalpha << bookShop.isEmpty() << endl;

    bookShop.library();

    cout << "isEmpty: " << boolalpha << bookShop.isEmpty() << endl;

    cout << "findTitle (TITLE): " << bookShop.findTitle("TITLE") << endl;
}
