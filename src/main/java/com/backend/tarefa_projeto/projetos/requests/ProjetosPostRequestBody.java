package com.backend.tarefa_projeto.projetos.requests;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Data
public class ProjetosPostRequestBody {
    private String nomeDoProjeto;
    private LocalDate dataDeInicio;
    private BigDecimal custoDoProjeto;
}