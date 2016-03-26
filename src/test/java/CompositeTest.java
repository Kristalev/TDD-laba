import PuzzleViewComponent.Cell;
import PuzzleViewComponent.GamePane;
import javafx.embed.swing.JFXPanel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Данил on 26.03.2016.
 */
public class CompositeTest {
    //включаем JavaFX перед каждым тестом
    @Before
    public void startJFX(){
        JFXPanel jfxPanel = new JFXPanel(); //
    }


    @Test
    public void addTest1(){
        GamePane gamePane = new GamePane();
        Cell cell = new Cell();
        gamePane.addElement(cell);
        Assert.assertNotNull("Ячейка не добавлена",gamePane.getChild(0));
    }


    @Test
    public void addTest2(){
        GamePane gamePane = new GamePane();
        Cell cell = new Cell();
        gamePane.addElement(cell);
        Assert.assertEquals("Ячейка не добавлена",gamePane.getChild(0),cell);
    }

    @Test
    public void removeTest1(){
        GamePane gamePane = new GamePane();
        Cell cell = new Cell();
        gamePane.addElement(cell);
        gamePane.removeElement(cell);
        Assert.assertNull("Ячейка не удалена",gamePane.getChild(0));
    }


}
