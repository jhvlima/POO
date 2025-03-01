#include "pessoa.hpp"
#include <iostream>

Pessoa::Pessoa(const string& nome, const int& i)
{
    this->nome=nome;
    this->idade=i;
    cout << "Criado objeto do tipo pessoa com nome " << nome << endl;
}

void Pessoa::setNome(const string& nome)
{
    this->nome=nome;
}
string Pessoa::getNome() const
{
    return this->nome;
}
void Pessoa::setIdade(const int& idade)
{
    this->idade=idade;
}
int Pessoa::getIdade() const
{
    return this->idade;
}
