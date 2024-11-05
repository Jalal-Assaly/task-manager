package org.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskmanager.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
