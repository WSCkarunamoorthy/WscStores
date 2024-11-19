package com.WScStores;
import com.WScStores.WscStores;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WscStoresRepository extends MongoRepository<WscStores, String> {
}
