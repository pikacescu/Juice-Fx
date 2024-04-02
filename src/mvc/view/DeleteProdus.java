package mvc.view;

import javax.swing.*;
import java.awt.*;

public class DeleteProdus extends JFrame{
    private JTable table;
    private JTextField idProdus_textField;
    private JPanel mainPanel;
    private JButton stergeButton;

    public DeleteProdus() throws HeadlessException {
        setContentPane(mainPanel);
    }
}
