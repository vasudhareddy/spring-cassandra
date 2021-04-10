package com.vasudha.springcassandra.repo;

import com.vasudha.springcassandra.entity.*;
import org.springframework.data.cassandra.repository.*;

public interface UserDataRepository extends CassandraRepository<UserData, Integer> {
}
