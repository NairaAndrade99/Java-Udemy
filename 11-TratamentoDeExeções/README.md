## Tratamento de Exceções
#### Exceçoes 
* Uma exceçao é qualquer condiçao de erro ou comportamento inesperado encontrado por um programa em exceçao 
* Quando lança, uma exceçao é propagada na pilha de chamadas de métodos em excecuçao, até que seja capturada (tratada)  ou o programa seja encerrado

### Estrutura TRY-CATCH
#### Bloco try 
* Contem o código que representa a execuçao normal do trecho de codigo que pode acarretar em uma execuçao 
#### Bloco catch 
* Contem o codigo a ser executado caso uma exceçao ocorre 
* Deve ser especificado o tipo da exceçao a ser tratada (upcasting é permitido)

#### Sintaxe 
~~~java 
try{

}catch(ExceptionType e){

}catch(ExceptionType e){

}
~~~
### Pilha de chamda de método 
#### A pilha de chamadas de método (ou call stack) em Java é uma estrutura de dados que gerencia a ordem em que os métodos são chamados e retornam durante a execução de um programa. É usada pela Java Virtual Machine (JVM) para controlar a execução dos métodos e manter o rastreamento do ponto de retorno após cada chamada.
~~~java 
public class Exemplo {

    public static void main(String[] args) {
        metodoA(); // 1ª chamada
    }

    static void metodoA() {
        metodoB(); // 2ª chamada
    }

    static void metodoB() {
        metodoC(); // 3ª chamada
    }

    static void metodoC() {
        System.out.println("Estamos no método C");
    }
}
~~~
### Bloco finally 
* É um bloco que contem codigo a ser executado independentemente de ter ocorrido ou não uma exceção 
* Exemplo classico: fechar uma arquivo, conexão de banco de dados, ou outro recurso especifico ao final do processamento

#### Sintaxe
~~~ java 
try{

}catch(ExceptionType e ){

}finally{

}
~~~

## Criando exceções personalizadas 