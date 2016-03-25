package BarleyBreak;

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

    //перемещение ячейки по адресу (i,j)
    public boolean move(int i, int j){
        if (this.pole[i][j-1] == 0) {
            swap(i, j, i, j - 1);
            return true;
        }
        if (this.pole[i+1][j] == 0){
            swap(i,j,i+1,j);
            return true;
        }
        return false;
    }

    private void swap(int i1, int j1, int i2, int j2){
        int help = pole[i1][j1];
        pole[i1][j1] = pole[i2][j2];
        pole[i2][j2] = help;
    }

}
