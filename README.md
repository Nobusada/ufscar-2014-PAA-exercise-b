PROBLEMA B
�ndice Carrasco Mamata

Nome do arquivo: mamata.c ou mamata.cpp

Os estudantes da Universidade Federal dos Senhores Carrascos (UFSCar) passam por uma situa��o muito estressante todo in�cio de semestre. Esses alunos precisam se inscrever nas disciplinas que ir�o cursar e dependendo das escolhas feitas, o semestre pode se tornar excessivamente carrasco. 

Para auxili�-los nessa importante tarefa, os estudantes coletaram alguns dados sobre as disciplinas ofertadas nos anos anteriores e criaram o �ndice CM. O �ndice CM � um valor inteiro de 0 a 100, que classifica as ofertas de disciplinas como carrascas, quando pr�ximo de 0, ou mamatas, quando pr�ximo de 100. 
O �ndice CM foi calculado para todas as ofertas de todas as disciplinas e agora os alunos procuram se matricular, prioritariamente, nas disciplinas com alto valor de CM, ou seja, nas disciplinas mais mamatas.

Em posse da lista de ofertas de disciplinas que um aluno pode se matricular no semestre, sua tarefa � descobrir qual o maior valor acumulado de CM que esse aluno pode conseguir, matriculando-se no maior n�mero de disciplinas poss�vel. O CM acumulado � obtido somando-se todos os �ndices CM das disciplinas que o aluno se matricula. Cada disciplina � oferecida em um hor�rio fixo semanal.

Entrada

A primeira linha de entrada cont�m um n�mero inteiro D (1 = D < 80.000), indicando o n�mero de ofertas de disciplinas. 
Cada uma das D linhas seguintes cont�m quatro campos: S (S = { seg | ter | qua | qui | sex | sab | dom }), C (8 = C = 22), F (9 = F = 23) e I (0 = I = 100), em que S indica o dia da semana, C e F indicam a hora de in�cio e a hora de t�rmino, respectivamente, e I indica o �ndice CM da oferta da disciplina.
Os campos C, F e I s�o n�meros inteiros.

Sa�da

Seu programa deve produzir uma �nica linha, contendo o maior CM acumulado poss�vel para se inscrever no maior n�mero de disciplinas poss�vel.

Exemplos

Entrada:
5
seg 8 12 20
seg 8 12 80
ter 14 18 30
ter 16 18 60
qui 10 12 10

Sa�da:
150