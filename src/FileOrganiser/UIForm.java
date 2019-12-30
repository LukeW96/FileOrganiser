package FileOrganiser;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class UIForm
{

    JFrame frame;
    DefaultTableModel tableModel;
    //todo don't use enforced height/width. Better to scale with window size
    public UIForm()
    {
        this(500,500);
    }

    public UIForm(int width, int height)
    {
        frame = new JFrame("File Organiser");
        frame.setVisible(true);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(generatePanel());
        updateTableFields("");
        frame.revalidate();
    }


    private JPanel generatePanel()
    {
        JPanel jpanel = new JPanel();
        JTable table = generateTable();
        jpanel.add(new JScrollPane(table));
        return jpanel;
    }

    private JTable generateTable()
    {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("filename");
        tableModel.addColumn("extension");
        tableModel.addRow(new Object[]{"tempFileName",".txt"});
        JTable table = new JTable(tableModel);

//        jtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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

    public void updateTableFields(String pathToFile)
    {
        tableModel.addRow(new Object[]{"added file", ".jpg"});
        ArrayList<String> contents = getFields(pathToFile);
    }
}
