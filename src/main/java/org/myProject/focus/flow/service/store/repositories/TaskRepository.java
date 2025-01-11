package org.myProject.focus.flow.service.store.repositories;

import org.myProject.focus.flow.service.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
