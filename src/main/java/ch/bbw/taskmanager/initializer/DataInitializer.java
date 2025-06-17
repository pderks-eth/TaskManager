package ch.bbw.taskmanager.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.bbw.taskmanager.model.Task;
import ch.bbw.taskmanager.repository.TaskRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TaskRepository repository;

    public DataInitializer(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Task(null, "Einkaufen gehen", false));
        repository.save(new Task(null, "Frühstück vorbereiten", true));
        repository.save(new Task(null, "Team-Meeting um 10 Uhr", false));
        repository.save(new Task(null, "Bericht schreiben", false));
        repository.save(new Task(null, "Code-Review durchführen", false));
        repository.save(new Task(null, "E-Mail beantworten", true));
        repository.save(new Task(null, "Deployment vorbereiten", false));
        repository.save(new Task(null, "Dokumentation aktualisieren", false));
        repository.save(new Task(null, "Unit-Tests schreiben", false));
        repository.save(new Task(null, "Feierabend planen", false));
    }
}