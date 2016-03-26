import PuzzleViewComponent.Cell;
import PuzzleViewComponent.GamePane;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Данил on 26.03.2016.
 */
public class CompositeTest {
    @Test
    public void addTest1(){
        GamePane gamePane = new GamePane();
        Cell cell = new Cell();
        gamePane.addElement(cell);
        Assert.assertNotNull("Ячейка не добавлена",gamePane.getChild(0));
    }

}
