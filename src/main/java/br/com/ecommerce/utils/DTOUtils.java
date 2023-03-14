package br.com.ecommerce.utils;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class DTOUtils {
    public static <T, U> T fromDTOToEntity(U source, Class<T> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(source, targetClass);
    }

    public static <T, U> U fromEntityToDTO(T source, Class<U> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(source, targetClass);
    }

    public static <T, U> List<U> fromEntityListToDTOList(List<T> source, Class<U> targetClass) {
        return source.stream().map(e -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(e, targetClass);
        }).collect(Collectors.toList());
    }
}
