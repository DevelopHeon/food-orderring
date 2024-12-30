package com.food.ordering.system.kafka.consumer;

import org.apache.avro.specific.SpecificRecordBase;

import java.util.List;

/**
 * @author sony
 * @description
 * @since 2024.12.24
 **********************************************************************************************************************/
public interface KafkaConsumer<T extends SpecificRecordBase> {
    void receive(List<T> message,List<String> keys, List<Integer> partitions, List<Long> offsets);
}