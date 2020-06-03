package main;

public class Configuration {

    enum osVersion
    {
        WINDOWS,
        UNIX
    }

    public static final String homeDir;
    public static osVersion currentVersion;

    static
    {
        String tempVersionName = System.getProperty("os.name");
        if(tempVersionName.contains("Windows"))
        {
            currentVersion = osVersion.WINDOWS;
        }
        else if(tempVersionName.contains("Linux"))
        {
            currentVersion = osVersion.UNIX;
        }

        homeDir = System.getProperty("user.home");
        System.out.println("homedir = " + homeDir);
        System.out.println("OSVersion = " + currentVersion);
    }
}
