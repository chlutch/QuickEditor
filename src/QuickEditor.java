import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by asif on 8/18/2015.
 */
public class QuickEditor extends JFrame {
    /**
     * variables declaration
     */
    JFrame jFrame;

    /**
     * ResourceBundle variables for internationalization and easier modification
     */
    ResourceBundle appNameResourceBundle;

    /**
     * AddMenu class add new JMenu and JMenuItem to the JMenuBar
     */
    AddMenu addMenu;


    public QuickEditor(){
        prepareResourceBundle();

        jFrame = new JFrame(appNameResourceBundle.getString("ApplicationName"));
        addMenu = new AddMenu(jFrame);

    }

    public static void main(String[] args) {
        QuickEditor quickEditor = new QuickEditor();
        quickEditor.prepareGUI();
    }

    private void prepareResourceBundle() {

        /**
         * Delete this portion in case you are just separating string from the code
         * also delete the 'strings' argument in the next portion
         */
        String country = "fr";
        String language = "Fr";
        Locale locale = new Locale(country, language);

        /**
         * The dot specifies a directory before the file name
         */
        appNameResourceBundle = ResourceBundle.getBundle("res.strings.ApplicationName", locale);
    }

    public void prepareGUI(){
        jFrame.setSize(400, 400);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });

        /**
         * addComponents is a method in AddMenu Class which adds JMenu to JMenuBar
         */
        addMenu.addComponents();
        jFrame.setVisible(true);
    }
}
