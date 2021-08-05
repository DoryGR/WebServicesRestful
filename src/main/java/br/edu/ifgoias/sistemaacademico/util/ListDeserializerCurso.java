package br.edu.ifgoias.sistemaacademico.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import br.edu.ifgoias.sistemaacademico.entities.Curso;

public class ListDeserializerCurso extends StdDeserializer<List<Curso>>{

	private static final long serialVersionUID = 1L;

	public ListDeserializerCurso() {
        this(null);
    }

    public ListDeserializerCurso(Class<?> vc) {
        super(vc);
    }

    @Override
    public List<Curso> deserialize(
      JsonParser jsonparser, 
      DeserializationContext context) 
      throws IOException, JsonProcessingException {
        
        return new ArrayList<>();
    }
}
