#include "Departamento.hpp"
   
Departamento::Departamento(string nome, int id)
{
    this->nome=nome;
    this->id=id;
}

string Departamento::getNome() const
{
    return this->nome;
}