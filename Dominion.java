package mkobilas.game.Dominion;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Dominion extends JFrame
{
    private static final long serialVersionUID = -8112974301134868537L;
    public Game main;
    public Dominion()
    {
        this.setLayout(new GridLayout(1, 1, 0, 0));
        main = new Game(this);
        this.add(main);
    }
}