package homework4;

public class PanelOddEvenNotifier implements PanelOrderNotifier {
    //  Abstraction function:
    //	A PanelOddEvenNotifier dictates the billboard's panels to changes
    //	their colors in a specific order, first odd numbered panels, then the
    //  even numbered ones.
    //
    //	Representation Invariant:
    //  1 <= nextPanel <= 25

    private final int BOARDSIZE = 25;
    private int nextPanel;

    public PanelOddEvenNotifier() {
        nextPanel = 1;
    }

    @Override
    public int getNextPanel() {
        int currentPanel = nextPanel;
        nextPanel = (nextPanel + 2) % BOARDSIZE;
        checkRep();
        return currentPanel;
    }

    /**
     * Verify next Panel to be updated has a valid index.
     *
     * @effects This method will fail if next panel index is out of range.
     */
    private void checkRep() {
        assert (nextPanel >= 1 && nextPanel <= BOARDSIZE) :
                "Panel index is out of range!";
    }
}
