package com.multifx.springpetclinicmultifx.services;

import com.multifx.springpetclinicmultifx.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}

