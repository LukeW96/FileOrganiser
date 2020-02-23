package FileOrganiser;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class UIForm
{

    JFrame frame;
    DefaultTableModel tableModel;
    DirectoryNavigator directoryNavigator;
    //todo don't use enforced height/width. Better to scale with window size

    public UIForm(int width, int height)
    {
        directoryNavigator = new DirectoryNavigator("");
        System.out.println(directoryNavigator.getCurrentDirectory());

        frame = new JFrame("File Organiser");
        frame.setVisible(true);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(generatePanel());
        updateTableFields(directoryNavigator.getCurrentDirectory());

        frame.revalidate();
    }


    private JPanel generatePanel()
    {
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridBagLayout());
        GridBagConstraints layoutConstraints = new GridBagConstraints();

//        JButton button = new JButton("Button 2");
//        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
//        layoutConstraints.weightx = 0.5;
//        layoutConstraints.gridx = 0;
//        layoutConstraints.gridy = 0;
//        layoutConstraints.gridwidth = 3;
//        layoutConstraints.anchor = GridBagConstraints.NORTH;
//        jpanel.add(button, layoutConstraints);

        layoutConstraints.anchor = GridBagConstraints.CENTER;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.weighty = 3;

        JTable table = generateTable();

        table.getSelectionModel().addListSelectionListener(new NavigationListener(table,directoryNavigator));
        jpanel.add(new JScrollPane(table),layoutConstraints);
        return jpanel;
    }

    private JTable generateTable()
    {
        tableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableModel.addColumn("filename");
        tableModel.addColumn("extension");
        JTable table = new JTable(tableModel);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        return table;
    }

    private ArrayList<String> getFields(String pathToFile)
    {
       File directory = new File(pathToFile);

       String[] contents = directory.list();
       for(String file : contents)
       {
           System.out.println(file.toString());
       }

       //have to instantiate as new ArrayList, as asList returns type List.
        return new ArrayList<String>(Arrays.asList(contents));
    }

    private void addRowToTable(String filename, String fileExtension)
    {
        tableModel.addRow(new Object[]{filename,""});
    }

    public void updateTableFields(String pathToFile)
    {
        ArrayList<String> contents = getFields(pathToFile);

        for(String str : contents)
        {
            addRowToTable(str,"");
        }
    }
}