package testassignment;//lsdfksdjafl

import java.awt.EventQueue;
import javax.swing.JFrame;

public class WindowControl extends JFrame {

    public WindowControl() {       
        initializeScreenResolution();
    }
    
    private void initializeScreenResolution() {
        
        //Create Session
        add(new GameSession());
          
        //Prevent Window Resizing, right/bottom border collision issue(window padding)
        setResizable(false);
        pack();
        
        //Window Title
        setTitle("Snake");
        
        //Window Location
        setLocationRelativeTo(null);
        
        //Close Window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {       
        EventQueue.invokeLater(() -> {
            JFrame frame = new WindowControl();
            frame.setVisible(true);
        });
    }
}
