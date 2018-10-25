package com.multifx.springpetclinicmultifx.services.map;

import com.multifx.springpetclinicmultifx.model.Vet;
import com.multifx.springpetclinicmultifx.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long>  implements VetService {

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId() , object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
