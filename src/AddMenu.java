import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created by asif on 8/18/2015.
 */
public class AddMenu {
    JMenuBar jMenuBar;
    JMenu fileMenu, viewMenu, helpMenu;
    ResourceBundle menuResourceBundle;

    public AddMenu(JMenuBar jMenuBar) {
        this.jMenuBar = jMenuBar;
        menuResourceBundle = ResourceBundle.getBundle("res.locale.Menus");
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
