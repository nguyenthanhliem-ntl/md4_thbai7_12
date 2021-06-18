package service;

import model.Province;

import java.util.Optional;

public interface IGeneralService <T>{
    Iterable<T> findAll();

    Optional<T> finById(Long id);
    void save(T t);
    void remove(Long id);
}
