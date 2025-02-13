#include "pessoa.hpp"
#include <iostream>

using namespace std;

// Construtor
Pessoa::Pessoa(const string &nome, const int &idade)
{
    this->nome = nome;
    this->idade = idade;
}

// Os métodos get são constantes, pois não alteram o estado do objeto
string Pessoa::getNome() const
{
    return nome;
}

int Pessoa::getIdade() const
{
    return idade;
}

// Os métodos set não são constantes, pois alteram o estado do objeto
void Pessoa::setNome(const string &nome)
{
    this->nome = nome;
}

void Pessoa::setIdade(const int &idade)
{
    this->idade = idade;
}

// Método para imprimir os dados da pessoa
void Pessoa::imprime() const
{
    cout << "Nome: " << nome << endl;
    cout << "Idade: " << idade << endl;
}

