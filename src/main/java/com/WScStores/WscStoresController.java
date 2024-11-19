package com.WScStores;
import com.WScStores.WscStores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/wscstores")
public class WscStoresController {

    @Autowired
    private WscStoresService wscStoresService;

    // Endpoint to get all stores
    @GetMapping
    public List<WscStores> getAllStores() {
        return wscStoresService.getAllStores();
    }

    // Endpoint to get a store by ID
    @GetMapping("/{id}")
    public ResponseEntity<WscStores> getStoreById(@PathVariable String id) {
        Optional<WscStores> store = wscStoresService.getStoreById(id);
        return store.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint to add a new store
    @PostMapping
    public WscStores addStore(@RequestBody WscStores store) {
        return wscStoresService.addStore(store);
    }

    // Endpoint to update an existing store
    @PutMapping("/{id}")
    public ResponseEntity<WscStores> updateStore(@PathVariable String id, @RequestBody WscStores updatedStore) {
        WscStores store = wscStoresService.updateStore(id, updatedStore);
        if (store != null) {
            return ResponseEntity.ok(store);
        }
        return ResponseEntity.notFound().build();
    }

    // Endpoint to delete a store by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStore(@PathVariable String id) {
        wscStoresService.deleteStore(id);
        return ResponseEntity.noContent().build();
    }
}
