package FileOrganiser;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NavigationListener implements  ListSelectionListener, MouseListener {


    UIController uiController;
    public NavigationListener(UIController uiController)
    {
        this.uiController = uiController;
    }
    int itemClicked;
    String relativePathNextDirectory;
    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent)
    {
        String eventTextToParse = listSelectionEvent.getSource().toString();

        Pattern itemCLickedRegex = Pattern.compile("\\{([0-9]+)\\}");
        Matcher matcher = itemCLickedRegex.matcher(eventTextToParse);

        if(matcher.find())
        {
            String value = matcher.group(1);
            itemClicked = Integer.valueOf(value);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("pressed");
        if(mouseEvent.getClickCount() == 2)
        {
            System.out.println("clickedtwice");
            relativePathNextDirectory = uiController.jtable.getValueAt(itemClicked,0).toString();

            //todo if directory, change dir else nothing/open

            uiController.model.changeDirectory(relativePathNextDirectory);
            System.out.println(relativePathNextDirectory);
            System.out.println(uiController.view.getClass());
            uiController.view.updateTableFields(uiController.model.getCurrentDirectory());

        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent)
    {
    }
}