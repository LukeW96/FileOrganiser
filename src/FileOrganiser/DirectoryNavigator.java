package FileOrganiser;

public class DirectoryNavigator {

    public String getCurrentDirectory()
    {
        return currentDirectory;
    }

    private String currentDirectory = "";

    public DirectoryNavigator()
    {
        //replace with local desktop path.
        currentDirectory = "";
    }

    public DirectoryNavigator(String pathToLocation)
    {
        currentDirectory = pathToLocation;
    }
}
