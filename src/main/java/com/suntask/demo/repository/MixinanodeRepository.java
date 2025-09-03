package com.suntask.demo.repository;
import com.suntask.demo.model.Mixinanode;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface MixinanodeRepository extends MongoRepository<Mixinanode, String> {
    List<Mixinanode> findByParam(String param);
}
