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
### Bloco finally 
* É um bloco que contem codigo a ser executado independentemente de ter ocorrido ou não uma exceção 
* Exemplo classico: fechar uma arquivo, conexão de banco de dados, ou outro recurso especifico ao final do processamento

#### Sintaxe
~~~ java 
try{

}catch(ExceptionType e ){

}finally{

}
~~~~