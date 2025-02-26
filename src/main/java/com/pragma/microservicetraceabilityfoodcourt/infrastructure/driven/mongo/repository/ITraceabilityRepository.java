package com.pragma.microservicetraceabilityfoodcourt.infrastructure.driven.mongo.repository;

import com.pragma.microservicetraceabilityfoodcourt.infrastructure.driven.mongo.document.TraceabilityDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityDocument, Long> {
    List<TraceabilityDocument> findAllByRestaurantNit(String restaurantNit);
    TraceabilityDocument findByOrderId(Long orderId);
}
