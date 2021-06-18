package service.province;

import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IProvinceRepository;

import java.util.Optional;

public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> finById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }


}
