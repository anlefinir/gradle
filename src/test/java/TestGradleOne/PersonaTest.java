package TestGradleOne;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class PersonaTest {

    @Test
    public void personaIsNotNull(){
        Persona personita = new Persona(5);
        Assertions.assertThat(personita).isNotNull();
    }
}
