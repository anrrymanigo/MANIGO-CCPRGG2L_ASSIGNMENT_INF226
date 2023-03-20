import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerMenu extends JFrame {

    JTextField textField;

    PlayerMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

       
        JLabel label = new JLabel();
        label.setText("Enter player name: ");
        label.setFont(new Font("Arial", Font.BOLD, 30));

       
        textField = new JTextField(20);
       
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

       
        this.add(label);
        this.add(textField);

        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setSize(500, 500);
        
        this.setVisible(true);
       
        this.setLocationRelativeTo(null);
        
        this.getContentPane().setBackground(new Color(200, 20, 100));
    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            GamePanel gp = new GamePanel();

           
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                gp.playerName = textField.getText();

                
                dispose();

               
                new GameFrame();
            }
        }

        public void keyTyped(KeyEvent event) {
           
        }

        public void keyReleased(KeyEvent event) {
           
        }
    }
}
