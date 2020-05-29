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

    private JTable jtable;
    JFrame frame;
    DefaultTableModel tableModel;
    //todo don't use enforced height/width. Better to scale with window size

    public UIForm(int width, int height)
    {

        frame = new JFrame("File Organiser");
        frame.setVisible(true);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtable = new JTable();
        jtable = generateTable();
        frame.add(generatePanel());

        frame.revalidate();
    }


    public JTable getTable()
    {
        return jtable;
    }

    public void setTable(JTable jtable)
    {
        this.jtable = jtable;
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

        jpanel.add(new JScrollPane(jtable),layoutConstraints);
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
        tableModel.setRowCount(0);
        for(String str : contents)
        {
            addRowToTable(str,"");
        }
        tableModel.fireTableDataChanged();
    }
}