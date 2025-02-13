# Java

### Compilando Simples
```bash    
javac -d bin/ src/*.java
```

> Deve existir o diretório `bin`

Executando
```bash
java -d bin/ App
```

## Usando Jar
Compilando
```bash
javac -d bin/ src/*.java 
jar -cfm App.jar MANIFEST.MF bin/*.class
```
> Deve existir o arquivo `MANIFEST.MF` e o diretório `bin` com os .jar atualizados

Executando
```bash
java -jar App.jar
```
