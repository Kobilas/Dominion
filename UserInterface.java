package mkobilas.game.Dominion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserInterface extends JFrame
{
    private static final long serialVersionUID = -6457801189185393395L;
    public static void main(String args[])
    {
        createMenu();
    }
    public static void createMenu()
    {
        final JFrame menu = new JFrame();
        //JPanel
        JPanel pnlButton = new JPanel();
        //Buttons
        JButton instructions = new JButton("Instructions");
        instructions.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Instructions x = new Instructions();
                x.PrintInstructions();
                menu.setVisible(false);
            }
        });        
        JButton playGame = new JButton("Play Game");
        playGame.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                GameInstance.main(null);
                menu.setVisible(false);
            }
        });   
        JButton exit = new JButton("Exit");
        exit.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        //Labels
        JLabel title = new JLabel("DOMINION!",JLabel.CENTER);
        title.setForeground(Color.CYAN);
        title.setFont(new Font("Eras Demi ITC",Font.ITALIC,20));
        pnlButton.setLayout(null);
        //Set bounds
        title.setBounds(200,100,200,100);
        instructions.setBounds(325, 250, 150,30);
        playGame.setBounds(125, 250, 150, 30);
        exit.setBounds(225,300,150,30);
        //JPanel bounds
        pnlButton.setBackground(Color.GRAY);
        pnlButton.setBounds(0, 0, 600, 600);
        //Adding to JFrame
        pnlButton.add(title);
        pnlButton.add(instructions);
        pnlButton.add(playGame);
        pnlButton.add(exit);
        menu.add(pnlButton);
        // JFrame properties
        menu.setSize(600, 600);
        menu.setBackground(Color.GRAY);
        menu.setTitle("DOMINION!");
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
         
}
