import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("Algerian", Font.BOLD, 30));
        
        EventHandler easyHandler = new EventHandler(200);
        easyButton.addActionListener(easyHandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setFont(new Font("Algerian", Font.BOLD, 30));
        
        EventHandler mediumHandler = new EventHandler(120);
        mediumButton.addActionListener(mediumHandler);

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("Algerian", Font.BOLD, 30));
        
        EventHandler hardHandler = new EventHandler(40);
        hardButton.addActionListener(hardHandler);

        add(easyButton);
        add(mediumButton);
        add(hardButton);

        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setSize(500, 500);
       
        this.setVisible(true);
        
        this.setLocationRelativeTo(null);
        
        this.getContentPane().setBackground(new Color(31, 189, 171));
    }

    private class EventHandler implements ActionListener {

        int snakeSpeed;

        
        EventHandler(int speed) {
            this.snakeSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            GamePanel gp = new GamePanel();
            gp.DELAY = snakeSpeed;

           
            new ColorMenu();

            
            dispose();
        }
    }
}
