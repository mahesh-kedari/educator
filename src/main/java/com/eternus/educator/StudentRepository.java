package com.eternus.educator;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eternus.educator.entity.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long>{	

}
