all: pessoa.o main.o pessoa.hpp
	g++ -o main pessoa.o main.o

pessoa.o: pessoa.cpp pessoa.hpp
	g++ -c -o pessoa.o pessoa.cpp

main.o: main.cpp pessoa.hpp
	g++ -c -o main.o main.cpp

clean: 
	rm -f *.o
