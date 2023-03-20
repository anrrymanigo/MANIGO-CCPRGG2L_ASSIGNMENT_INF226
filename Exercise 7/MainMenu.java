import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        ImageIcon snakeIcon = new ImageIcon("snakegift.gif");
        JLabel label = new JLabel();
        label.setIcon(snakeIcon);

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Algerian", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);

        this.add(label);
        this.add(button);
    }

    
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            

            
            new DifficultyMenu();

           
            dispose();
        }
    }
}