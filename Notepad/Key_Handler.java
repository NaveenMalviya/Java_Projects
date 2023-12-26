import java.awt.event.*;

// Create the Key_Handler class
public class Key_Handler implements KeyListener {
    private final GUI gui;

    
    public Key_Handler(GUI gui) {
        this.gui = gui;
    }
  

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S) {
            gui.file.saveFile();
        }

        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_N) {
            gui.file.newFile();
        }

        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_O) {
            gui.file.openFile();
        }

        if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_S) {
            gui.file.saveAsFile();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }
}
