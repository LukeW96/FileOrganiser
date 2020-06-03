package main;

public class DirectoryNavigator {

    private String currentDirectory ;

    public String getCurrentDirectory()
    {
        return currentDirectory;
    }

    public DirectoryNavigator()
    {
        //replace with local desktop path.
        currentDirectory = Configuration.homeDir;
    }

    public DirectoryNavigator(String pathToLocation)
    {
        currentDirectory = pathToLocation;

    }

    public void changeDirectory(String relativeDirectory)
    {
        currentDirectory = currentDirectory +  "/" + relativeDirectory;
    }

    public void backDirectory()
    {
        currentDirectory = currentDirectory.substring(0,currentDirectory.lastIndexOf("/"));
    }

}