package mvc.view;

import javax.swing.*;
import java.awt.*;

public class SelectPage extends JFrame{
    private JPanel mainPanel;
    private JTable table;
    private JButton selectareCategorieButton;
    private JButton procentButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton clearButton;

    public SelectPage() throws HeadlessException {
        setContentPane(mainPanel);
    }
}
