package smartdev.com.spring_boot_user_api.api.repository;

import smartdev.com.spring_boot_user_api.api.model.User;
import org.springframework.data.jpa.repository.Repository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long>{}