package com.itisacat.algo.patternDesigner.memento;

import com.itisacat.algo.patternDesigner.mediator.Mediator;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(IMemento memento) {
        String state = ((Memento) memento).getState();
        this.state = state;
    }

    private class Memento implements IMemento {
        private String state;

        private Memento(Originator originator) {
            this.state = originator.state;
        }

        private String getState() {
            return state;
        }
    }
}
