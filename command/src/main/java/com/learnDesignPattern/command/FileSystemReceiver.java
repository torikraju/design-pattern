package com.learnDesignPattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver {

    private static final Logger logger = LoggerFactory.getLogger(UnixFileSystemReceiver.class);

    @Override
    public void openFile() {
        logger.info("opening file in unix OS");
    }

    @Override
    public void writeFile() {
        logger.info("writing file in unix OS");
    }

    @Override
    public void closeFile() {
        logger.info("closing file in unix OS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

    private static final Logger logger = LoggerFactory.getLogger(WindowsFileSystemReceiver.class);

    @Override
    public void openFile() {
        logger.info("opening file in Windows");
    }

    @Override
    public void writeFile() {
        logger.info("writing file in Windows");
    }

    @Override
    public void closeFile() {
        logger.info("closing file in Windows");
    }
}
