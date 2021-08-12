package br.edu.ifgoias.sistemaacademico.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import br.edu.ifgoias.sistemaacademico.entities.Aluno;

public class ListDeserializerAluno extends StdDeserializer<List<Aluno>>{

	private static final long serialVersionUID = 1L;

    public ListDeserializerAluno() {
        this(null);
    }

    public ListDeserializerAluno(Class<?> vc) {
        super(vc);
    }

    @Override
    public List<Aluno> deserialize(
      JsonParser jsonparser, 
      DeserializationContext context) 
      throws IOException, JsonProcessingException {
        
        return new ArrayList<>();
    }
}
