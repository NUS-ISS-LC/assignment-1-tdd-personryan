package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Collection;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

public class ToDoListTest  {
    // Define Test Fixtures
    ToDoList ToDoList;
    Task task1;
    Task task2;
    
    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        ToDoList = new ToDoList();
        task1 = new Task("Task1", true);
        task2 = new Task("Task2", false);
        ToDoList.addTask(task1);
        ToDoList.addTask(task2);
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
    }

    @Test
    public void testAddTask() {
        Task newTask = new Task("Sample Task");
        ToDoList.addTask(newTask);

        // Verify the task was added
        Task retrievedTask = ToDoList.getTask("Sample Task");
        assertEquals("Sample Task", retrievedTask.getDescription());
    }

    @Test
    public void testGetStatus() {
        // get status -> check status
        boolean task1Status = ToDoList.getStatus("Task1");
        boolean task2Status = ToDoList.getStatus("Task2");

        assertEquals(true, task1Status);
        assertEquals(false, task2Status);        
    }

    @Test
    public void testRemoveTask() {
        Task task = ToDoList.removeTask("Task1");

        assertEquals("Task1", task.getDescription());
    }

    @Test
    public void testGetCompletedTasks() {
        Collection<Task> tasks = ToDoList.getCompletedTasks();
        assertEquals(1, tasks.size());
    }
}