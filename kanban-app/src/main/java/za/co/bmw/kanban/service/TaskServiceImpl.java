package za.co.bmw.kanban.service;

import za.co.bmw.kanban.model.Task;
import za.co.bmw.kanban.model.TaskDTO;
import za.co.bmw.kanban.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    @Transactional
    public List<Task> getAllTasks() {
    }

    @Override
    @Transactional
    public Optional<Task> getTaskById(Long id) {
    }

    @Override
    @Transactional
    public Optional<Task> getTaskByTitle(String title) {
    }


    @Override
    @Transactional
    public Task saveNewTask(TaskDTO taskDTO) {
    }

    @Override
    @Transactional
    public Task updateTask(Task oldTask, TaskDTO newTaskDTO) {
    }

    @Override
    @Transactional
    public void deleteTask(Task task) {
    }

    private Task convertDTOToTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setColor(taskDTO.getColor());
        task.setStatus(taskDTO.getStatus());
        return task;
    }

    private Task updateTaskFromDTO(Task task, TaskDTO taskDTO){
        if(Optional.ofNullable(taskDTO.getTitle()).isPresent()){
            task.setTitle(taskDTO.getTitle());
        }

        if (Optional.ofNullable((taskDTO.getDescription())).isPresent()) {
            task.setDescription(taskDTO.getDescription());
        }

        if (Optional.ofNullable((taskDTO.getColor())).isPresent()) {
            task.setColor(taskDTO.getColor());
        }

        if (Optional.ofNullable((taskDTO.getStatus())).isPresent()) {
            task.setStatus(taskDTO.getStatus());
        }
        return task;
    }
}
