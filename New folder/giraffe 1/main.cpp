#include <iostream>

using namespace std;

int main()
{
    string charactername = "tom";
    int characterage = 40;
    cout << "there once was a man named "<<charactername<< endl;
    cout << "he was "  <<characterage<< " years old"<<endl;
    charactername ="mike";
    cout << "he liked the name "<<charactername<<endl;
    cout<<"but did not like being "<<characterage<<endl;
    return 0;
}
