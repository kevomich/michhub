#include <iostream>

int main(){
    int marks;

    std::cout <<"enter student's marks: ";
    std::cin >>marks;

    switch(marks){
        case 0 ... 39:
             std::cout<<"fail";
             break;

        case 40 ... 49:
             std::cout<<"pass";
             break;
             
        case 50 ... 69:
             std::cout<<"credit";
             break;
            
        case 70 ... 100:
             std::cout<<"distinction";
             break;
             
        default:
             std::cout<<"invalid";

    }
        return 0;
}