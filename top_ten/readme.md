### How to test GraalVM JIT compiler

1. ```shell
    sdk use java 22.3.r19-grl
2. ```shell 
    make large.txt
3. ```shell
    javac TopTen.java
4. ```shell
    time java TopTen large.txt
5. ```shell
    time java -XX:-UseJVMCICompiler TopTen large.txt
6. ```shell 
    make small.txt
7. ```shell
     /usr/bin/time -v java TopTen small.txt 
8. ```shell
     /usr/bin/time -v java -XX:-UseJVMCICompiler TopTen small.txt   (-l on Mac) 

   