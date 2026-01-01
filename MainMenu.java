import java.awt.*;
import javax.swing.*;

public class MainMenu {

    static JFrame f;
    static JButton mid, diff, two;
    static JLabel prompt;
    

    static final int GAME_WIDTH = 500;
    static final int GAME_HEIGHT = 500;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainMenu::frame);
    }

    private static void frame() {
        // intializing the frame
        f = new JFrame("Ping Pong");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setResizable(false);
        f.setLocationRelativeTo(null);

        // creating the prompt and buttons
        mid = new JButton("Normal!");
        diff = new JButton("Impossible!");
        two = new JButton("Two-Player!");
        prompt = new JLabel("Select a difficulty level!");

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.BLACK);

        prompt.setForeground(Color.WHITE);
        prompt.setBounds(180, -80, 200, 200);
        mid.setBounds(GAME_WIDTH/5 , GAME_HEIGHT/5, 100, 100);
        diff.setBounds(3*(GAME_WIDTH/5), GAME_HEIGHT/5, 100, 100);
        two.setBounds(GAME_WIDTH/2 - 100, 3*(GAME_HEIGHT/5), 200, 100);
        p.add(prompt);
        p.add(mid);
        p.add(diff);
        p.add(two);

        f.add(p);
        f.setVisible(true);

        // listening for button clicks to intialize the start of the game
        diff.addActionListener(e -> {
            GameFrame2 game = new GameFrame2();
            f.getContentPane().removeAll();
            f.add(game);
            f.revalidate();
            f.repaint();

            game.requestFocusInWindow();
        });
        
        mid.addActionListener(e -> {
            GameFrame game = new GameFrame();
            f.getContentPane().removeAll();
            f.add(game);
            f.revalidate();
            f.repaint();

            game.requestFocusInWindow();
        });
            two.addActionListener(e -> {
            GameFrame3 game = new GameFrame3();
            f.getContentPane().removeAll();
            f.add(game);
            f.revalidate();
            f.repaint();

            game.requestFocusInWindow();
        });
    }
    
}
