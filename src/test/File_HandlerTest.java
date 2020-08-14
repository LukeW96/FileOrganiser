package test;

import FileOrganiser.File_Handler;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class File_HandlerTest {

    @TempDir
    Path temporaryFolder;

    File_Handler file_handler;
    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        file_handler = new File_Handler(temporaryFolder.toString());
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void create()
    {
        String filename = "TemporaryFile.txt";
        file_handler.create(filename);

        File f = new File(temporaryFolder.toString() +"/" + filename);

        assertTrue(f.exists());
    }

    @org.junit.jupiter.api.Test
    void getPermissions() {
    }
}