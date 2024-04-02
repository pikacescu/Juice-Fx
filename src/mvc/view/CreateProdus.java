package mvc.view;

import javax.swing.*;
import java.awt.*;

public class CreateProdus extends JFrame{
    private JPanel mainPanel;
    private JTextField idFurnizor_textField;
    private JTextField denumire_textField;
    private JTextField tip_textField;
    private JTextField prZahar_textField;
    private JTextField prFruct_textField;
    private JTextField categorie_textField;
    private JTextField pret_textField;
    private JTextField popularitate_textField;
    private JButton adaugaButton;
    private JTable table;

    public CreateProdus() throws HeadlessException {
        setContentPane(mainPanel);
    }
}
