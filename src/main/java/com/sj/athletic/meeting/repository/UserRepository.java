package com.sj.athletic.meeting.repository;

import com.sj.athletic.meeting.entity.User;
import io.ebean.BeanRepository;
import io.ebean.EbeanServer;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author sunjian.
 */
@Repository
public class UserRepository extends BeanRepository<UUID, User> {
    /**
     * Create with the given bean type and EbeanServer instance.
     * <p>
     * Typically users would extend BeanRepository rather than BeanFinder.
     * </p>
     * <pre>{@code
     *
     *   @Inject
     *   public CustomerRepository(EbeanServer server) {
     *     super(Customer.class, server);
     *   }
     *
     * }</pre>
     *
     * @param server The EbeanServer instance typically created via Spring factory or equivalent
     */
    protected UserRepository(EbeanServer server) {
        super(User.class, server);
    }
}
