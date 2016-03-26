package PuzzleLogic;

import java.util.Random;

/**
 * Created by Данил on 25.03.2016.
 */
public class Game {
    private int[][] pole;

    /*
    Конструктор с инициализацией поля

        @param double[][] p - поле инициализации
     */
    public Game(int[][] p){
        this.pole = p;
    }

    public int getCell(int i, int j){
        return pole[i][j];
    }

    public Game(int n, int m){
        this.pole = new int[n][m];
        do{
            fillPole();
        }while(!correctFill());
    }

    public Game(int n){
        this.pole = new int[n][n];
        do{
            fillPole();
        }while(!correctFill());
    }

    public int[][] getPole(){
        return this.pole;
    }

    private void fillPole(){
        int countCells = pole.length * pole[0].length;
        int[] arrCells = new int[countCells];
        Random rnd = new Random();
        for(int i = 0 ; i < pole.length; i++){
            for(int j = 0 ; j < pole[i].length;j++){
                int cell = rnd.nextInt(countCells);
                while(arrCells[cell] == 1)
                    cell = rnd.nextInt(countCells);
                pole[i][j] = cell;
                arrCells[cell] = 1;
            }
        }
    }

    private boolean correctFill(){
        int inv = 0 ;
        for(int i = 0 ; i < pole.length ; i ++){
            for(int j = 0 ; j < pole[i].length ; j++){
                if (pole[i][j] != 0){
                    for(int k = i; k < pole.length; k++){
                        if (k == i && j + 1 < pole[k].length)
                            for(int l = j+1 ; l < pole[k].length; l++){
                                if(pole[k][l] < pole[i][j])
                                    inv++;
                            }
                        else
                            for(int l = 0 ; l < pole[k].length; l++){
                                if(pole[k][l] < pole[i][j])
                                    inv++;
                            }
                    }
                }else{
                    inv += i + 1;
                }
            }
        }
        if (inv % 2 == 0)
            return true;
        else
            return false;
    }

    //перемещение ячейки по адресу (i,j)
    public boolean move(int i, int j){
        try{
            if (this.pole[i][j-1] == 0) {
                swap(i, j, i, j - 1);
                return true;
            }
        }catch (Exception e){}
        try {
            if (this.pole[i+1][j] == 0){
                swap(i,j,i+1,j);
                return true;
            }
        }catch (Exception e){}
        try {
            if (this.pole[i-1][j] == 0){
                swap(i,j,i-1,j);
                return true;
            }
        }catch (Exception e){}
        try {
            if (this.pole[i][j+1] == 0){
                swap(i,j,i,j+1);
                return true;
            }
        }catch (Exception e){}
        return false;
    }


    //меняет метсами ячейки по координатам (i1,j1) и (i2,j2)
    private void swap(int i1, int j1, int i2, int j2){
        int help = pole[i1][j1];
        pole[i1][j1] = pole[i2][j2];
        pole[i2][j2] = help;
    }

    //метод, проверяющий, является ли игра законченной
    public boolean isFinish(){
        if (pole[pole.length-1][pole[1].length-1] != 0)
            return false;
        else{
            for(int i = 0 ; i < pole.length; i++){
                for(int j = 1 ; j<pole[i].length; j++){
                    if (j == pole[i].length-1 && i == pole.length-1)
                        return true;
                    if(pole[i][j-1] > pole[i][j])
                        return false;
                }
            }
        }
        return true;
    }

}
