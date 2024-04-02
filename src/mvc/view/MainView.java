package mvc.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    private WelcomePage welcomePage;
    private CreateProdus createProdus;
    private DeleteProdus deleteProdus;
    private SelectPage selectPage;

    private void initApp(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Sucuri");

        welcomePage = new WelcomePage();
        createProdus = new CreateProdus();
        deleteProdus = new DeleteProdus();
        selectPage = new SelectPage();
    }

    private void initNewLayoutChange(JPanel panel, String title){
        panel.setBorder(BorderFactory.createTitledBorder(title));
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().doLayout();
        panel.revalidate();
        pack();
        setLocationRelativeTo(null);
    }

    private void initNewLayoutChange(JPanel panel){
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().doLayout();
        panel.revalidate();
        pack();
        setLocationRelativeTo(null);
    }

    private JMenuItem createProdusMenu(){
        JMenuItem addProdMenu = new JMenuItem("Adauga produs");
        addProdMenu.addActionListener(e -> {
            JPanel addCreteProdusMenu = (JPanel) createProdus.getContentPane();
            initNewLayoutChange(addCreteProdusMenu, "Creaza Produs Nou");
        });

        return addProdMenu;
    }

    private JMenuItem creteDeleteProd(){
        JMenuItem addStergeProdMenu = new JMenuItem("Sterge Produs");
        addStergeProdMenu.addActionListener(e -> {
            JPanel addDeleteProdMenu = (JPanel) deleteProdus.getContentPane();
            initNewLayoutChange(addDeleteProdMenu, "Sterge Produs");
        });

        return addStergeProdMenu;
    }

    private JMenuItem creteWelcomePageMenu(){
        JMenuItem welcomePageMenu = new JMenuItem("Welcome");
        welcomePageMenu.addActionListener(e -> {
            JPanel addWelcomePageMenu = (JPanel) welcomePage.getContentPane();
            initNewLayoutChange(addWelcomePageMenu);
        });

        return welcomePageMenu;
    }

    private JMenuItem createSelectPageMenu(){
        JMenuItem addSelectPageMn = new JMenuItem("Selectare");
        addSelectPageMn.addActionListener(e -> {
            JPanel addSelectPageMenu = (JPanel) selectPage.getContentPane();
            initNewLayoutChange(addSelectPageMenu, "Selecteaza");
        });

        return addSelectPageMn;
    }

    public MainView() throws HeadlessException {
        initApp();

        JMenuBar menuBar = new JMenuBar(); setJMenuBar(menuBar);
        menuBar.add(createProdusMenu());
        menuBar.add(creteDeleteProd());
        menuBar.add(createSelectPageMenu());
        menuBar.add(creteWelcomePageMenu());

        getContentPane().add(new WelcomePage().getContentPane());
        pack();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
