package ubilapaz.edu.bo.template.repository;

import org.springframework.stereotype.Repository;
import ubilapaz.edu.bo.template.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
