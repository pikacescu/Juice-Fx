package mvc.view;

import javax.swing.*;
import java.awt.*;

public class WelcomePage extends JFrame{
    private JPanel mainPanel;
    private JTable table;

    public WelcomePage() throws HeadlessException {
        setContentPane(mainPanel);
        setSize(300,300);
    }
}
