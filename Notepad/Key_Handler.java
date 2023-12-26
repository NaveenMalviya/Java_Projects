import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Define the GUI class
class GUI {
    // Sample method for demonstration
    public void performAction(String action) {
        System.out.println("Performed action: " + action);
        // You can replace this with your actual file-handling logic
    }
}

// Create the Key_Handler class
class Key_Handler implements KeyListener {
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
            gui.performAction("Save");
        }

        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_N) {
            gui.performAction("New");
        }

        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_O) {
            gui.performAction("Open");
        }

        if (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_S) {
            gui.performAction("Save As");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }
}
