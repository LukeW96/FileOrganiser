/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOrganiser;

import java.io.File;
import javax.swing.*;

/**
 *
 * @author LWill
 */
public class File_Organiser extends javax.swing.JFrame {

    /**
     * Creates new form File_Organiser
     */
    public File_Organiser() 
    {
        JFrame frame = new JFrame();

        UIForm ui = new UIForm();
//        model = new DefaultListModel();
//        getDirectory();
//        initComponents();
//        updateFileList();
    }
/*
    private void getDirectory()
    {
        try
        {
              directory = "";
//            directory = JOptionPane.showInputDialog("Enter Directory");
        }
        catch(Exception e)
        {}  
    }
    
    private void updateFileList()
    {
        File folder = new File(directory);
        File[] fileList = folder.listFiles();
        updateJList(fileList);
    }

    private void updateJList(File[] fileList)
    {
        model.clear();
        for(File file: fileList)
        {
            System.out.println(file.toString());
            model.addElement(file);
        }

        JListFiles.setCellRenderer(new ImageRenderer("Folder"));
        JListFiles.setModel(model);
    }
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File_Organiser fileOrganiser = new File_Organiser();
    }
    private String directory;
    private DefaultListModel model;
}
