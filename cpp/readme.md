# C++

- class é um espaço de memória como uma struct em C com atributos privados e funções membro  

- spacename é como os pacotes em java

- :: é a 

## Passagem por referência
existe passagem por referencia `constante` em que os valores não serão alterdos por funções membro

``` cpp
// passsgem por referencia
void incrementa(int& x)
{
    x++;
}

// passsgem por referencia constante
void imprimeProximo(const int& x)
{
    x++;
    cout << "%d", x << endl;
}

int main()
{
    int valor = 0;
    imprimeProximo(valor); // valor == 1
    inrementa(valor); // valor == 1
}
```