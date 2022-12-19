package xyz.ylx.design_pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// 象棋棋子备忘录管路类：负责人
public class MementoCaretaker {

    private List<ChessmanMemento> mementos = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementos.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementos.add(memento);
    }
}
