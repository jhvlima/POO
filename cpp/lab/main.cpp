#include <iostream>
#include <map>
#include "departamento.hpp"

using namespace std;

int main(){
    map<int, Departamento*> departamentos;
    Departamento *d1 = new Departamento("dep1", 1);
    Departamento *d2 = new Departamento("dep2", 2);
    Departamento *d3 = new Departamento("dep3", 3);

    departamentos.insert(pair<int,Departamento*>(1, d1));
    departamentos.insert(pair<int,Departamento*>(2, d2));
    departamentos.insert(pair<int,Departamento*>(3, d3));

    for(pair<int,Departamento*> mapPair: departamentos)
    {
        cout << mapPair.second->getNome() << endl;
    }

    delete d1, d2, d3;
    return 0;
}