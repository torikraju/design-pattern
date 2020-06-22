package com.learnDesignPattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileReceiverReciverUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileReceiverReciverUtil.class);

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        logger.info("underlying os is: {}", osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }

    }
}
