package project.Mock;

import home.project.DB.Entity.HomeTableEntity;
import home.project.DB.UserDAO.HomeTableUserDAO;
import io.cucumber.java.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.MockHandler;
import org.mockito.junit.MockitoRule;
import org.testng.annotations.Test;

import java.util.EventListener;

import static org.mockito.BDDMockito.*;

public class AuthorizationMock implements EventListener {
     HomeTableUserDAO mock = mock(HomeTableUserDAO.class);

    public void UserMock(InvocationOnMock invocationOnMock) throws Exception{
        String user = "test";
//        doReturn(user).when(mock.findData(1).getUsername());
//        given(mock.findData(anyInt()).getUsername()).willReturn(user);
        when(mock.findData(anyInt()).getUsername()).thenReturn(user);
//        verify(mock.findData(anyInt()).getUsername()).replaceAll("\\w", user);
        verify(mock, atLeastOnce()).findData(anyInt()).getUsername();

    }

    public void PassMock(InvocationOnMock invocationOnMock) throws Exception{
        String pass = "test";
//        when(mock.findData(1)).thenReturn(pass);
//        doReturn(pass).when(mock.findData(1).getPass());
        when(mock.findData(1).getPass()).thenReturn(pass);
        verify(mock.findData(1)).getPass();
    }

}
