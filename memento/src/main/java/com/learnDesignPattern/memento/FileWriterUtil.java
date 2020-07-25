package com.learnDesignPattern.memento;


public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(fileName, content);
    }

    //restore to earlier sate
    public void undoToLastSave(Object o) {
        Memento memento = (Memento) o;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            //notice the deep copy so that memento and fileWriterUtil
            //content variables don't refer to save object
            this.content = new StringBuilder(content);
        }
    }


    @Override
    public String toString() {
        return "{" +
                "fileName=" + fileName +
                ", content=" + content +
                '}';
    }
}
