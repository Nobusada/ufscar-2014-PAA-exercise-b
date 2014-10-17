/*
* This is the Exercise B from "Desafio de Programadores" and it will be made using the Brute-Force Strategy.
*
* Author: Daniel Nobusada
*   RA: 344443
*
*   o que ainda precisa fazer:
*       Completar os TODOs
* */

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public class Disciplina{
        Day dia;
        int comeco, fim, indiceCM;

        public Disciplina(){}

        public Disciplina(Day dia, int comeco, int fim, int indiceCM) {
            this.dia = dia;
            this.comeco = comeco;
            this.fim = fim;
            this.indiceCM = indiceCM;
        }

        public Day getDia() {
            return dia;
        }

        public void setDia(Day dia) {
            this.dia = dia;
        }

        public int getComeco() {
            return comeco;
        }

        public void setComeco(int comeco) {
            this.comeco = comeco;
        }

        public int getFim() {
            return fim;
        }

        public void setFim(int fim) {
            this.fim = fim;
        }

        public int getIndiceCM() {
            return indiceCM;
        }

        public void setIndiceCM(int indiceCM) {
            this.indiceCM = indiceCM;
        }
    }
    //TESTES
    /*
    static public void main(String[] args){
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try{
            input = br.readLine();
        }
        catch (IOException ioe){
            ;
        }
        System.out.println(Character.getNumericValue(input.charAt(1)));
        int num = Character.getNumericValue(input.charAt(0));
        int num2 = input.codePointAt(1);
        char cha = input.charAt(0);
        System.out.println(input.charAt(0));
        System.out.println(num);
        System.out.println(num2);


        /*
        Scanner s = new Scanner(System.in);
        String linha = s.nextLine();
        System.out.println(linha.);
        int numero = Integer.parseInt(linha.charAt(0));
        System.out.println(numero);

    }
    */


    public enum Day{seg,ter,qua,qui,sex,sab,dom};

    public static boolean isNum(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    static public void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numD, pos;
        String line;
        Vector<Disciplina> grade = new Vector<Disciplina>();

        //verificacao de 1 <= numD <= 80000
        do {numD = s.nextInt();} while (numD >= 1 && numD <= 80000);

        //falta fazer validação
        for (int i=0; i<numD; i++){
            line = s.nextLine();
            Day dia;
            int comeco = 0, fim = 0, indiceCM = -1;
            pos = 0;

            //seria interessante fazer um while que verifica até o \n
            while(line.charAt(0) != '\n'){
                //verificacao de S = {seg | ter | qua | qui | sex | sab | dom}
                if (line.charAt(pos) == 's' && pos == 0){
                    if (line.charAt(pos + 1) == 'e'){
                        if (line.charAt(pos + 2) == 'g'){
                            dia = Day.seg;
                            pos += 3;
                        }
                        else if (line.charAt(pos + 2) == 'x'){
                            dia = Day.sex;
                            pos += 3;
                        }
                    }
                    else if (line.charAt(pos + 1) == 'a' && line.charAt(pos + 2) == 'b'){
                        dia = Day.sab;
                        pos += 3;
                    }
                }
                else if (line.charAt(pos) == 't' && pos == 0){
                    if (line.charAt(pos + 1) == 'e' && line.charAt(pos + 2) == 'r') {
                        dia = Day.ter;
                        pos += 3;
                    }
                }
                else if (line.charAt(pos) == 'q' && line.charAt(pos + 1) == 'u' && pos == 0){
                    if (line.charAt(pos + 2) == 'a'){
                        dia = Day.qua;
                        pos += 3;
                    }
                    else if (line.charAt(pos + 2) == 'i'){
                        dia = Day.qui;
                        pos += 3;
                    }
                }
                else if (line.charAt(pos) == 'd' && line.charAt(pos + 1) == 'o' && line.charAt(pos + 2) == 'm'  && pos == 0) {
                    dia = Day.dom;
                    pos += 3;
                }
                // else PICNIC

                //verificacao de C, 8 <= C <= 22
                //Character.getNumericValue(input.charAt(1))
                /*Eh consumido o espaço e então é verificado o horário de começo da disciplina*/

                if (pos == 4){
                    int num_1 = Character.getNumericValue(line.charAt(pos));
                    if(num_1 <= 2 && num_1 > 0 && line.charAt(pos) != ' '){
                        if (Character.getNumericValue(line.charAt(pos + 1)) <= 9){

                            //verifica se o horario maximo de inicio eh menor que 22
                            if ((num_1 * 10 + Character.getNumericValue(line.charAt(pos + 1))) <= 22){
                                comeco = num_1 * 10 + Character.getNumericValue(line.charAt(pos + 1));
                                pos += 2;
                            }

                        }
                    }
                    //verifica se horario em menor ou igual a 9 e nao a 9x, x=N
                    else if(num_1 <= 9 && num_1 > 0 && line.charAt(pos) != ' ' && line.charAt(pos + 1) == ' ')
                    {
                        comeco = Character.getNumericValue(line.charAt(pos));
                        pos += 1;
                    }
                    else{
                        System.out.println("Valor invalido!");
                        //quebra tudo
                    }
                }
                // else PICNIC

                //verificacao de F, 9 <= F <= 23
                //TODO
                if (comeco != 0 && isNum(line.charAt(pos)) ){
                    int num_1 = Character.getNumericValue(line.charAt(pos));
                    if(num_1 <= 2 && num_1 > 0 && line.charAt(pos) != ' '){
                        if (Character.getNumericValue(line.charAt(pos + 1)) <= 9){

                            //verifica se o horario maximo de inicio eh menor que 22
                            if ((num_1 * 10 + Character.getNumericValue(line.charAt(pos + 1))) <= 22){
                                comeco = num_1 * 10 + Character.getNumericValue(line.charAt(pos + 1));
                                pos += 2
                            }

                        }
                    }
                    //verifica se horario em menor ou igual a 9 e nao a 9x, x=N
                    else if(num_1 <= 9 && num_1 > 0 && line.charAt(pos) != ' ' && line.charAt(pos + 1) == ' ')
                    {
                        comeco = Character.getNumericValue(line.charAt(pos));
                        pos += 1;
                    }
                    else{
                        System.out.println("Valor invalido!");
                        //quebra tudo
                    }
                }
                // else PICNIC

                //verificacao de I, 0 <= I <= 100
                //TODO

                // else PICNIC

                //insere na lista de Disciplinas
                //TODO

                pos ++;
            }
    }
}}
