package com.itechsearch.company.repo;

        import com.itechsearch.company.model.Company;
        import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
