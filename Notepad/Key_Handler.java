
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Handler implements KeyListener {

    GUI gui;

    public Key_Handler(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
