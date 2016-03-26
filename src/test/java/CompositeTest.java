import PuzzleViewComponent.Cell;
import PuzzleViewComponent.GamePane;
import javafx.embed.swing.JFXPanel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Данил on 26.03.2016.
 */
public class CompositeTest {
    @Test
    public void addTest1(){
        JFXPanel jfxPanel = new JFXPanel(); //включаем окружение JavaFX
        GamePane gamePane = new GamePane();
        Cell cell = new Cell();
        gamePane.addElement(cell);
        Assert.assertNotNull("Ячейка не добавлена",gamePane.getChild(0));
    }

}
