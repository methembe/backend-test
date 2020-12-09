package za.co.bmw.kanban.service;

import za.co.bmw.kanban.model.Kanban;
import za.co.bmw.kanban.model.KanbanDTO;
import za.co.bmw.kanban.model.Task;
import za.co.bmw.kanban.model.TaskDTO;
import za.co.bmw.kanban.repository.KanbanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KanbanServiceImpl implements KanbanService {

    private final KanbanRepository kanbanRepository;

    @Override
    @Transactional
    public List<Kanban> getAllKanbanBoards() {
    }

    @Override
    @Transactional
    public Optional<Kanban> getKanbanById(Long id) {
    }

    @Override
    @Transactional
    public Optional<Kanban> getKanbanByTitle(String title) {
    }

    @Override
    @Transactional
    public Kanban saveNewKanban(KanbanDTO kanbanDTO) {
    }

    @Override
    @Transactional
    public Kanban updateKanban(Kanban oldKanban, KanbanDTO newKanbanDTO) {
        
    }

    @Override
    @Transactional
    public void deleteKanban(Kanban kanban) {
        
    }

    @Override
    @Transactional
    public Kanban addNewTaskToKanban(Long kanbanId, TaskDTO taskDTO) {
        
    }

    private Kanban convertDTOToKanban(KanbanDTO kanbanDTO){
        Kanban kanban = new Kanban();
        kanban.setTitle(kanbanDTO.getTitle());
        return kanban;
    }

    private Task convertDTOToTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setColor(taskDTO.getColor());
        task.setStatus(taskDTO.getStatus());
        return task;
    }
}
