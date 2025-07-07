## *_Enumerações_*
* É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas 
* Palavra chave em Java: enum
* Vantagem: melhor semântica, código mais legível e auxiliado pelo compiladoz

~~~java
 public enum OrderStatus {
 PENDING_PAYMENT, 
PROCESSING, 
SHIPPED, 
DELIVERED;
 }

import entities.enums.OrderStatus;
 public class Order {
 private Integer id;
 private Date moment;
 private OrderStatus status;
 (...)
 }
 ~~~
----------------
## *_Conversão de String para enum_*
~~~~java 
 OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
 ~~~~
 ------
##  Categorias de classes
* Em um sistema orientado a objetos, de modo geral "tudo" é objeto.
* Por questões de design tais como organização, flexibilidade, reuso, delegação, etc., há várias categorias de classes:

classes|
-------|
Views 
Entities
Controllers
Service 
Repositories
-----
## Composição
* É um tipo de associação que permite que um objeto contenha outro
* Relação "tem-um" ou "tem-vários"
* Vantagens
  - Organização: divisão de responsabilidades
  - Coesão
  - Flexibilidade
  - Reuso
* Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição qualquer associação tipo "tem-um" e "tem-vários".
 
