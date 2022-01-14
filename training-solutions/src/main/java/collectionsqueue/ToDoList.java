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

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.addToDo(new ToDo("a", true));
        toDoList.addToDo(new ToDo("b", true));
        toDoList.addToDo(new ToDo("c", false));
        toDoList.addToDo(new ToDo("d", false));
        toDoList.addToDo(new ToDo("e", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();

        System.out.println(result);

        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
    }
}
