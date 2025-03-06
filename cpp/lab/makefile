all: main

main: Departamento.o main.o
	g++ -o main Departamento.o main.o

Departamento.o: Departamento.cpp Departamento.hpp
	g++ -c -o Departamento.o Departamento.cpp

main.o: main.cpp Departamento.hpp
	g++ -c -o main.o main.cpp

clean:
	rm *.o
	rm main
