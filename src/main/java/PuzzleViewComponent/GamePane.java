package PuzzleViewComponent;

import com.sun.javafx.event.CompositeEventHandler;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Данил on 26.03.2016.
 */
public class GamePane extends Pane implements Composite{
    private ArrayList<Composite> arrCells;
    public GamePane(){
        super();
        arrCells = new ArrayList<Composite>();
    }

    public void addElement(Composite elem) {
        arrCells.add(elem);
    }

    public void removeElement(Composite elem) {

    }

    public Composite getChild(int index) {
        return arrCells.get(index);
    }

    public void showElem() {

    }
}
