package mapper;

import dto.CustomerDto;
import entity.CustomerEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class CustomerMapperTest
{
    private static final String UUID_STRING = "10f1c0c5-03ea-4798-9fce-9d55b76ff3a8";

    private static final String NAME = "Test dummy name";

    private CustomerMapper mapper;

    @Before
    public void setUp() throws Exception
    {
        mapper = new CustomerMapper();
    }

    @Test
    public void map_should_map_name() throws Exception
    {
        CustomerEntity customer = createCustomerEntity();

        CustomerDto result = mapper.map(customer);

        assertEquals(NAME, result.name);
    }

    @Test
    public void map_should_map_uuid() throws Exception
    {
        CustomerEntity customer = createCustomerEntity();

        CustomerDto result = mapper.map(customer);

        assertEquals(UUID.fromString(UUID_STRING), result.uuid);
    }

    private CustomerEntity createCustomerEntity()
    {
        CustomerEntity customer = new CustomerEntity();

        customer.setName(NAME);
        customer.setUuid(UUID.fromString(UUID_STRING));

        return customer;
    }
}
