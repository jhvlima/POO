#include <iostream>
#include "pessoa.hpp"

using namespace std; 

int main() {
    std::cout << "Hello, World!" << std::endl;
    cout << "Hello, World!" << endl;

    Pessoa p1("João", 20);
    p1.imprime();

    return 0;
}