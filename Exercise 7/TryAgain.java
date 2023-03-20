
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame {
    TryAgain() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("TRY AGAIN");
        tryAgainButton.setFont(new Font("Algerian", Font.BOLD, 30));
       
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

        JButton exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Algerian", Font.BOLD, 30));
        
        ExitEventHandler exitHandler = new ExitEventHandler();
        exitButton.addActionListener(exitHandler);

        add(tryAgainButton);
        add(exitButton);

        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        this.setSize(600, 600);
        
        this.setVisible(true);
        
        this.setLocationRelativeTo(null);
      
        this.getContentPane().setBackground(new Color(128, 213, 100));
        
    }

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            App myApp = new App();
            myApp.main(null);
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}