package ru.job4j.todo.store;

import lombok.AllArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * @author Vasiliy Novopashin
 * @version 1.0
 * {@code @date} 03.05.2023
 */

@Repository
@AllArgsConstructor
public class TaskStore {
    private final SessionFactory sf;
}
