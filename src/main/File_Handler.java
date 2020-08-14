/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;

/**
 *
 * @author LWill
 */
public class File_Handler extends File
{

    public File_Handler(String pathname) {
        super(pathname);
    }

    public void Delete(String fileName)
    {
        File file = new File(fileName);
        file.delete();
    }

    public void create(String fileName)
    {

    }

    public String getPermissions(String fileName)
    {
        String permissions = "";
        File f = new File(fileName);
        if(f.canRead())
            permissions += "R";
        if(f.canWrite())
            permissions += "W";
        if(f.canExecute())
            permissions += "X";

        return null;
    }
}
