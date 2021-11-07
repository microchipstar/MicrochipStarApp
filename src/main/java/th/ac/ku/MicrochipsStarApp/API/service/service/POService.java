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

    public PO getPO(int id) {
        return repository.findById(id).get();
    }

    public PO updatePO(int id, PO requestBody) {
        PO record = repository.findById(id).get();
        if (requestBody.getName_PO() != null)
            record.setName_PO(requestBody.getName_PO());

        if (requestBody.getAddress_PO() != null)
            record.setAddress_PO(requestBody.getAddress_PO());

        if (requestBody.getEmail_PO() != null)
            record.setEmail_PO(requestBody.getEmail_PO());

        if (requestBody.getStatus_PO() != null)
            record.setStatus_PO(requestBody.getStatus_PO());

        if (requestBody.getDate_PO() != null)
            record.setDate_PO(requestBody.getDate_PO());

        if (requestBody.getPhone_PO() != null)
            record.setPhone_PO(requestBody.getPhone_PO());

        if (requestBody.getPn_PO() != null)
            record.setPn_PO(requestBody.getPn_PO());

        if (requestBody.getEvidence_PO() != null)
            record.setEvidence_PO(requestBody.getEvidence_PO());


        if (requestBody.getQuantity_PO() > 0)
            record.setQuantity_PO(requestBody.getQuantity_PO());

        if (requestBody.getId_PO() > 0)
            record.setId_PO(requestBody.getId_PO());

        record.setTotal_price_PO(requestBody.getTotal_price_PO());
        PO r = repository.save(record);

        return r;
    }

    public PO deletePO(int id) {
        PO record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }



}
