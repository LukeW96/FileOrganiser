package FileOrganiser;

public class Configuration {

    public static final String osVersion;
    public static final String homeDir;

    static{
        osVersion = System.getProperty("os.name");
        homeDir = System.getProperty("user.home");
        System.out.println("homedir = " + homeDir);
    }
}
