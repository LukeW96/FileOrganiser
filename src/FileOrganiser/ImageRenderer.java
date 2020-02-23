/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOrganiser;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author LWill
 */


public class ImageRenderer extends DefaultListCellRenderer
{
    String saveType;
    ImageIcon icon = new ImageIcon("/resources/folderIcon.png");
    public ImageRenderer(String saveType)
    {
        this.saveType = saveType;
    }
   
   // Font font = new Font("helvitica", Font.BOLD, 24);

    public Component getListCellRendererComponent(
                                       JList list,
                                       Object value,
                                       int index,
                                       boolean isSelected,
                                       boolean cellHasFocus) {
        //Get the selected index. (The index param isn't
        //always valid, so just use the value.)
//        int selectedIndex = ((Int
//            icon = createImageIcon("");eger)value).intValue();

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        //Set the icon and text.  If icon was null, say so.
        if(saveType.equals("Folder"))
        {

        }
        setIcon(icon);
        if (icon != null) {
            setFont(list.getFont());
        }

        return this;
    }
}