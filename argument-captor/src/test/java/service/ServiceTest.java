package service;

import client.Arguments;
import client.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest
{
    @Mock
    private Client client;

    @Captor
    private ArgumentCaptor<Arguments> argumentsCaptor;

    @InjectMocks
    private Service service;

    private static final String CLIENT_RESULT = "dummy_result";

    @Test
    public void callClient_should_use_arguments_with_expected_value()
    {
        when(client.call(argumentsCaptor.capture())).thenReturn(CLIENT_RESULT);

        service.callClient();

        Arguments arguments = argumentsCaptor.getValue();
        assertEquals("client input", arguments.getValue());
    }
}