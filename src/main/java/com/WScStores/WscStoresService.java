package com.WScStores;
import com.WScStores.WscStores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WscStoresService {

    @Autowired
    private WscStoresRepository wscStoresRepository;

    // Method to get all stores
    public List<WscStores> getAllStores() {
        return wscStoresRepository.findAll();
    }

    // Method to get a store by ID
    public Optional<WscStores> getStoreById(String id) {
        return wscStoresRepository.findById(id);
    }

    // Method to add a new store
    public WscStores addStore(WscStores store) {
        return wscStoresRepository.save(store);
    }

    // Method to update an existing store
    public WscStores updateStore(String id, WscStores updatedStore) {
        Optional<WscStores> existingStore = wscStoresRepository.findById(id);
        if (existingStore.isPresent()) {
            WscStores store = existingStore.get();
            store.setTablets(updatedStore.getTablets());
            store.setInjections(updatedStore.getInjections());
            store.setSyrups(updatedStore.getSyrups());
            store.setOintments(updatedStore.getOintments());
            store.setOthers(updatedStore.getOthers());
            return wscStoresRepository.save(store);
        }
        return null;
    }

    // Method to delete a store by ID
    public void deleteStore(String id) {
        wscStoresRepository.deleteById(id);
    }
}
