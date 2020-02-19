package by.bsuir.renTrip.repository;

import by.bsuir.renTrip.entity.Entity;
import by.bsuir.renTrip.repository.specification.QuerySpecification;
import by.bsuir.renTrip.repository.specification.UpdateSpecification;

import java.util.List;

public interface AbstractRepository<T extends Entity> {

    void save(T entity);

    void remove(T entity);

    List<T> query(QuerySpecification specification);

    void update(UpdateSpecification specification);
}



