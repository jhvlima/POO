#include <string>

using namespace std;

class Pessoa
{
    string nome;
    int idade;
public:
    Pessoa(const string& nome, const int& idade);
    void setNome(const string& nome);
    string getNome() const;
    void setIdade(const int& idade);
    int getIdade() const;
};