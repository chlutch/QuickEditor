import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created by asif on 8/18/2015.
 */
public class AddMenu {
    JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu fileMenu, viewMenu, helpMenu;
    ResourceBundle menuResourceBundle;

    public AddMenu(JFrame jFrame) {
        jMenuBar = new JMenuBar();
        jFrame.setJMenuBar(jMenuBar);
        menuResourceBundle = ResourceBundle.getBundle("res.strings.Menus");
        createComponentObjects();
    }

    public void createComponentObjects(){
        fileMenu = new JMenu(menuResourceBundle.getString("FileMenu"));
        viewMenu = new JMenu(menuResourceBundle.getString("ViewMenu"));
    }

    public void addComponents(){
        jMenuBar.add(fileMenu);
        jMenuBar.add(viewMenu);
    }
}
