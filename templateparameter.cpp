#include <iostream>
using namespace std;

// class template with multiple parameter
/* 

  template < class T1, class T2>
  class nameofclass{

  }; 
  
*/

template <class T1, class T2>
class myclass
{
public:
    T1 data1;
    T2 data2;

    myclass(T1 a, T2 b)
    {
        data1 = a;
        data2 = b;
    }

    void display()
    {

        cout << this->data1 << endl
             << this->data2 << endl;
    }
};



int main()
{
    myclass<int, char> obj(1, 'c');
    obj.display();

    myclass<int, float> obj1(1, 2.3);
    obj1.display();

    return 0;
}