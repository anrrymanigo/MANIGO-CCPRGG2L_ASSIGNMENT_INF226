import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorMenu extends JFrame {

    JList list;
    private String[] colorlist = { "BLUE", "WHITE", "MAGENTA", "YELLOW","GREEN","PINK","RED", "CYAN","ORANGE" };
    private Color[] colors = { Color.BLUE, Color.WHITE, Color.MAGENTA, Color.YELLOW, Color.GREEN,Color.PINK,Color.RED,Color.CYAN,Color.ORANGE};

    JList list2;
    private String[] backgroundlist ={"WHITE","BLACK"};
    private Color[] backgrouunds ={Color.WHITE, Color.BLACK};
    ColorMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());
        

        
        JLabel label = new JLabel();
        label.setText("Choose your favorite color: ");
        label.setFont(new Font("Algerian", Font.BOLD, 30));

       
        list = new JList(colorlist);
        list.setFont(new Font("Algerian", Font.BOLD, 30));
        list.setVisibleRowCount(2);


        
        
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

       
        EventHandler handler = new EventHandler();
        list.addListSelectionListener(handler);

        
        JScrollPane scrollPane = new JScrollPane(list);

        
        this.add(label);
        this.add(scrollPane);

        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        this.setSize(500, 500);
        
        this.setVisible(true);
       
        this.setLocationRelativeTo(null);
        
      
        this.getContentPane().setBackground(new Color(0, 0, 0));

        
    }

    
    private class EventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {

            GamePanel gp = new GamePanel();
            gp.snakeColor = colors[list.getSelectedIndex()];

           
            new PlayerMenu();

            
            dispose();
        }
    }
}