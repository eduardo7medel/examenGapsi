package com.gapsi.examen.service.impl;

import com.gapsi.examen.domain.entity.Articulo;
import com.gapsi.examen.domain.repository.ArticuloRepository;
import com.gapsi.examen.dto.ArticuloDTO;
import com.gapsi.examen.dto.DeleteRequest;
import com.gapsi.examen.dto.ModifyRequest;
import com.gapsi.examen.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloRepository articuloRepository;

    public boolean addArticulo(ArticuloDTO request){
        Articulo articulo = new Articulo();
        if(request.getIdArticulo().length() < 10 || request.getIdArticulo().length() > 10){
            return false;
        }
        articulo.setIdArticulo(request.getIdArticulo());
        articulo.setNombre(request.getNombre());
        articulo.setDescripcion(request.getDescripcion());
        articulo.setPrecio(request.getPrecio());
        articulo.setModelo(request.getModelo());

        return (articuloRepository.save(articulo) != null) ? true : false;
    }

    public Collection<ArticuloDTO> getAll() {
        Collection<ArticuloDTO> result = new ArrayList<ArticuloDTO>();

        for ( Articulo articulo : articuloRepository.findAll() ) {
            result.add( new ArticuloDTO( articulo.getIdArticulo(),
                    articulo.getNombre(),
                    articulo.getDescripcion(),
                    articulo.getPrecio(),
                    articulo.getModelo() )
            );
        }

        return result;
    }

    public ArticuloDTO getById(String id) {
        Articulo articulo = articuloRepository.findById(id).get();
        return new ArticuloDTO( articulo.getIdArticulo(),
                articulo.getNombre(),
                articulo.getDescripcion(),
                articulo.getPrecio(),
                articulo.getModelo()
        );
    }

    public boolean modify(ModifyRequest request) {
        Optional<Articulo> articulo = articuloRepository.findById(request.getIdArticulo());
        if( articulo == null || !articulo.isPresent() ){
            return false;
        }

        articulo.get().setDescripcion(request.getDescripcion());
        articulo.get().setModelo(request.getModelo());
        return (articuloRepository.save( articulo.get() ) != null) ? true : false;
    }

    public boolean delete(DeleteRequest request) {
        articuloRepository.deleteById( request.getIdArticulo() );
        return true;
    }
}
