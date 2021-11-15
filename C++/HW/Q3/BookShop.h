#include <iostream>
#include <algorithm>
#include "../Q2/book.h"

using namespace std;
using namespace pr;
using namespace bo;

namespace bs {

  class BookShop {

    private:
        int max_num_titles; // must be +
        Book *booksPtr;
        int current;

    public:
        friend void printBookTitles(const BookShop &bookShop);

    /* // testing
    void test() // print all added books
    {
        cout << sizeof(*booksPtr) / sizeof(booksPtr[0]) << endl;
        for (int i = 0; i < sizeof(*booksPtr) / sizeof(booksPtr[0]); i++)
        {
            cout
                << "> Book Title (" << i << "): " << booksPtr[i].getBookTitle() << "\n"
                << "> Book Author (" << i << "): " << booksPtr[i].getBookAuthor() << "\n"
                << "> Book Price (" << i << "): " << booksPtr[i].getBookPrice().getDinars() << "." << booksPtr[i].getBookPrice().getPiasteres() << "\n\n";
        };
    };*/

    public:
        BookShop() {
            max_num_titles = 10;
            current = 0;
            booksPtr = new Book[max_num_titles];
        };

        BookShop(int max_num_titles, int current)
        {
            if (max_num_titles < 0)
            {
                cout << "ERROR: Max number of titles value must be greater than 0." << endl;
                return;
            };

            if (current < 0)
            {
                cout << "ERROR: Current title value must be greater than or equal to 0." << endl;
                return;
            };

            this->max_num_titles = max_num_titles;
            this->current = current;

            booksPtr = new Book[max_num_titles];
        };

        void library() // reset library data
        {
            delete[] booksPtr;
            current = 0;
        };


        bool isEmpty()
        {
            if (current == 0)
            {
                return true;
            }
            else
            {
                return false;
            };
        };
        
        bool isFull()
        {
            if (current == max_num_titles) { return true;}
            else {return false;};
        };

        int findTitle(string title) {
            
            for(int i = 0; i < sizeof(*booksPtr) / sizeof(booksPtr[0]); i++) {
                //cout << i << " VALUE: " << booksPtr[i].getBookTitle() << endl;
                if (booksPtr[i].getBookTitle() == title) { return i;}
            }
            return -1; // reached if for loop did not return
        };

        void addBook(const Book & b) {
            cout << b.getBookTitle() << endl;
            if ( current < max_num_titles && findTitle( b.getBookTitle() ) == -1 ) { // not full & not found
                booksPtr[current] = b; // current = the current empty index
                current++;
                cout << "TEST1" << endl;
                return;
            }
            else if (findTitle( b.getBookTitle() ) != -1) {
                b.modifyBookCount(1);
                cout << "Updated Book count to " << b.getBookCount() <<  " copy/ies of book title: " << b.getBookTitle() << endl;
                return;
            }
            else if (current == max_num_titles && findTitle(b.getBookTitle()) == -1) {
                cout << "ERROR: Failed to add book. Library is full." << endl;
                return;
            };
        };

        // member function ( a member function to increase/resize the size of the
        // dynamic array pointed to by booksPtr by the amount n without losing its original contents.
        // The function must also update max_num_titles accordingly. )
        void adjustMaxNumTitles(int n);

    
    };

};
