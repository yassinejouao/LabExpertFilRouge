package yass.jouao.labx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yass.jouao.labx.entities.TestType;
import yass.jouao.labx.entities.TestTypeReagent;

import java.util.List;
import java.util.Optional;

public interface ITestTypeReagentRepository extends JpaRepository<TestTypeReagent, Long>{
    List<TestTypeReagent> findAllByTestType(TestType testType);
    void deleteByTestType(TestTypeReagent testTypeReagent);
    boolean existsByTestType(TestTypeReagent testTypeReagent);
}
