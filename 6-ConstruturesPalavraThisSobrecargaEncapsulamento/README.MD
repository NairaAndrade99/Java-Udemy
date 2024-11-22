### Construtores
>- É uma operação especial da classem, que executa no momento da instanciação do objeto 
>- Usos comuns 
>>- Iniciar valores dos atributos
>>- Permitir ou obrigar que o objeto receba dados/ depências no momento de sua instanciação (injeção de dependência)
> Se um construtor customizar não for especificado, a classe disponibilizar o construtor padrão:
~~~java 
Product = new Product();
~~~
>- É possível especificar mais de um construtor na mesma classe (sobrecarga)

#### Sintaxe 
~~~~java 
public Nome_da_classe(tipo atributo_da_classe....) {

}
~~~~
--------
### This 
*_Serve para referênciar os parametros da classe com os do construtor_*
>- É uma refência para o próprio objeto 
>- Usos comuns:
>>- Diferenciar atributos de varáveis locais 
>>- Passar o próprio objeto como argumento na chamada de um método ou construtor 
~~~~java 
public Nome_da_classe(tipo atributo_da_classe....) {
    this.atributo_da_classe = parametro_do_construtor;
}
~~~~
##### Na main 
~~~~java 
Nome_da_classe  objeto = new Nome_da_classe (variaveis....);
~~~~
----
### Sobrecarga 
+ É um  recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros
+ É possível também incluir um construtor padrão 

#### Sintaxe 
~~~~java 
public Nome_da_classe(tipo atributos_da_classe){
    
}
~~~~
------
### Encapsulamento 
+ É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operções seguras e que mantenham os objetos em um estado consistente 
+ Regra de ouro: Objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso

##### Regra geral básica 
+ Um objeto **NÃO** deve expor nenhum atributo (modificador de acesso **private**)
+ Os atributos devem ser acessados  por meio de métodos _get_ e _set_

#### Sintaxe ~
##### Get
~~~~java 
public tipo get (){
    return;
}
~~~~
##### Set 
~~~~java 
public void set (tipo atributo){
    this.atributo = parametro_do_metodo;
}
~~~~
----
### Modificador de Acesso 
**Private**| O membro só pode ser acessado na **_própria clásse_**
-------|---------|
**Nada**   | O membro só pode ser acessado nas classes do **_mesmo pacote_** 
**Protected** | O membro só pode ser acessado no **_mesmo pacote_**, bem como em **_subclasses de pacotes diferentes_**
**Public** | O membro é acessado por todas classes (ao menos que ele reside em um módulo diferente que não espote o pacote onde ele está)
