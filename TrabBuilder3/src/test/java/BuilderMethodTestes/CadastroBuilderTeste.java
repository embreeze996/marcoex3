package BuilderMethodTestes;


import org.example.Cadastro.Cadastro;
import org.example.Cadastro.CadastroBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroBuilderTeste {

    @Test
    void deveRetornarExcecaoParaCadastroSemCpf() {
        try {
            CadastroBuilder cadastroBuilder = new CadastroBuilder();
            Cadastro cadastro = cadastroBuilder
                    .setNome("Cadastro 1")
                    .setEmail("cadastro1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCadastroSemNome() {
        try {
            CadastroBuilder cadastroBuilder = new CadastroBuilder();
            Cadastro aluno = cadastroBuilder
                    .setCpf(1)
                    .setEmail("cadastro1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCadastroValido() {
        CadastroBuilder cadastroBuilder = new CadastroBuilder();
        Cadastro aluno = cadastroBuilder
                .setCpf(1)
                .setNome("Cadastro 1")
                .setEmail("cadastro1@email.com")
                .build();

        assertNotNull(aluno);
    }
}

