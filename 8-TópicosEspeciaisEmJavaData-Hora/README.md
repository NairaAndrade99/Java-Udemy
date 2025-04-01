## DATA-HORA
### Conceitos importantes
>-  Data-[hora] local: 
>>- ano-mês-dia-[hora] sem fuso horário
>>- [hora] opcional
>-  Data-hora global: 
>>- ano-mês-dia-hora com fuso horário
>-  Duração: 
>>- tempo decorrido entre duas data-horas
--------
### *_Quando usar?_*
>-   Data-[hora] local: 
>>-  Quando o momento exato não interessa a pessoas de outro fuso horário.
>>-  Uso comum: sistemas de região única, Excel.
>>>- Data de nascimento: "15/06/2001"
>>>- Data-hora da venda: "13/08/2022 às 15:32" (presumindo não interessar fuso horário)
>- Data-hora global: 
>>- Quando o momento exato interessa a pessoas de outro fuso horário.
>>- Uso comum: sistemas multi-região, web.
>>>- Quando será o sorteio? "21/08/2022 às 20h (horário de São Paulo)"
>>>- Quando o comentário foi postado? "há 17 minutos"
>>>- Quando foi realizada a venda? "13/08/2022 às 15:32 (horário de São Paulo)"
>>>- Início e fim do evento? "21/08/2022 às 14h até 16h (horário de São Paulo)"
------
### *_Timezone(fuso horário)_*
>- GMT -Greenwich MeanTime
>>- Horário de Londres
>>- Horário do padrão UTC -CoordinatedUniversal Time
>>- Também chamado de "Z" time, ou Zulu time
>- Outros fuso horários são relativos ao GMT/UTC:
>>- São Paulo: GMT-3
>>- Manaus: GMT-4
>>- Portugal: GMT+1
>- Muitas linguagens/tecnologias usam nomes para as timezones:
>>- "US/Pacific"
>>- "America/Sao_Paulo"
>>- etc.
-----
 ### *_Operações importantes com data-hora_*
 >- Instanciação
 >>- (agora) ➞Data-hora
 >>- Texto ISO 8601 ➞Data-hora
 >>- Texto formato customizado ➞Data-hora
 >>- dia, mês, ano, [horário] ➞Data-hora local
 >- Formatação
 >>- Data-hora ➞Texto ISO 8601
 >>- Data-hora ➞Texto formato customizado
 -------
 ### *_Operações importantes com data-hora_*
 >- Converter data-hora global para local
 >>- Data-hora global, timezone(sistema local) ➞Data-hora local
 >- Obter dados de uma data-hora local
 >>- Data-hora local ➞dia, mês, ano, horário
 >- Cálculos com data-hora
 >>- Data-hora +/-tempo ➞Data-hora
 >>- Data-hora 1, Data-hora 2 ➞Duração
 -------
 ### *_Principais tipos Java (versão 8+)_*
 >- Data-hora local
 >>- LocalDate
 >>- LocalDateTime
 >- Data-hora global
 >>- Instant
 >- Duração
 >>- Duration
 >- Outros
 >>- ZoneId
 >>- ChronoUnit
 -------
 ### Demo 
 #### Instanciar (agora) ➞Data-hora
 ~~~~java 
 LocalDate agora = LocalDate.now();
 ~~~~
 #### Saída 
 `ano-mes-dia`

 ~~~~java 
 LocalDateTime agora = LocalDateTime.now();
 ~~~~
 #### Saída 
 `ano-mes-diaThora:minuto:seguntos.fração`

 ~~~~java 
 Instant agora = Instant.now();
 ~~~~
 #### Saída 
 `ano-mes-diaThora:minuto:seguntos.fraçãoZ`

 ~~~~java 
 LocalDate agora = LocalDate.parse("ano-mes-dia");
 ~~~~
 #### Saída 
 `ano-mes-dia`
 
 ~~~~java 
 LocalDateTime agora = LocalDateTime.parse("ano-mes-diaThora:minuto:segundos");
 ~~~~
 #### Saída 
 `ano-mes-diaThora-minuto-seguntos`

 ~~~~java 
 Instant agora = Instant.parse("ano-mes-diaThora:minuto:segundosZ");
 ~~~~
 #### Saída 
 `ano-mes-diaThora-minuto-seguntosZ`

 ~~~~java 
 LocalDate agora = LocalDate.parse("ano/mes/dia");
 ~~~~
 #### Saída 
 `Error !`

 ~~~~java 
 DateTimeFormatter formatado = DataTimeFormatter.ofPattern("dd/MM/yyyy")
 LocalDate agora = LocalDate.parse("ano/mes/dia", formatado);
 ~~~~
 #### Saída 
 `ano-mes-dia`

 ~~~~java 
 LocalDate agora = LocalDate.of(ano, mes, dia);
 ~~~~
 #### Saída 
 `ano-mes-dia`
 
 -------
 #### Formatação em texto 
 ~~~~java 
 DateTimeFormatter agora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 ~~~~
 #### Saída 
 `dia-mes-ano`

 ~~~~java 
 DateTimeFormatter agora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
 ~~~~
 #### Saída 
 `dia-mes-ano HH:mm`

 * Global 
 ~~~~java 
 DateTimeFormatter agora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").whithZone(ZoneId.systemDefault());
 ~~~~
 #### Saída 
 `dia-mes-ano HH:mm`

 --------
 #### Converter data-hora global para data-hora local 
 ~~~~java 
 Instant agora = Instant.parse("ano-mes-diaThora:minuto:segundos");
 LocalDate convert = LocalDate.ofInstant(agora,ZoneId.of("País"));
 ~~~~
 #### Saída 
 `ano-mes-dia`

 #### Buscar somente o dia
 ~~~~java 
 getDayOfMonth();
 ~~~~
 #### Buscar somente o mês 
 ~~~~java 
 getMonthValue();
 ~~~~
 #### Buscar somente o ano 
 ~~~~java 
 getYear();
 ~~~~
 #### Buscar somente a hora 
 ~~~~java 
 getHour();
 ~~~~
 #### Buscar somente o meninuto 
 ~~~~java
 getMinute();
 ~~~~

 ------
 ### Calculos com data-hora

 #### Data anterior 
 ~~~~java 
 LocalDate past = agora.minusDays(7);
 ~~~~
 #### Saída
  `dia-mes-ano`

#### Proximo data 
~~~java 
LocalDate next = agora.plusDays(7);
~~~
#### Saída
  `dia-mes-ano`

#### data-horario anterior 
~~~~java 
 LocalDateTime past = agora.minusDays(7);
 ~~~~
 #### Saída
  `dia-mes-anoThh:mm:ss`

#### Proximo data-horario
~~~java 
LocalDateTime next = agora.plusDays(7);
~~~
#### Saída
  `dia-mes-anoThh:mm:ss`

#### Data-hora anterior
~~~~java 
 Instant past = agora.minus(7, chronoUnit.DAY);
~~~~
#### Saída
  `dia-mes-anoThh:mm:ssZ`

#### Proximo data 
~~~java 
Instant next = agora.PLUS(7, chronoUnit.DAY);
~~~
#### Saída
  `dia-mes-anoThh:mm:ssZ`

#### Calcular a duração entre duas data-hora 
~~~~java
Duratio duração = Duration.between(past.atStartOfDay(0,0),agora.atTime(0,0));
~~~~




