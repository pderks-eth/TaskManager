package ch.bbw.TaskManager.repository;

import ch.bbw.TaskManager.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed); 
}
