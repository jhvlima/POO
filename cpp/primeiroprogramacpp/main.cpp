#include <iostream>
#include <string>
using namespace std;

#include "pessoa.hpp"

void imprimePessoa(const Pessoa& pessoa)
{
    cout << pessoa.getNome() << ", idade=" << pessoa.getIdade() << endl;
}

int main()
{
    Pessoa maria("Maria",21);
    Pessoa joana("Joana",22);
    imprimePessoa(maria);
    imprimePessoa(joana);
    joana=maria;            // copia os atributos todos de maria para joana
    imprimePessoa(joana);   // veja que imprime Maria, idade=21
    string s = "Fernanda";
    maria.setNome(s);       // não altera o nome de joana
    s = "asdghjadsjhk";     // e não afetará no nome de maria
    imprimePessoa(maria);   // veja que imprime Fernanda, idade=21
}