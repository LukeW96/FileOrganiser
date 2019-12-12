/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOrganiser;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author LWill
 */


public class ImageRenderer extends DefaultListCellRenderer
{
    String saveType;
    ImageIcon icon;
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
//        int selectedIndex = ((Integer)value).intValue();

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
            System.out.println("gets here");
        }
        setIcon(icon);
        /*if (icon != null) {
            setText(pet);
            setFont(list.getFont());
        }*/

        return this;
    }

}
