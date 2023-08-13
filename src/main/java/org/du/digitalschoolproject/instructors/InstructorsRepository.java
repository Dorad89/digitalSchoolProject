package org.du.digitalschoolproject.instructors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorsRepository extends JpaRepository<InstructorEntity, Long> {
}
