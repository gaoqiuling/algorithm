package com.itisacat.algo.patternDesigner.component;

import com.google.common.collect.Lists;

import java.util.List;

public class Folder implements AbstractFile {
    private List<AbstractFile> files = Lists.newArrayList();

    @Override
    public void addFile(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void removeFile(AbstractFile file) {
        if (files.contains(file)) {
            file.removeFile(file);
        }
    }

    @Override
    public void killVirus() {
        files.forEach(t -> {
            t.killVirus();
        });
    }
}
