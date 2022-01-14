package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    private List<ToDo> todos = new ArrayList<>();

    public void addToDo(ToDo toDo){
        this.todos.add(toDo);
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder(){
        Deque<ToDo> todosInUrgencyOrder = new ArrayDeque<>();
        for (ToDo actual : todos) {
            if(actual.isUrgent()) {
                todosInUrgencyOrder.addFirst(actual);
            }else {
                todosInUrgencyOrder.addLast(actual);
            }
        }
        return todosInUrgencyOrder;
    }
}
