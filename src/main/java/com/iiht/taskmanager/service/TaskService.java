package com.iiht.taskmanager.service;

import java.util.List;

import com.iiht.taskmanager.model.Task;

public interface TaskService  {
	public Task addTask(Task task);
	public List<Task> getTasks();
	public Task updateTask(Task task);
	public Task getTaskById(long id);
}
