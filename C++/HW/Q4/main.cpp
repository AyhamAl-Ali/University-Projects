#include <iostream>
#include "../Q3/BookShop.h"

using namespace std;
using namespace bo;
using namespace bs;

const int SIZE = 8;

BookShop *bShop = new BookShop[10];


void printBookTitles(const BookShop &bookShop) {

    for(int i = 0; i < sizeof(*bookShop.booksPtr) / sizeof(bookShop.booksPtr[0]); i++) {
        
        cout
            << "> Book Title (" << i << "): " << bookShop.booksPtr[i].getBookTitle() << "\n"
            << "> Book Author (" << i << "): " << bookShop.booksPtr[i].getBookAuthor() << "\n"
            << "> Book Price (" << i << "): " << bookShop.booksPtr[i].getBookPrice().getDinars() << "." << bookShop.booksPtr[i].getBookPrice().getPiasteres() << "\n\n";
    }

}


void BookShop::adjustMaxNumTitles(int n) {
    int size = sizeof(*booksPtr) / sizeof(booksPtr[0]);

    BookShop old_data = bShop.booksPtr;
    BookShop new_data = new BookShop[size+n];

    for(int i = 0; i < size; i++) {
        new_data[i] = old_data[i];
    }

    bShop.booksPtr = new_data;
}




int main() {

    Book booksArray = new Book[SIZE];

    for(int i = 0; i < SIZE; i++) {

        string title, author;
        int count, dinars, piasters;

        cout << "Enter Title of book (" << i << "): ";
        cin>> title;

        cout << "Enter Author of book (" << i << "): ";
        cin>> author;

        cout << "Enter Available Amount of book (" << i << "): ";
        cin>> count;

        cout << "Enter Price (Dinars part only) of book (" << i << "): ";
        cin>> dinars;

        cout << "Enter Price (Piasters part only) of book (" << i << "): ";
        cin>> piasters;

        cout << endl; // extra empty line for styling

        booksArray[i] = new Book(title, author, count, dinars, piasters);

    }



    for(int i = 0; i < SIZE; i++) {
        bShop[i].addBook(booksArray[i]);
    }


    bShop.addBook(booksArray[2]);


    adjustMaxNumTitles(5);


    cout << "Seraching in bShop list for the 4th Book in booksArray of Title (" << booksArray[3].getBookTitle() << endl;
    cout << "Results: " << bShop.findTitle(booksArray[3].getBookTitle()) << endl;





    }
