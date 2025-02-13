#include <string>

using namespace std;

class Pessoa
{
private:
    string nome;
    int idade;

public:
    // Construtor
    Pessoa(const string &nome, const int &idade);
    // Os métodos get são constantes, pois não alteram o estado do objeto
    string getNome() const;
    int getIdade() const;
    // Os métodos set não são constantes, pois alteram o estado do objeto 
    void setNome(const string &nome);
    void setIdade(const int &idade);
    // Método para imprimir os dados da pessoa
    void imprime() const;
};