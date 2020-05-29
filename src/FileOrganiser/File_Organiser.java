/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOrganiser;

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
        DirectoryNavigator directoryNavigator = new DirectoryNavigator("HARDCODED PATH CURRENTLY");
        System.out.println(directoryNavigator.getCurrentDirectory());
        UIForm ui = new UIForm(500,500);

        UIController controller = new UIController(directoryNavigator,ui);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File_Organiser fileOrganiser = new File_Organiser();
    }
    private String directory;
    private DefaultListModel model;
}