package mapper;

import dto.CustomerDto;
import entity.CustomerEntity;

public class CustomerMapper
{
    public CustomerDto map(CustomerEntity customer)
    {
        CustomerDto customerDto = new CustomerDto();
        customerDto.uuid = customer.getUuid();
        customerDto.name = customer.getName();

        return customerDto;
    }
}
