all: main

main: pessoa.o main.o
	g++ -o main pessoa.o main.o

pessoa.o: pessoa.cpp pessoa.hpp
	g++ -c -o pessoa.o pessoa.cpp

main.o: main.cpp pessoa.hpp
	g++ -c -o main.o main.cpp

clean:
	rm *.o
	rm main
