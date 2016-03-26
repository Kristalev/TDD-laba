import BarleyBreak.Game;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Данил on 21.03.2016.
 */
public class LogicalGameTest {
    @Test
    public void testMoving1(){
        int[][] pole =
                {{1,1,1,1},    //пустая ячейка по координатам (2,2)
                {1,1,1,1},
                {1,1,0,1},
                {1,1,1,1}};
        Game game = new Game(pole);
        game.move(2,3); //двигаем единичку, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,2),1);
    }

    //еще один тест на передвижения. Теперь все ячейки разные
    @Test
    public void testMoving2(){
        int[][] pole =
                        {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,0,11},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(2,3); //двигаем 11, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,2),11);
    }

    //Проверяем что действительно все правильно поехало.
    @Test
    public void testMoving3(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,0,11},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(2,3); //двигаем 11, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,3),0);
    }

    //А правильно ли все поедет вниз например
    @Test
    public void testMoving4(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,0,11},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(1,2); //двигаем 7, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,2),7);
    }

    //А если райнюю фишку переместить вниз
    @Test
    public void testMoving5(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {0,5,6,8},
                        {9,10,11,12},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(0,0); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(1,0),1);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving6(){
        int[][] pole =
                {{1,0,3,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,8},
                        {9,10,11,12},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(0,0); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(0,1),1);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving7(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,0},
                        {9,10,11,12},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(0,3); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(1,3),4);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving8(){
        int[][] pole =
                {{1,2,0,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,8},
                        {9,10,11,12},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(0,3); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(0,2),4);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving9(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,8},
                        {0,10,11,12},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(3,0); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,0),12);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving10(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,8},
                        {9,10,11,12},
                        {12,0,14,15}};
        Game game = new Game(pole);
        game.move(3,0); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(3,1),12);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving11(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,8},
                        {9,10,11,0},
                        {12,13,14,15}};
        Game game = new Game(pole);
        game.move(3,3); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,3),15);
    }

    //Тесты на перемещение (Краевые случаи)
    @Test
    public void testMoving12(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {3,5,6,8},
                        {9,10,11,12},
                        {12,12,0,15}};
        Game game = new Game(pole);
        game.move(3,3); //двигаем 1, она должна переехать на пустую ячейку.
        Assert.assertEquals("Не правильно поехало!",game.getCell(3,2),15);
    }

    //Тест на проверку конечного стостояния игры
    @Test
    public void testFinishGame1(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}};
        Game game = new Game(pole);
        Assert.assertTrue("Игра не закончена!",game.isFinish());
    }

    //Тест на проверку конечного стостояния игры
    @Test
    public void testFinishGame2(){
        int[][] pole =
                {{2,1,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}};
        Game game = new Game(pole);
        Assert.assertTrue("Игра закончена!",!game.isFinish());
    }

    //Тест на проверку конечного стостояния игры
    @Test
    public void testFinishGame3(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,0,15}};
        Game game = new Game(pole);
        Assert.assertTrue("Игра закончена!",!game.isFinish());
    }

    //Тест на проверку конечного стостояния игры и перемещения фишечки
    @Test
    public void testFinishGame4(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,0,15}};
        Game game = new Game(pole);
        Assert.assertTrue("Игра закончена!",!game.isFinish());
        game.move(3,3);
        Assert.assertTrue("Игра не закончена!",game.isFinish());
    }

    //Тест на генерацию случайного поля n на m
    @Test
    public void testGenerateGame1(){
        Game game = new Game(4,4);
        Assert.assertNotNull("Объект не создался", game);
    }

    //Тест на генерацию случайного поля n на n
    @Test
    public void testGenerateGame2(){
        Game game = new Game(4);
        Assert.assertNotNull("Объект не создался", game);
    }

    //Тест на генерацию случайного поля n на n
    @Test
    public void testGenerateGame3(){
        Game game1 = new Game(4);
        Game game2 = new Game(4,4);
        Assert.assertNotEquals("Объект один и тотже", game1, game2);
    }


    //не все комбинации пятнашек могут быть собраны.
    //тест на корректность проверачной функции
    @Test
    public void testCorrectPole1(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,15,14,0}};
        Assert.assertTrue("Решение есть",!testFunctionForCorrect(pole));

    }

    //не все комбинации пятнашек могут быть собраны.
    //тест на корректность проверачной функции
    @Test
    public void testCorrectPole2(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,0,15}};
        Assert.assertTrue("Решения нет!",testFunctionForCorrect(pole));

    }

    //не все комбинации пятнашек могут быть собраны.
    //тест на корректность проверачной функции
    @Test
    public void testCorrectPole3(){
        Game game = new Game(4);
        Assert.assertTrue("Решение нет",testFunctionForCorrect(game.getPole()));

    }

    //не все комбинации пятнашек могут быть собраны.
    //тест на корректность проверачной функции
    @Test
    public void testCorrectPole4(){
        Game game = new Game(4);
        Assert.assertTrue("Решение нет",testFunctionForCorrect(game.getPole()));

    }

    //не все комбинации пятнашек могут быть собраны.
    //тест на корректность проверачной функции
    @Test
    public void testCorrectPole5(){
        Game game = new Game(4);
        Assert.assertTrue("Решение нет",testFunctionForCorrect(game.getPole()));

    }

    //Вспомогательный метод, проверяющий, является ли pole сходимым к решению
    private boolean testFunctionForCorrect(int[][] pole){
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


}
