/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOrganiser;

import java.io.File;

/**
 *
 * @author LWill
 */
public class File_Handler 
{
    public File_Handler()
    {
    }
    
    public void Delete(String fileName)
    {
        File file = new File(fileName);
        file.delete();
    }
}