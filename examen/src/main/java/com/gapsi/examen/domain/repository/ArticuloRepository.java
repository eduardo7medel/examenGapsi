package com.gapsi.examen.domain.repository;

import com.gapsi.examen.domain.entity.Articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, String> {
}
