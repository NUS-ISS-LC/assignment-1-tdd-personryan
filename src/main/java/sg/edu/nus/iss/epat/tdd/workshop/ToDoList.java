package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      // Add code here
      tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      // Add code here
   }

   public boolean getStatus(String description) {
      // Add code here
      Task task = tasks.get(description);
      boolean taskStatus = task.isComplete();
      return taskStatus;
   }

   public Task getTask(String description) {
      // Add code here
      Task task = tasks.get(description);
      return task;
   }

   public Task removeTask(String description) {
      // Add code here
      Task task = tasks.remove(description);
      return task;
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      java.util.List<Task> completed = new java.util.ArrayList<>();
      for (Task t : tasks.values()) {
         if (t != null && t.isComplete()) {
               completed.add(t);
         }
      }
      return completed;
   }
}
