package mkobilas.game.Dominion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrintWinner
{
    public static void Print()
    {
        final JFrame frame = new JFrame("WINNER!!!");
        //JPanel
        JPanel pnlButton = new JPanel();
        //Buttons
        JButton Back = new JButton("Play Again?");
        Back.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                GameInstance.main(null);
            }
        });        
        //Label for the whole instructions
        JLabel textInfoLine1 = new JLabel("PLAYER ONE WINS",JLabel.CENTER);
        pnlButton.setLayout(null);
        //Set bounds
        Back.setBounds(250,500,100,30);
        textInfoLine1.setBounds(50,100,500,30);
        textInfoLine1.setForeground(Color.CYAN);
        //JPanel bounds
        pnlButton.setBounds(0, 0, 600, 600);
        pnlButton.setBackground(Color.GRAY);
        //Adding to JFrame
        pnlButton.add(Back);
        pnlButton.add(textInfoLine1);
        frame.add(pnlButton);
        // JFrame properties
        frame.setSize(600, 600);
        frame.setBackground(Color.GRAY);
        frame.setTitle("WINNER!!!");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}