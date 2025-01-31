// #include<iostream>
// using namespace std;
// class Complex{
//     int a;
//     int b;
//     public:
//    Complex(){}
//     Complex(int a,int b){
//         this->a=a;
//         this->b=b;
//     }
//     friend void display(Complex obj);
//     Complex operator+(Complex obj){
//        Complex obj1;
//        obj1.a=obj.a+this->a;
//        obj1.b=obj.b+this->b;
//        return obj1;
//     }
     
// };
// void display(Complex obj){
//     cout<<"The sum of Complex:"<<obj.a<<"+"<<obj.b<<"i";
// }
// int main(){
//    Complex a(4,8);
//    Complex b(5,10);
//    Complex c=a+b;
//    display(c);

// }


// #include<iostream>
// using namespace std;
// class Box{
//     int a;
//     int b;
//     public:
//     Box(){};
//     friend void setvalue(int a,int b);
//     void display(){
//         cout<<a<<"+"<<b;
//     }
// };
// void setvalue(int a,int b){
//     this->a=a;
//     this->b=b;
// }
// int main(){
// Box b;
// b.setvalue(5,8);
// b.display();
// }
// #include<iostream>
// using namespace std;
// class Base{
//     protected:
//     int a;
//     public:
//     Base(int a){
//         this->a=a;
//     }
//     int area(){
//         return 3.14*a*a;
//     }
// };
// class Child:public Base{
// int b;
//  public:
//  Child(int a,int b):Base(a){
//     this->b=b;
//  }
//  int area(){
//     return a*b;
//  }
// };
// int main(){
// Child ch(2,3);
// cout<<ch.area();

// }

// #include<iostream>
// using namespace std;
// class Animal{
//     protected:
//     int a;
//     public:
//     Animal(int a){
//         cout<<a;
//     }
// };
// class Dog:public Animal{
//     protected:
//     int b;
//     public:
//     Dog(int a,int b):Animal(a){
//         cout<<a+b;
//     }
// };

// int main(){
// Dog g(5,6);

// }

// #include<iostream>
// using namespace std;
// class Base{
//     private:
//     int a;
//     int b;
//     public:
//     Base(int a,int b){
//         this->a=a;
//         this-> b=b;
//     }
//     friend void display(Base &obj);

// };
// void display(Base &obj){
//     cout<<obj.a<<"+"<<obj.b;
// }
// int main(){
//     Base vis(2,3);
//     display(vis);
// }

#include<iostream>
using namespace std;
class Base{
    protected:
    int a;
    public:
    Base(int a){
        this->a=a;
    }
    virtual void display()=0;
};
class Child:public Base{
    private:
    int b;
    public:
    Child(int a,int b):Base(a){
     this->b=b;
    }
    void display(){
        cout<<a<<" "<<b;
    }
};
int main(){
    Base *ptr;
    Child ch(5,6);
    ptr=&ch;
    ptr->display();

}
