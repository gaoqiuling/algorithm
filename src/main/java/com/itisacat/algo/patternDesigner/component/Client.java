package com.itisacat.algo.patternDesigner.component;

public class Client {
    public static void main(String[] args) {
        Folder f = new Folder();
        f.addFile(new DocFile());
        f.addFile(new ImageFile());
        Folder f1 = new Folder();
        f1.addFile(f);
        f1.killVirus();
    }
}
