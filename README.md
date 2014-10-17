PROBLEMA B
Índice Carrasco Mamata

Nome do arquivo: mamata.c ou mamata.cpp

Os estudantes da Universidade Federal dos Senhores Carrascos (UFSCar) passam por uma situação muito estressante todo início de semestre. Esses alunos precisam se inscrever nas disciplinas que irão cursar e dependendo das escolhas feitas, o semestre pode se tornar excessivamente carrasco. 

Para auxiliá-los nessa importante tarefa, os estudantes coletaram alguns dados sobre as disciplinas ofertadas nos anos anteriores e criaram o índice CM. O índice CM é um valor inteiro de 0 a 100, que classifica as ofertas de disciplinas como carrascas, quando próximo de 0, ou mamatas, quando próximo de 100. 
O índice CM foi calculado para todas as ofertas de todas as disciplinas e agora os alunos procuram se matricular, prioritariamente, nas disciplinas com alto valor de CM, ou seja, nas disciplinas mais mamatas.

Em posse da lista de ofertas de disciplinas que um aluno pode se matricular no semestre, sua tarefa é descobrir qual o maior valor acumulado de CM que esse aluno pode conseguir, matriculando-se no maior número de disciplinas possível. O CM acumulado é obtido somando-se todos os índices CM das disciplinas que o aluno se matricula. Cada disciplina é oferecida em um horário fixo semanal.

Entrada

A primeira linha de entrada contém um número inteiro D (1 = D < 80.000), indicando o número de ofertas de disciplinas. 
Cada uma das D linhas seguintes contêm quatro campos: S (S = { seg | ter | qua | qui | sex | sab | dom }), C (8 = C = 22), F (9 = F = 23) e I (0 = I = 100), em que S indica o dia da semana, C e F indicam a hora de início e a hora de término, respectivamente, e I indica o índice CM da oferta da disciplina.
Os campos C, F e I são números inteiros.

Saída

Seu programa deve produzir uma única linha, contendo o maior CM acumulado possível para se inscrever no maior número de disciplinas possível.

Exemplos

Entrada:
5
seg 8 12 20
seg 8 12 80
ter 14 18 30
ter 16 18 60
qui 10 12 10

Saída:
150