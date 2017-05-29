package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class KeyCodeID {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyCode");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(181,30);
        frame.setAlwaysOnTop(true);
        JLabel code = new JLabel("Press a key to find out!");
        frame.add(code);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(e.getKeyCode() != 32 && e.getKeyCode() != 27){
                    code.setText("The KeyCode for \"" + e.getKeyChar() + "\" is " + String.valueOf(keyCode));
                } else if(e.getKeyCode() == 32){
                    code.setText("The KeyCode for \"space\" is 32");
                } else if(e.getKeyCode() == 27){
                    int confirm = JOptionPane.showConfirmDialog(null, "Really close KeyCode?\nThe KeyCode for \"Esc\" is 27", "Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirm == JOptionPane.YES_OPTION){
                        System.exit(0);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }    
}