package com.gapsi.examen.service;

import com.gapsi.examen.dto.ArticuloDTO;
import com.gapsi.examen.dto.DeleteRequest;
import com.gapsi.examen.dto.ModifyRequest;

import java.util.Collection;

public interface ArticuloService {

    boolean addArticulo(ArticuloDTO request);

    Collection<ArticuloDTO> getAll();

    ArticuloDTO getById(String id);

    boolean modify(ModifyRequest request);

    boolean delete(DeleteRequest request);

}
