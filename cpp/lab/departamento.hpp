#if !defined(DEPARTAMENTO_HPP)
#define DEPARTAMENTO_HPP

#include <string>

using namespace std;

class Departamento
{
    int id;
    string nome;
public:
    Departamento(string nome, int id);
    string getNome() const;
};

#endif