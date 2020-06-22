package com.learnDesignPattern.command;

public class Client {
    public static void main(String[] args) {
        //creating the receiver
        FileSystemReceiver fileSystemReceiver = FileReceiverReciverUtil.getUnderlyingFileSystem();

        //create the command with the associating reciver
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        //creating invoker and associate it with the command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        //perform action in invoker object
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();

    }
}
