package th.ac.ku.MicrochipsStarApp.API.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MicrochipsStarApp.API.service.model.PO;
import th.ac.ku.MicrochipsStarApp.API.service.service.POService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/PO")
public class POController {
    @Autowired
    private POService service;

    @GetMapping
    public List<PO> getAll() {
        return service.getAllPO();
    }

    @PostMapping
    public PO create(@RequestBody PO po) {
        return service.createPO(po);
    }

    @GetMapping("/{id}")
    public PO getCart(@PathVariable int id) {
        return service.getPO(id);
    }

    @PutMapping("/{id}")
    public PO update(@PathVariable int id, @RequestBody PO cart) {
        return service.updatePO(id, cart);
    }

    @DeleteMapping("/{id}")
    public PO delete(@PathVariable int id) {
        return service.deletePO(id);
    }




}
