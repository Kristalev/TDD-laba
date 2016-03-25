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
    public void testFinishGame(){
        int[][] pole =
                {{1,2,3,4},    //пустая ячейка по координатам (2,2)
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}};
        Game game = new Game(pole);
        Assert.assertTrue("Не правильно поехало!",game.isFinish());
    }
}
