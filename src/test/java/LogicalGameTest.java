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
        Assert.assertEquals("Не правильно поехало!",game.getCell(2,2),7);
    }
}
