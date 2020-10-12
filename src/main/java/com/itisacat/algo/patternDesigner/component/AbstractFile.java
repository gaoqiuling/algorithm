package com.itisacat.algo.patternDesigner.component;

public interface AbstractFile {
    void addFile(AbstractFile file);

    void removeFile(AbstractFile file);

    void killVirus();
}
