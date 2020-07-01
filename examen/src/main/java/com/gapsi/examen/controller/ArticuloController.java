package com.gapsi.examen.controller;

import com.gapsi.examen.dto.ArticuloDTO;
import com.gapsi.examen.dto.DeleteRequest;
import com.gapsi.examen.dto.GetByIdRequest;
import com.gapsi.examen.dto.ModifyRequest;
import com.gapsi.examen.service.ArticuloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@Api(value = "Articulo Service", tags="Articulo Controller") //anotation for swagger documentation api
public class ArticuloController {

    @Autowired
    ArticuloService articuloService;

    @ApiOperation(
            nickname = "Base Operation",
            value = "Base Example Operation",
            notes = "Here goes implementation notes...",
            response = boolean.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "WS working fine."),
            @ApiResponse(code = 401, message = "Unauthorized user."),
            @ApiResponse(code = 403, message = "Frobidden resource."),
            @ApiResponse(code = 404, message = "Resource not found.")
    })

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "insert")
    public @ResponseBody boolean insert(@RequestBody ArticuloDTO requestDTO) {
        return articuloService.addArticulo(requestDTO);
    }

    @ApiOperation(
            nickname = "Base Operation",
            value = "Base Example Operation",
            notes = "Here goes implementation notes...",
            response = ArticuloDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "WS working fine."),
            @ApiResponse(code = 401, message = "Unauthorized user."),
            @ApiResponse(code = 403, message = "Frobidden resource."),
            @ApiResponse(code = 404, message = "Resource not found.")
    })

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "getAll")
    public @ResponseBody Collection<ArticuloDTO> getAll() {
        return articuloService.getAll();
    }

    @ApiOperation(
            nickname = "Base Operation",
            value = "Base Example Operation",
            notes = "Here goes implementation notes...",
            response = ArticuloDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "WS working fine."),
            @ApiResponse(code = 401, message = "Unauthorized user."),
            @ApiResponse(code = 403, message = "Frobidden resource."),
            @ApiResponse(code = 404, message = "Resource not found.")
    })

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "getById")
    public @ResponseBody ArticuloDTO getById(GetByIdRequest requestDTO) {
        return articuloService.getById(requestDTO.getIdArticulo());
    }

    @ApiOperation(
            nickname = "Base Operation",
            value = "Base Example Operation",
            notes = "Here goes implementation notes...",
            response = boolean.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "WS working fine."),
            @ApiResponse(code = 401, message = "Unauthorized user."),
            @ApiResponse(code = 403, message = "Frobidden resource."),
            @ApiResponse(code = 404, message = "Resource not found.")
    })

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "modify")
    public @ResponseBody boolean modify( @RequestBody ModifyRequest requestDTO) {
        return articuloService.modify(requestDTO);
    }

    @ApiOperation(
            nickname = "Base Operation",
            value = "Base Example Operation",
            notes = "Here goes implementation notes...",
            response = boolean.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "WS working fine."),
            @ApiResponse(code = 401, message = "Unauthorized user."),
            @ApiResponse(code = 403, message = "Frobidden resource."),
            @ApiResponse(code = 404, message = "Resource not found.")
    })

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = "delete")
    public @ResponseBody boolean delete( @RequestBody DeleteRequest requestDTO) {
        return articuloService.delete(requestDTO);
    }

}
