package service;

import client.Arguments;
import client.Client;
import org.mockito.Mock;

public class Service
{
    public static final String CLIENT_INPUT = "client input";

    @Mock
    private Client client;

    public String callClient()
    {
        Arguments arguments = new Arguments(CLIENT_INPUT);

        return client.call(arguments);
    }
}
