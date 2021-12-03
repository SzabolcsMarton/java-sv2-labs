package interfaces.simpleTask;

import java.util.List;

public class SimpleTasks implements Runnable{

    private List<String > tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    private boolean nextStep(){
        if(tasks != null || !tasks.isEmpty()){
            tasks.remove(tasks.size() - 1);
        }
        return tasks.size() != 0;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()){
            nextStep();
        }
    }


}
