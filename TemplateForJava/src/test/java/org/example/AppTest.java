package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    private App app = new App();
   @Test
    public void TesteAdicao(){
       Assertions.assertEquals(2,app.adicao(1,1));
   }
}
