package FileOrganiser;

public class DirectoryNavigator {

    private String currentDirectory ;

    public String getCurrentDirectory()
    {
        return currentDirectory;
    }

    public DirectoryNavigator()
    {
        //replace with local desktop path.
        currentDirectory = "";
    }

    public DirectoryNavigator(String pathToLocation)
    {
        currentDirectory = pathToLocation;
        System.out.println(currentDirectory);
    }

    public void changeDirectory(String relativeDirectory)
    {
        System.out.println("relative = " + relativeDirectory);
        currentDirectory = currentDirectory + relativeDirectory;
        System.out.println(currentDirectory);
    }
}