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

    private void swap(int i1, int j1, int i2, int j2){
        int help = pole[i1][j1];
        pole[i1][j1] = pole[i2][j2];
        pole[i2][j2] = help;
    }

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
