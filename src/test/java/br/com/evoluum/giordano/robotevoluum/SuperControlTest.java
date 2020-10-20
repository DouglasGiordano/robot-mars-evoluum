package br.com.evoluum.giordano.robotevoluum;


import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.web.servlet.MockMvc;

import javax.inject.Inject;
import java.io.IOException;

public class SuperControlTest {

    //variables used in mock
    @Inject
    protected MockMvc mvc;

    /**
     * Initializes the mock of web service resources.
     */
    @BeforeEach
    protected void setUp() throws Exception {
    }
}
