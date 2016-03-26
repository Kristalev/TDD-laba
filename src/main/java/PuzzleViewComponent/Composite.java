package PuzzleViewComponent;

/**
 * Created by Данил on 26.03.2016.
 */
public interface Composite {
    void addElement(Composite elem);
    void removeElement(Composite elem);
    Composite getChild(int index);
    void showElem();
}
