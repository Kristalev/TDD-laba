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
        return this.pole[i][j];
    }

    //перемещение ячейки по адресу (i,j)
    public boolean move(int i, int j){
        return true;
    }

}
