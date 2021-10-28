package th.ac.ku.MicrochipsStarApp.API.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.MicrochipsStarApp.API.service.model.PO;
import th.ac.ku.MicrochipsStarApp.API.service.repository.PORepository;

import java.util.List;
import java.util.UUID;

@Service
public class POService {
    @Autowired
    private PORepository repository;

    public List<PO> getAllPO() {
        return repository.findAll();
    }

    public PO createPO(PO po) {
        repository.save(po);
        return po;
    }

    public PO getPO(UUID id) {
        return repository.findById(id).get();
    }

    public PO updatePO(UUID id, PO requestBody) {
        PO record = repository.findById(id).get();
        if (requestBody.getName_PO() != null)
            record.setName_PO(requestBody.getName_PO());

        if (requestBody.getAddress_PO() != null)
            record.setAddress_PO(requestBody.getAddress_PO());

        if (requestBody.getEmail_PO() != null)
            record.setEmail_PO(requestBody.getEmail_PO());

        if (requestBody.getTelephone_PO() != null)
            record.setTelephone_PO(requestBody.getTelephone_PO());

        if (requestBody.getProductName_PO() != null)
            record.setProductName_PO(requestBody.getProductName_PO());

        if (requestBody.getQuantity() > 0)
            record.setQuantity(requestBody.getQuantity());


        PO r = repository.save(record);

        return r;
    }

    public PO deletePO(UUID id) {
        PO record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }



}
