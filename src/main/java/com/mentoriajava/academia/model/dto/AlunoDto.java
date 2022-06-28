package com.mentoriajava.academia.model.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDto extends PessoaDto{
    private Date dataMatricula;
    private String nivel;
    private int tempoDeAcademia;


}
